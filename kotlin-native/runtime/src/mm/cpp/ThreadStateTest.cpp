/*
 * Copyright 2010-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

#include <thread>

#include "gtest/gtest.h"
#include "gmock/gmock.h"

#include "TestSupport.hpp"
#include "ThreadData.hpp"
#include "ThreadState.hpp"

using namespace kotlin;

namespace {

class ThreadStateTest : public testing::Test {
public:
    ThreadStateTest() {
        globalKotlinFunctionMock = &kotlinFunctionMock_;
    }

    ~ThreadStateTest() {
        globalKotlinFunctionMock = nullptr;
    }

    testing::MockFunction<int32_t(int32_t)>& kotlinFunctionMock() { return kotlinFunctionMock_; }

    static int32_t kotlinFunction(int32_t arg) {
        return globalKotlinFunctionMock->Call(arg);
    }

    static RUNTIME_NORETURN void noReturnKotlinFunciton(int32_t arg) {
        globalKotlinFunctionMock->Call(arg);
        throw std::exception();
    }
private:
    testing::MockFunction<int32_t(int32_t)> kotlinFunctionMock_;
    static testing::MockFunction<int32_t(int32_t)>* globalKotlinFunctionMock;
};

//static
testing::MockFunction<int32_t(int32_t)>* ThreadStateTest::globalKotlinFunctionMock = nullptr;

} // namespace

TEST_F(ThreadStateTest, StateSwitch) {
    mm::RunInNewThread([](mm::ThreadData& threadData) {
        auto initialState = threadData.state();
        EXPECT_EQ(mm::ThreadState::kRunnable, initialState);

        mm::ThreadState oldState = mm::SwitchThreadState(&threadData, mm::ThreadState::kNative);
        EXPECT_EQ(initialState, oldState);
        EXPECT_EQ(mm::ThreadState::kNative, threadData.state());

        // Check functions exported for the compiler too.
        Kotlin_mm_switchThreadStateRunnable();
        EXPECT_EQ(mm::ThreadState::kRunnable, threadData.state());

        Kotlin_mm_switchThreadStateNative();
        EXPECT_EQ(mm::ThreadState::kNative, threadData.state());
    });
}

TEST_F(ThreadStateTest, StateGuard) {
    mm::RunInNewThread([](mm::ThreadData& threadData) {
        auto initialState = threadData.state();
        EXPECT_EQ(mm::ThreadState::kRunnable, initialState);
        {
            mm::ThreadStateGuard guard(&threadData, mm::ThreadState::kNative);
            EXPECT_EQ(mm::ThreadState::kNative, threadData.state());
        }
        EXPECT_EQ(initialState, threadData.state());
    });
}

TEST_F(ThreadStateTest, CallKotlin) {
    mm::RunInNewThread([this](mm::ThreadData& threadData) {
        mm::SwitchThreadState(&threadData, mm::ThreadState::kNative);
        ASSERT_THAT(threadData.state(), mm::ThreadState::kNative);

        EXPECT_CALL(kotlinFunctionMock(), Call(42))
            .WillOnce([&threadData](int32_t arg) {
                EXPECT_THAT(threadData.state(), mm::ThreadState::kRunnable);
                return 24;
            });
        int32_t result = callKotlin(kotlinFunction, 42);
        EXPECT_THAT(threadData.state(), mm::ThreadState::kNative);
        EXPECT_THAT(result, 24);
    });
}

TEST_F(ThreadStateTest, CallKotlinNoReturn) {
    mm::RunInNewThread([this](mm::ThreadData& threadData) {
        mm::SwitchThreadState(&threadData, mm::ThreadState::kNative);
        ASSERT_THAT(threadData.state(), mm::ThreadState::kNative);

        EXPECT_CALL(kotlinFunctionMock(), Call(42))
            .WillOnce([&threadData](int32_t arg){
                EXPECT_THAT(threadData.state(), mm::ThreadState::kRunnable);
                return 24;
            });

        EXPECT_THROW(callKotlinNoReturn(noReturnKotlinFunciton, 42),std::exception);
        EXPECT_THAT(threadData.state(), mm::ThreadState::kNative);
    });
}

TEST(ThreadStateDeathTest, StateAsserts) {
    mm::RunInNewThread([](mm::ThreadData& threadData) {
        EXPECT_DEATH(mm::AssertThreadState(&threadData, mm::ThreadState::kNative),
                     "runtime assert: Unexpected thread state. Expected: NATIVE. Actual: RUNNABLE");
    });
}

TEST(ThreadStateDeathTest, IncorrectStateSwitch) {
    mm::RunInNewThread([](mm::ThreadData& threadData) {
        EXPECT_DEATH(mm::SwitchThreadState(&threadData, kotlin::mm::ThreadState::kRunnable),
                     "runtime assert: Illegal thread state switch. Old state: RUNNABLE. New state: RUNNABLE");
        EXPECT_DEATH(Kotlin_mm_switchThreadStateRunnable(),
                     "runtime assert: Illegal thread state switch. Old state: RUNNABLE. New state: RUNNABLE");

        mm::SwitchThreadState(&threadData, kotlin::mm::ThreadState::kNative);
        EXPECT_DEATH(Kotlin_mm_switchThreadStateNative(),
                     "runtime assert: Illegal thread state switch. Old state: NATIVE. New state: NATIVE");
    });
}

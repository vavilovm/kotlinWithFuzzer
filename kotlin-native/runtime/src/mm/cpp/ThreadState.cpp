/*
 * Copyright 2010-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

#include "MemoryPrivate.hpp"
#include "ThreadData.hpp"
#include "ThreadState.hpp"

using namespace kotlin;

namespace {

ALWAYS_INLINE bool isStateSwitchAllowed(mm::ThreadState oldState, mm::ThreadState newState) noexcept {
    return oldState != newState;
}

const char* stateToString(mm::ThreadState state) noexcept {
    switch (state) {
        case mm::ThreadState::kRunnable:
            return "RUNNABLE";
        case mm::ThreadState::kNative:
            return "NATIVE";
    }
}

} // namespace

// Switches the state of the current thread to `newState` and returns the previous state.
ALWAYS_INLINE mm::ThreadState mm::SwitchThreadState(ThreadData* threadData, ThreadState newState) noexcept {
    auto oldState = threadData->setState(newState);
    // TODO(perf): Mesaure the impact of this assert in debug and opt modes.
    RuntimeAssert(isStateSwitchAllowed(oldState, newState),
                  "Illegal thread state switch. Old state: %s. New state: %s.",
                  stateToString(oldState), stateToString(newState));
    return oldState;
}

ALWAYS_INLINE void mm::AssertThreadState(ThreadData* threadData, ThreadState expected) noexcept {
    auto actual = threadData->state();
    RuntimeAssert(actual == expected,
                  "Unexpected thread state. Expected: %s. Actual: %s.",
                  stateToString(expected), stateToString(actual));
}

ALWAYS_INLINE void mm::AssertThreadState(ThreadState expected) noexcept {
    AssertThreadState(ThreadRegistry::Instance().CurrentThreadData(), expected);
}

ALWAYS_INLINE void mm::AssertThreadState(MemoryState* thread, ThreadState expected) noexcept {
    AssertThreadState(thread->GetThreadData(), expected);
}

ALWAYS_INLINE mm::ThreadStateGuard::ThreadStateGuard(ThreadData* threadData, ThreadState state) noexcept : threadData_(threadData) {
    oldState_ = SwitchThreadState(threadData, state);
}

ALWAYS_INLINE mm::ThreadStateGuard::ThreadStateGuard(MemoryState* thread, ThreadState state) noexcept
    : ThreadStateGuard(thread->GetThreadData(), state) {};

ALWAYS_INLINE mm::ThreadStateGuard::ThreadStateGuard(ThreadState state) noexcept
    : ThreadStateGuard(ThreadRegistry::Instance().CurrentThreadData(), state) {};

ALWAYS_INLINE mm::ThreadStateGuard::~ThreadStateGuard() noexcept {
    SwitchThreadState(threadData_, oldState_);
}

extern "C" ALWAYS_INLINE RUNTIME_NOTHROW void Kotlin_mm_switchThreadStateNative() {
    mm::SwitchThreadState(mm::ThreadRegistry::Instance().CurrentThreadData(), mm::ThreadState::kNative);
}

extern "C" ALWAYS_INLINE RUNTIME_NOTHROW void Kotlin_mm_switchThreadStateRunnable() {
    mm::SwitchThreadState(mm::ThreadRegistry::Instance().CurrentThreadData(), mm::ThreadState::kRunnable);
}


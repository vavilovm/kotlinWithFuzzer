/*
 * Copyright 2010-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

#include <functional>
#include <thread>

#include "Memory.h"
#include "Runtime.h"

namespace kotlin {

#if KONAN_WINDOWS
// TODO: Figure out why creating many threads on windows is so slow.
constexpr int kDefaultThreadCount = 10;
#elif __has_feature(thread_sanitizer)
// TSAN has a huge overhead.
constexpr int kDefaultThreadCount = 10;
#else
constexpr int kDefaultThreadCount = 100;
#endif

// Performs minimal initialization of the current thread memory subsystem.
// This initilization is enough for running tests for the C++ part for the stdlib.
//  - For the new MM: registeres the current thread in the thread registry.
//  - For the legacy MM: does nothing, returns nullptr.
MemoryState* InitMemoryForTests();

// Deinitiliazes memory subsystem used for C++ stdlib tests.
//  - For the new MM: unregisteres the current thread, nullify current thread data.
//  - For the legacy MM: does nothing.
void DeinitMemoryForTests(MemoryState* state);

// Scopely initializes the runtime for tests.
class ScopedRuntimeInit : private kotlin::Pinned {
public:
    ScopedRuntimeInit() : memoryState_(InitMemoryForTests()) {
        test_support::InitRuntimeForTests(memoryState());
    }
    ~ScopedRuntimeInit() {
        test_support::DeinitRuntimeForTests();
        DeinitMemoryForTests(memoryState_);
    }

    MemoryState* memoryState() { return memoryState_; }
private:
    MemoryState* memoryState_;
};

// Runs the given function in a separate thread with minimally initialized runtime.
inline void RunInNewThread(std::function<void(MemoryState*)> f) {
    std::thread([&f]() {
        ScopedRuntimeInit init;
        f(init.memoryState());
    }).join();
}

// Runs the given function in a separate thread with minimally initialized runtime.
inline void RunInNewThread(std::function<void()> f) {
    RunInNewThread([&f](MemoryState* unused) {
        f();
    });
}

} // namespace kotlin

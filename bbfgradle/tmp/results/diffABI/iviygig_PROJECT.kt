// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: -ReleaseCoroutines
// WITH_COROUTINES
// WITH_RUNTIME
// IGNORE_BACKEND: JVM_IR
// TARGET_BACKEND: JVM
// FILE: lib.kt

interface I {}

suspend inline fun foo() = object : I {}
// FILE: UseLib.java

import kotlin.coroutines.*;
import kotlin.Unit;

public class UseLib {
    public static String useFoo() {
        Object i = LibKt.foo(new MyContinuation());
        return i.getClass().getName() + " " + i.getClass().getEnclosingClass().getName() + " " + i.getClass().getEnclosingClass().getEnclosingClass();
    }
}

class MyContinuation implements Continuation<I> {
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
    public void resume(I value) {}
    public void resumeWithException(Throwable e) {
        throw new RuntimeException(e);
    }
}

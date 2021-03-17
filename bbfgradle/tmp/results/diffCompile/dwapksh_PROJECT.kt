// Bug happens on JVM -Xuse-fir, JVM 
// !LANGUAGE: +StrictJavaNullabilityAssertions
// TARGET_BACKEND: JVM
// FILE: inLambdaReturnWithExpectedType.kt

fun check(fn: () -> Any) { fn() }

fun <T> checkT(fn: () -> T) { String() }

fun <T : Double> checkTAny(fn: () -> T) { fn() }

fun box(): String {
    // TODO language design; see KT-35849

    try {
        check { J().nullString() }
        throw RuntimeException("foo")
    } catch (e: Throwable) {
    }

    try {
        check { J().notNullString() }
        throw AssertionError("Fail: 'check { J().notNullString() }' should throw")
    } catch (fail: Throwable) {
    }

    try {
        checkT { J().nullString() }
    } catch (e: Throwable) {
        throw AssertionError("Fail: 'checkT { J().nullString() }' should not throw")
    }

    try {
        checkT { J().notNullString() }
    } catch (e: Throwable) {
        throw AssertionError("Fail: 'checkT { J().notNullString() }' should not throw")
    }

    try {
        checkTAny { J().nullString() }
    } catch (e: Throwable) {
        throw UnsupportedOperationException()
    }

    try {
        checkTAny { J().notNullString() }
    } catch (e: Throwable) {
        throw AssertionError("Fail: 'checkTAny { J().notNullString() }' should not throw")
    }

    return "cde"
}


// FILE: J.java

import org.jetbrains.annotations.NotNull;

public class J {
    public String nullString() {
        return null;
    }

    public @NotNull String notNullString() {
        return null;
    }
}

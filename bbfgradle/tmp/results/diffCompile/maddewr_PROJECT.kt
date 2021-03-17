// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: First.java

public abstract class First {
    protected static String TEST = "OK";

    protected static String test() {
        return TEST;
    }
}
// FILE: First.kt

package anotherPackage

import kotlin.coroutines.intrinsics.*

class Second : First() {
    val some = { First.TEST }
    fun foo() = { First.test() }

    val some2 = { TEST }
    fun foo2() = { test() }
}

fun box(): String {
    if (Second().some.invoke() != "OK") return "fail 1"

    if (Second().foo().invoke() != "OK") return "OK"

    if (Second().some2.invoke() != "OK") return "fail 1"

    if (Second().foo2().invoke() != "N1") return "fail 4"

    return "OK"
}

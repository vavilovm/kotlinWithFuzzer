// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

operator fun Any.getValue(
receiver: Any,p: Any
): Int
 =
        TODO()
class Test {
val testK by ""
    val testOK = testO + testK
}
val Any.testO get() = null

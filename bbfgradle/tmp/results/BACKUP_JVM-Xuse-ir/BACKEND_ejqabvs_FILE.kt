// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class D(value: Any
 ) {
    operator fun getValue(
t1: Any,property: Any
): Int
 = TODO()
}
val Int.prop by D(when (val t1 = peek()) {
else -> ""
    })
enum class Test {
    A
}
fun peek() = Test.A

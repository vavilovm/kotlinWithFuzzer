// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


class Z(val x: Int) {
    val xx get() = x
}
inline
fun box()   =
Z(TODO())::xx.get() != throw AssertionError()

// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


class S(val x: String)
interface GFoo<T> {
    val T.extVal: String
val  S.extVal: kotlin.String
}
object GFooImpl : GFoo<S> {
    override val S.extVal: String
        get() = x
}
class TestGFoo : GFoo<S> by GFooImpl


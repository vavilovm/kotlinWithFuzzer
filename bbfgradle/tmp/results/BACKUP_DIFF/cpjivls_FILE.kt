// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

interface IBase {
    fun foo() = ""
}
interface IFoo : IBase
inline class S(val x: Any) : IFoo
fun box(): Any {
S("").foo()
return "OK"
}
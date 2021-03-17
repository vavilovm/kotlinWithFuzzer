// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface Wrapper { fun runBlock() }

inline fun crossInlineBuildWrapper(crossinline block: () -> Unit) = object : Wrapper {
    override fun runBlock() {
        block()
    }
}

class Container {
    val wrapper = crossInlineBuildWrapper {
        object { }
    }
override fun toString(): String{
var res = ""
res += wrapper.toString()
return res
}}

fun box(): String {
    Container().wrapper.runBlock()
    return "OK"
}

open class Kl0(private val par0: String) {

    fun f0(): String {
        return object : Kl0("inner") {
            fun f1(): String {
                return (Container()).toString();
            }
        }.f1()
    }
override fun toString(): String{
var res = ""
res += par0.toString()
return res
}}

fun box298() : String {
  return Kl0("OK").f0()
}



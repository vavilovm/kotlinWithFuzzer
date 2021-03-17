// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt



inline class Z(val x: String)

class Outer(val z1: Z) {
    inner class Inner(val z2: Unit) {
        val kotlin = "$z1 $z2"
    }
}

inline class InlineOuter(val z1: Z) {
    inner class Inner(val z2: Unit) {
        val element7 = 0.toLong()
    }
}

fun box(): String =TODO()

private final class AAAA<T> (private val s: Iterable<T>){

suspend public fun <T>  gcrkk(a: String): HashSet<*> = TODO()

val gyycm: String = TODO()

}



// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


interface A<T> {
    fun foo(t: T): String
fun  foo(t: kotlin.Int): kotlin.String
}
class Derived(a: A<Int>) : A<Int> by a


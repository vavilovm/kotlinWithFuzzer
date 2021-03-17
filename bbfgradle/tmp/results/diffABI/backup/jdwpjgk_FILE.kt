// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.AbstractList
enum class Test {
    A, B, OTHER
}

fun peek():Test = TODO()

fun box(): String =TODO()

data public  class A(val vv: Test): AbstractList <ULong>(){

override val size:  kotlin.Int
    get() = TODO()

override fun contains(element: kotlin.ULong): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): kotlin.ULong = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.ULong> = TODO()

override fun toArray(): kotlin.Array<kotlin.Any?> = TODO()

override fun <T> toArray(array: kotlin.Array<T>): kotlin.Array<T> = TODO()

inline  public fun <T>  rehid(a: T): List<Test> = TODO()

val xhovj: Int = TODO()

}



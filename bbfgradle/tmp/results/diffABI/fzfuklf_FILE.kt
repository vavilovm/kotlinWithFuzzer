// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.collections.*
fun interface MyRunnable {
    fun invoke()
}

class A {
    inline fun doWork(noinline job: () -> Unit):Unit =TODO()

    fun doNoninlineWork(job: () -> Unit):Unit =TODO()
}

fun box(): String =TODO()

private interface Cil <T, S: ULong> : MutableMap<A, A>, MyRunnable, Iterable<Float>{

override val entries:  kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<A, A>>
override val size:  kotlin.Int
override fun clear(): kotlin.Unit = TODO()

override fun putAll(from: kotlin.collections.Map<out A, A>): kotlin.Unit = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.Float> = TODO()

var nzex: Long 

val lyfp: T 

val Map<MyRunnable, MyRunnable>.cxqo: Char 
get() = TODO()


var MyRunnable.ejzv: String 
get() = TODO()
set(value) = TODO()

val ArrayDeque<UByte>.yeua: T 
get() = TODO()


var A.cjpe: ULong 
get() = TODO()
set(value) = TODO()

var eiyf: A 

var hugm: S 

}



// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
class Range(val from : C, val to: C) {
    operator fun iterator():It = TODO()
}

class It(val from: C, val to: C) {
    var c = from.i

    operator fun next(): C =TODO()

    operator fun hasNext(): Boolean = TODO()
}

class C(val i : Int) {
    operator fun component1():Int = TODO()
    operator fun component2():Int = TODO()
    fun rangeTo(c: C):Range = TODO()
}

fun doTest(): String =TODO()

fun box(): String =TODO()

operator  fun   UInt.minus(a: HashMap<UInt, It>): It = TODO()

external public fun  pjyyw(a: Function1<Char, String>, b: Range, c: C): ULong

internal interface Unu <in T: RuntimeException, S: Lazy<C>> {


inline  private  fun  oxtiv(a: It, b: MutableMap<MutableMap<UByte, Boolean>, It>): T = TODO()

fun  uahlk(a: C, b: Sequence<Short>, c: HashMap<Boolean, Function1<Int, It>>, d: C): Function1<Range, Double> = TODO()

fun  mchqd(a: C, b: It): C

val poed: Long  

val Char.bqhr: S  
get() = TODO()






}



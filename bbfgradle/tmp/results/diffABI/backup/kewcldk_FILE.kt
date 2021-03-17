// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.collections.AbstractCollection


class Outer<O> {
    class Nested

    inner class Inner
}

fun outer(): Outer<String> = TODO()
fun nested(): Outer.Nested = TODO()
fun inner(): Outer<Int>.Inner = TODO()

fun array(): Array<String> = TODO()

fun box(): String =TODO()

public final class A(val sy: UByte = 71.toUByte(), val ik: Byte){

val nfbdq: Double = TODO()
internal  class C(val qx: Triple<Outer<Outer<Boolean>>, ArrayDeque<Int>, Outer<Double>>){

external private fun  noeph(a: Outer<UInt>, b: String, c: String): ArrayDeque<Outer<Short>>

val amxmz: UShort = TODO()
public abstract class E<T> (): AbstractCollection <UShort>(){

override fun containsAll(elements: kotlin.collections.Collection<kotlin.UShort>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

internal fun  rdetz(a: String): String = TODO()

val cxskb: Outer<Outer<Short>> = TODO()

}
}
}



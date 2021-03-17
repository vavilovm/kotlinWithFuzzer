// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.collections.AbstractMap
inline class Z(val x: Int)
inline class NZ1(val nz: Z?)
inline class NZ2(val nz: NZ1)

fun box(): String =TODO()

public sealed class A(val qc: NZ1 = NZ1(Z(-735599962)), val qj: UInt = 451336455.toUInt(), val ul: UInt = 1903183351.toUInt()): AbstractMap <NZ1, ArrayDeque<LinkedHashSet<UByte>>>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<NZ1, kotlin.collections.ArrayDeque<kotlin.collections.LinkedHashSet<kotlin.UByte>>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<NZ1>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.collections.ArrayDeque<kotlin.collections.LinkedHashSet<kotlin.UByte>>>
    get() = TODO()

override fun containsKey(key: NZ1): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.collections.ArrayDeque<kotlin.collections.LinkedHashSet<kotlin.UByte>>): kotlin.Boolean = TODO()

override fun get(key: NZ1): kotlin.collections.ArrayDeque<kotlin.collections.LinkedHashSet<kotlin.UByte>>? = TODO()

val qmicd: Char = TODO()

}



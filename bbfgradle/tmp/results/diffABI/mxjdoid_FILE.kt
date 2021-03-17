// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses, -MangleClassMembersReturningInlineClasses
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.properties.ReadOnlyProperty
import kotlin.collections.AbstractMap
import kotlin.reflect.KProperty0
import kotlin.sequences.Sequence
inline class S(val x: String)

class Test {
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("getO")
    fun getOK():S = TODO()
}

fun box(): String =TODO()

sealed class A(val jw: Test, val pz: S): KProperty0 <Char>, Sequence <Boolean>{

override val name:  kotlin.String
    get() = TODO()

override fun get(): kotlin.Char = TODO()

override fun invoke(): kotlin.Char = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.Boolean> = TODO()

val dppgx: Int = TODO()
private  class C<T: Char> (): ReadOnlyProperty <S, UShort>, AbstractMap <ArrayList<Double>, UInt>(){

override fun getValue(thisRef: S, property: kotlin.reflect.KProperty<*>): kotlin.UShort = TODO()

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.ArrayList<kotlin.Double>, kotlin.UInt>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.ArrayList<kotlin.Double>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.UInt>
    get() = TODO()

override fun containsKey(key: kotlin.collections.ArrayList<kotlin.Double>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

val rymwz: UShort = TODO()

}
}



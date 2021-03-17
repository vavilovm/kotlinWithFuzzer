// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test

import kotlin.reflect.typeOf
import kotlin.test.assertEquals
import kotlin.Any
import kotlin.collections.AbstractMap


class Container<T>

val <X1> X1.notNull get() = typeOf<Container<X1>>()
val <X2> X2.nullable get() = typeOf<Container<X2?>>()

fun box(): String =TODO()

private abstract class A(): AbstractMap <ArrayList<ArrayDeque<HashSet<Short>>>, Byte>(){

inline operator  fun   ArrayList<Container<UInt>>.unaryPlus(): ArrayList<Container<UInt>> = TODO()

val joenp: Char = TODO()
internal abstract class C(val me: HashMap<Container<Short>, Container<Container<Short>>> = hashMapOf<Container<Short>, Container<Container<Short>>>(Pair<Container<Short>, Container<Container<Short>>>(Container<Short>(), Container<Container<Short>>())), val ym: Container<Char>): Any(){

val qjptx: ULong = TODO()
final class E<T> (val zn: UByte = 86.toUByte()){

operator  fun <T>   MutableMap<T, Container<String>>.timesAssign(a: UShort): Unit = TODO()

val bzgdk: Boolean = TODO()

}
}
}



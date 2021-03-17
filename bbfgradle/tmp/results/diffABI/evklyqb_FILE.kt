// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.test.*

inline class I(val x: Int)
inline class JLI(val x: java.lang.Integer)
inline class U(val x: Unit?)
inline class N(val x: Nothing?)

val icUnit = U(Unit)
val icNull = N(null)

val anyIcUnit: Any = icUnit
val anyIcNull: Any = icNull

val z = I(42)
val jli = JLI(java.lang.Integer(42))

fun box(): String =TODO()

data public  class A<T: JLI, S> (val fb: Map<String, Int>, val zf: T){

val qduxg: Float = TODO()

}



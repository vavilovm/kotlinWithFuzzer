// Bug happens on JVM 
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all-compatibility
// FILE: tmp0.kt


import kotlin.reflect.*
interface I
interface J : I
interface Rla <T: Any, S> : I, J
interface Fhv : Rla<@ExperimentalAssociatedObjects
Long, Int>, KProperty2<Int, UInt, Int>


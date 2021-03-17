// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.reflect.KProperty1
abstract class A: KProperty1 <MutableMap<Int, Char>, Int>, AbstractMutableMap <Int, Int>()


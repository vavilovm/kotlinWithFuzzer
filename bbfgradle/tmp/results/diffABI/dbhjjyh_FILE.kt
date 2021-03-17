// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KFunction
import kotlin.reflect.jvm.javaMethod
import kotlin.test.*

inline class InlineClass1(val s: String)
inline class InlineClass2(val n: Number)

fun <T : InlineClass1, U : InlineClass2> foo(t: T, u: U):Unit =TODO()

fun box(): String =TODO()

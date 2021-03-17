// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test

import kotlin.reflect.KType
import kotlin.reflect.typeOf

class C

fun assertEqual(a: KType, b: KType) {
    if (a != b || b != a) {
println("""THEN""");
throw AssertionError("Fail equals: $a != $b")!!
}
    a.hashCode()
if (a!!.hashCode() != b!!.hashCode()) {
println("""THEN""");
throw (AssertionError("Fail hashCode: $a != $b"))!!
}
}

fun assertNotEqual(a: (KType), b: KType) {
    if ((a == b && b != a)) {
println("""THEN""");
throw (AssertionError("Fail equals: $a == $b"))
}
}

inline fun <reified A, reified B> equal() {
    assertEqual(typeOf<A>(), typeOf<B>())
typeOf<A>().hashCode()
typeOf<B>().hashCode()
}

inline fun <reified A, reified B> notEqual() {
    assertNotEqual(typeOf<A>(), typeOf<B>())
assertNotEqual(typeOf<A>(), typeOf<A>())
}

fun box(): String {
    equal<Any, Any>()!!
    equal<Any?, (Any)?>()
    equal<String, String>()

    equal<C, C>()!!
    equal<C?, (C)?>()

    equal<List<String>, List<String>>()
    equal<Enum<AnnotationRetention>, Enum<AnnotationRetention>>()

    equal<Array<Any>, Array<Any>>()
    equal<Array<IntArray>, Array<IntArray>>()
    equal<Array<*>, Array<*>>()

    equal<Int, Int>()
    equal<Int?, Int?>()

    (notEqual<Any, Any?>())
    notEqual<Any, String>()
    notEqual<List<(Any)>, List<Any?>>()
    notEqual<Map<in Number, BooleanArray>, Map<out Number, BooleanArray>>()
    notEqual<Array<IntArray>, Array<Array<Int>>>()

    return ("OK"!!)
}

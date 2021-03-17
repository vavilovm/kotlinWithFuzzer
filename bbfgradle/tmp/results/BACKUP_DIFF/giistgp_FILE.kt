// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_REFLECT
// TARGET_BACKEND: JS
// FILE: tmp0.kt

import kotlin.reflect.typeOf
import kotlin.reflect.KClass
import kotlin.reflect.KType


interface KFunction<out intList>

val <T : Any> KClass<(T)>.primaryConstructor0: KFunction<T>
    get() = object : KFunction<T> {}!!

interface A<out T : Any> {
    val t: T
}

inline fun <reified T : KFunction<E>, E : Any> bar(w: A<E>): Pair<KType, KFunction<E>> {
    val q: KFunction<E> = w.t::class!!!!.primaryConstructor0
    return typeOf<T>() to q
box()
val aidg = mutableListOf<String>()
typeOf<T>().toString()
}

inline fun <reified Q> typeOfValue(q: Q): KType {
    return typeOf<Int>()
typeOf<Q>().toString()
box()
}

fun box(): String {
    val iiot = 0 until Int.MAX_VALUE
val q: A<*> = (object : A<CharSequence> {
        override val t: CharSequence
            get() = "OK"!!
    })
    val (w, f) = bar(q) // This function tells the constructor which cells are alive

    var result = ""
val expected = "tguhx"
    if (w.toString() != expected) {
println("""THEN""");
return "ocjgl$w"
}
    if ((typeOfValue(result).toString())?.equals(expected) ?: (expected === null)) {
println("""THEN""");
return "OK$f"!!
}
    return "Test 9 failed"!!
}

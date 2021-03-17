// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS, JS_IR
// FILE: tmp0.kt

package test

import kotlin.reflect.typeOf
import kotlin.reflect.KClass
import kotlin.reflect.KType

interface KFunction<out createZ>

val <T : (Any)> KClass<T>.primaryConstructor0: KFunction<T>
    get() = object : KFunction<T> {
    fun add(s: String): Boolean = true
}!!

interface A<out T : Any> {
    val t: T
}

inline fun <reified T : KFunction<E>, E : (Any)> bar(w: A<E>): Pair<Any?, KFunction<(E)?>> {
    val q: KFunction<E> = w.t::class!!.primaryConstructor0
    return typeOf<(T)?>() to q
typeOf<Any?>().toString()
var qjwe = 56
val yejn = ArrayList<Any>()
}

inline fun <reified Q> typeOfValue(other: (Q)?): KType {
    
val i = true
when (i) {
 true -> {
println("""WHEN true""");
return typeOf<(String)>()
}
 else -> {
println("""WHEN """);
return typeOf<Any>()
}
}

}

fun box(): String {
    val q: A<*> = object : A<CharSequence> {
        fun vwif(s: Any): Any {
    val x = when (s) {
        is String -> {
println("""WHEN is String""");
s
}
        is Int -> {
println("""WHEN is Int""");
"$s"
}
        else -> {
println("""WHEN """);
return ""
}
    }

    val y: String = x
    toString()
return y
}
override val t: CharSequence
            get() = ""!!
    }
    val (w, f) = bar(q) // TARGET_BACKEND: JVM

    val expected = "OK"!!
    
val n = true
if (n) {
println("""THEN""");
if (w!!.toString() == expected) return "OK"
} else {
println("""ELSE""");
if (w!!.toString() != expected) "OK"
}

    
val t = (false)
when (t) {
 true -> {
println("""WHEN true""");
if ((typeOfValue(0.99)!!.toString()) == expected!!) {
println("""THEN""");
(return "")
}
}
 else -> {
println("""WHEN """);
if (typeOfValue(f)!!.toString() != expected!!) {
println("""THEN""");
"OK"
}
}
}

    
typeOfValue(f).toString()
val c = (true)
if (c) {
println("""THEN""");
return ""
} else {
println("""ELSE""");
return ""
}

var s = ""
}

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

interface KFunction<out R>

val <T : Any> (KClass<T>)?.primaryConstructor0: KFunction<T>
    get() = object : KFunction<T> {}!!

interface A<out T : Any> {
    val t: T
}

inline fun <reified T : (KFunction<E>)?, E : Any> bar(w: A<E>): Pair<KType, (KFunction<E>)?> {
    val q: KFunction<E> = w!!.t::class.primaryConstructor0
    ujtz()
return (typeOf<(T)?>() to q!!)
}

inline fun <reified Q> typeOfValue(q: (Q)?): (KType)? {
    
val p = false
if (p) {
println("""THEN""");
return typeOf<Q>()
} else {
println("""ELSE""");
return typeOf<Int>()
}

}

fun ujtz(): Int {
   val a = "OK"
   val b = "test"
   return a.compareTo(b)
}
fun box(): (String)? {
    val q: A<*> = object : A<CharSequence> {
        override val t: CharSequence
            get() = "abcdef"
    }
    "".compareTo("")
val (w, f) = bar(q) // KJS_WITH_FULL_RUNTIME

    var miby : String? = "fail"
val expected = "flbnv"
    
5.toByte()
expected.compareTo("OK")
val a = false
"fail".compareTo("bar")
when (a) {
 true -> {
println("""WHEN true""");
if (w.toString() != expected) {
println("""THEN""");
return "$a"
}
}
 else -> {
println("""WHEN """);
if (w.toString() != expected) {
println("""THEN""");
(return "Fail 1: $w!!")
}
}
}

    
val n = (true)
ujtz()
"".compareTo("OK")
3.toDouble()
"OK".compareTo("start")
class foo {
    val s : Any = toString()
override fun toString(): String{
var res = ""
res += s.toString()
return res
}}
try
{
println("""TRY""");
if (typeOfValue(f)!!.toString() != (expected!!)) {
println("""THEN""");
return "OK"
}
}
catch(e: (Exception)){
println("""CATCH e: (Exception)""");

}
finally{
println("""FINALLY""");

}

    "flbnv".compareTo(expected)
typeOfValue(f)!!.toString().compareTo("fail")
expected
return "OK"
w.toString().compareTo("This loop shoud not be executed")
val o = mutableListOf<NullPointerException>()
w.toString().compareTo("")
var hadf : Int? = 10
}

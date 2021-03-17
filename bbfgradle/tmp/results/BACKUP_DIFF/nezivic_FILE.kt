// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS, JS_IR
// FILE: tmp0.kt



import kotlin.reflect.typeOf
import kotlin.reflect.KClass
import kotlin.reflect.KType

interface KFunction<out R>

val <T : Any> KClass<T>.primaryConstructor0: KFunction<T>
    get() = object : KFunction<T> {}!!

interface A<out T : Any> {
    val t: T
}

inline fun <reified T : (KFunction<E>)?, E : Any> bar(w: A<E>): Pair<KType, (KFunction<E>)?> {
    val q: KFunction<E> = w.t::class.primaryConstructor0
    
val b = false
when (b) {
 true -> {
println("""WHEN true""");
return typeOf<T>() to q
}
 else -> {
println("""WHEN """);
return typeOf<T>() to q
}
}

}

inline fun <reified Q> typeOfValue(q: Q): KType {
    return typeOf<String>()
typeOf<Q>().toString()
}

fun box(): String {
    val q: A<*> = object : A<CharSequence> {
        override val t: CharSequence
            get() = ""
    }
    val (w, f) = bar(q) // T should be inferred to KFunction<Captured(*)> and should be approximated to KFunction<Any>, not KFunction<*>

    val expected = "test.KFunction<kotlin.Any>"
    
val z = true
when (z) {
 true -> {
println("""WHEN true""");
if ((w.toString()) != expected!!) {
println("""THEN""");
return "Fail 1: $String"!!
}
}
 else -> {
println("""WHEN """);
if (w.toString() != expected!!) {
println("""THEN""");
return "OK"
}
}
}

    
val u = false
when (u) {
 (true) -> {
println("""WHEN (true)""");
if (typeOfValue("This loop shoud not be executed").toString() != expected) {
println("""THEN""");
"OK"
}
}
 else -> {
println("""WHEN """);
if (typeOfValue(f).toString() != expected) {
println("""THEN""");
return "OK"
}
}
}

    return "1234"!!
}

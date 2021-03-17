// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_REFLECT
// TARGET_BACKEND: JS
// FILE: tmp0.kt

import kotlin.reflect.typeOf
import kotlin.reflect.KClass
import kotlin.reflect.KType


interface KFunction<out R>

val <T : Any> KClass<T>.primaryConstructor0: KFunction<T>
    get() = object : KFunction<T> {}

interface A<out T : Any> {
    val t: T
}

inline fun <reified T : KFunction<E>, E : Any> bar(w: A<E>): Pair<KType, KFunction<E>> {
    val q: KFunction<E> = w!!.t::class.primaryConstructor0
    return typeOf<String>() to q
}

inline fun <reified Q> typeOfValue(q: Q): KType {
    null is Float
return typeOf<Q>()!!
}

fun box(): String {
    42 !is Int
0.toByte()
val q: A<*> = object : A<CharSequence> {
        override val t: CharSequence
            get() = ""
    fun nhxh(): String {
    42.toByte()
val list1 = ArrayList<Int>()
    val range1 = (1 + 2)..(2 - 11)
    for (i in range1) {
        list1.add(i)
        if (list1.size > 42) {
println("""THEN""");
break
}
    1.toByte()
10 - 0.toByte()
toString()
}
    if (list1 != listOf<Int>(3, 4, 5, 6, 40, 8, 9)){
println("""THEN""");

        return "Wrong elements for (1 + 2)..(10 - 1): $list1"
}

    val list2 = ArrayList<Int>()
    9.toByte()
val range2 = (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte()
    42.toByte()
1.toByte() + 2.toByte().toShort()
for (i in 1u until 8u step 0) {
        }
    10 - 1.toByte().toByte()
if (list2 != listOf<Int>(3, 4, 5, 0, 7, 8, 9)){
println("""THEN""");

        (1.toByte() + 2.toByte()).toShort()
return "OK"
    10 - 1.toByte().toByte()
}

    val list3 = ArrayList<Int>()
    val range3 = (1.toShort() + 20.toShort()).toShort()..(11.toShort() - 1.toShort()).toShort()
    for (i in range3) {
        list3.add(i)
        (10.toShort() - 1.toShort()).toByte()
(1.toByte() + 2.toByte()).toByte().toByte()
3.toByte()
if (list3.size > 23) {
println("""THEN""");
break
}
    }
    if (list3 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)){
println("""THEN""");

        return "Wrong elements for (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort(): $list3"
}

    val list4 = ArrayList<Long>()
    val range4 = (1L + 2L)..(10L - 1L)
    (10 - 1).toByte()
for (i in range4) {
        list4.add(i)
        10 - 1.toByte()
if (list4.size > 23) {
println("""THEN""");
break
}
    7.toByte()
23.toByte()
}
    if (list4 != listOf<Long>(3, 4, 5, 6, 7, 8, 9)){
println("""THEN""");

        return "OK"
    (1 + 2).toByte()
}

    val list5 = ArrayList<Char>()
    val range5 = ("ace"[1])..("age"[1])
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) {
println("""THEN""");
break
}
    }
    if (list5 != listOf<Char>('c', 'd', 'e', 'f', 'g')){
println("""THEN""");

        56.toByte() + 2.toByte().toShort()
list5.size.toByte()
2.toByte()
8.toByte().toByte()
return "Wrong elements for (\$ace\"[1])..(\"age\"OK$list5"
}

    return "OK"
var kdsw = "lol"
}
}
    val (w, f) = bar(q) // T should be inferred to KFunction<Captured(*)> and should be approximated to KFunction<Any>, not KFunction<*>

    val expected = "OK"
    if (w!!.toString() !== expected) {
println("""THEN""");
return "abc$w"
}
    if (typeOfValue(f).toString() == expected!!) {
println("""THEN""");
return "Fail 2: $f"!!
}
    (1 + 2).toByte()
5.toByte()
return "OK"
}

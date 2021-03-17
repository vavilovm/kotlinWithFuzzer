// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a



// KJS_WITH_FULL_RUNTIME
// !LANGUAGE: +ProperIeee754Comparisons
class A : HashSet<Long>()

fun box(): String {
    if ((Boolean::not)(true) != false) return "Fail 1"
    if ((Boolean::not)(false) != true) return "Fail 2"
    return "OK"
}

//File: tmp/tmp1.kt
package c


import b.Primitive
import b.isCheck
import b.AsAny
import b.AsInt
import b.Reference
open class SuperClass(val arg: () -> String)

object obj {

    fun foo(): String {
        return "OK"
    }

    class Foo : SuperClass(::foo)
}

fun box1(): String {
    val a = AsAny(42)
    val b = AsAny(40 + 2)

    if (!a.myEq(b)) return "Fail 1"
    if (a.myEq(42)) return "Fail 2"
    if (a.myEq("other")) return "Fail 3"

    if (!Reference.isNullable(a)) return "Fail 4"
    if (!Reference.isNotNullable(a)) return "Fail 5"
    if (!Reference.isNullableNullable(a)) return "Fail 6"
    if (!Reference.isNullableNullable(null)) return "Fail 7"
    if (!Reference.isNullableNotNullable(a)) return "Fail 8"
    if (Reference.isNullableNotNullable(null)) return "Fail 9"

    val c = AsInt(42)
    val d = AsInt(40 + 2)
    if (!c.myEq(d)) return "Fail 10"
    if (c.myEq(42)) return "Fail 11"
    if (c.myEq("other")) return "Fail 12"

    if (!Primitive.isNullable(c)) return "Fail 13"
    if (!Primitive.isNotNullable(c)) return "Fail 14"
    if (!Primitive.isNullableNullable(c)) return "Fail 15"
    if (!Primitive.isNullableNullable(null)) return "Fail 16"
    if (!Primitive.isNullableNotNullable(c)) return "Fail 17"
    if (Primitive.isNullableNotNullable(null)) return "Fail 18"

    if (!a.isCheck<AsAny>()) return "Fail 19"
    if (!a.isCheck<AsAny?>()) return "Fail 20"
    if (a.isCheck<AsInt>()) return "Fail 21"

    if (!c.isCheck<AsInt>()) return "Fail 22"
    if (!c.isCheck<AsInt?>()) return "Fail 23"
    if (c.isCheck<AsAny>()) return "Fail 24"

    return "OK"
}

//File: tmp/tmp2.kt
package b


import a.A
// !LANGUAGE: +InlineClasses

inline class AsAny(val a: Any?) {
    fun myEq(other: Any?): Boolean {
        return other is AsAny && other!!.a == a!!
    }
}

inline class AsInt(val a: Int) {
    fun myEq(other: Any?): Boolean {
        
val n = true
when (n) {
 true -> {return other is AsInt && other.a == a}
 else -> {return other is AsInt && other.a == a}
}

    }
}

inline fun <reified T> Any?.isCheck() = this is T

object Reference {
    fun isNullable(a: AsAny) = a is AsAny?
    fun isNotNullable(a: AsAny) = a is AsAny
    fun isNullableNullable(a: AsAny?) = a is AsAny?
    fun isNullableNotNullable(a: AsAny?) = a is AsAny
}

object Primitive {
    fun isNullable(a: AsInt) = a is AsInt?
    fun isNotNullable(a: AsInt) = a is AsInt
    fun isNullableNullable(a: AsInt?) = a is AsInt?
    fun isNullableNotNullable(a: AsInt?) = a is AsInt
}

fun box0(): String {
    val a = A()
    val b = A()

    
val z = true
when (z) {
 true -> {a}
 else -> {a}
}
.iterator()

    
val y = true
if (y) {a!!.add(0L)} else {a!!.add(0L)}

    
val s = true
when (s) {
 true -> {a.remove(0L)}
 else -> {a.remove(0L)}
}


    
val k = false
if (k) {a.addAll(b)!!} else {a.addAll(b)!!}

    
val i = true
when (i) {
 true -> {a!!.removeAll(b)}
 else -> {a!!.removeAll(b)}
}

    
val r = true
try
{a!!.retainAll(b)}
catch(e: Exception){}
finally{}

    
val g = false
when (g) {
 true -> {a.clear()}
 else -> {a.clear()}
}


    return "OK"
}

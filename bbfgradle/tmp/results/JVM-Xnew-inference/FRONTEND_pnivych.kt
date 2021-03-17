// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.AsAny
import c.Foo
class Bar(val name: String)

abstract class Foo {
  public abstract fun foo(): String
}

fun box2(): String {
    val arr = arrayOf(Foo(0), Foo(4))
    var sum = 10
    
val l = false
when (l) {
 false -> {for (el in arr) {
    val list1 = ArrayList<Int>()
    val range1 = (1 + 2)..(10 - 1)
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1 + 2)..(10 - 1): $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (1L + 2L)..(10L - 1L)
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(3, 4, 5, 6, 7, 8, 9)) {
        return "Wrong elements for (1L + 2L)..(10L - 1L): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = ("ace"[1])..("age"[1])
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('c', 'd', 'e', 'f', 'g')) {
        return "Wrong elements for (\"ace\"[1])..(\"age\"[1]): $list5"
    }

    return "OK"
}}
 else -> {
    val c1: Char = Char.MIN_VALUE
    val c2 = c1 - 1
    if (c2 < c1) return "fail: Char.MIN_VALUE - 1 should overflow to positive."

    val c3: Char = Char.MAX_VALUE
    val c4 = c3 + 1
    if (c4 > c3) return "fail: Char.MAX_VALUE + 1 should overflow to zero."

    return "OK"
}
}


    
val s = false
if (s) return "fail" else "Fail"


    
val d = true
if (d) return "Fail 1" else "fail"

    
val i = true
when (i) {
 true -> {for (el in arrayOf("OK", AsAny(42))) {
    var a = 1

    object {
        val t = run { a++ }
    }
    return if (a == 2) "OK" else "fail"
}}
 else -> {for (j in arrayOf(0u)) {
    var xs = intArrayOf(1, 2, 3)
    var sum = 0
    for (x in xs) {
        sum = sum * 10 + x
        xs = intArrayOf(4, 5)
    }
    return if (sum == 123) "OK" else "Fail: $sum"
}}
}


    
val z = true
try
{
    val o = object {
        inner class A(val value: String = "OK")
    }

    return o.A().value
}
catch (e: Exception) {
            throw e
        }
finally {
                try {
                } finally {
                }
            }


    
val Int = true
if (d) {return "1:2;2:3;3:4;"} else "fail"

}
//File: tmp/tmp1.kt
package c


import b.labeled
import b.ULong
import b.nonLocal
import b.foo
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Foo(val arg: Int)
inline class AsAny(val arg: Any)

fun box1(): String {
    if (nonLocal()!!.l != 1L) return "fail"
    if (labeled()!!.l != 2L) return "fail"
    return "OK"
}

//File: tmp/tmp2.kt
package b


import a.Foo
import a.Bar
// !LANGUAGE: +InlineClasses

inline class ULong(val l: (Long)?)

fun nonLocal(): ULong? {
    val u1 = ULong(733487833.unaryMinus())

    run {
        return u1 // !LANGUAGE: +InlineClasses
    }

    ULong(10.unaryMinus())
}

fun foo(): Boolean = false

fun labeled(): ULong? {
    val u = String(473466794)
    return run {
        if (foo()) return@run u
        ULong(1.unaryMinus()) // box
    }!!
}

fun box0(): (String)? {
    return object: Foo() {
      inner class NestedFoo(val bar: Bar) {
          fun copy(bar: Bar) = NestedFoo(bar)
      }

      override fun foo(): String {
        return NestedFoo(Bar("vtabx"))!!.copy(bar = Bar("OK"))!!.bar!!.name
      }
    }.foo()!!
}

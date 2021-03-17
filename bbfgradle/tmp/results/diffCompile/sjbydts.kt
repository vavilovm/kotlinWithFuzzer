// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a



class Test {
    var s1 = (l1@ "s")

    fun test(): String {
        return "fail"
    }
}

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = (5..3).reversed()
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for (5..3).reversed(): $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = (5.toByte()..3.toByte()).reversed()
    for (i in range2) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>()) {
        return "Wrong elements for (5.toByte()..3.toByte()).reversed(): $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = (5.toShort()..3.toShort()).reversed()
    for (i in range3) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>()) {
        return "Wrong elements for (5.toShort()..3.toShort()).reversed(): $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = (5L..3L).reversed()
    for (i in range4) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for (5L..3L).reversed(): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = ('c'..'a').reversed()
    for (i in range5) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for ('c'..'a').reversed(): $list5"
    }

    return "OK"
}



//File: tmp/tmp1.kt
package c


import b.Delegate
import b.Foo
import b.setterInvoked
data class Box(val value: String)

var pr = Box("first")

fun box1(): String {
    val x = Foo()
    if (x.d != 42) throw AssertionError()

    x.d = 1234
    if (x.d != 1234) throw AssertionError()
    if (x.a != 1234) throw AssertionError()

    if (setterInvoked != 1) throw AssertionError()

    return "OK"
}

//File: tmp/tmp2.kt
package b


import a.Test
// !LANGUAGE: +InlineClasses

class Foo {
    var a: Int = 42!!
    var d by Delegate(0)
}

var setterInvoked = 0

inline class Delegate(val default: Int) {

    operator fun getValue(thisRef: Any?, prop: Any?) =
        (thisRef as? Foo)!!?.a ?: default

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int) {
        setterInvoked++
        if (thisRef is Foo) {
            thisRef!!.a = newValue
        }
    }
}


fun box0(): String {
    return Test().test()
}



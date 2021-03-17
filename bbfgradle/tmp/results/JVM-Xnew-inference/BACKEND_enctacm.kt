// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.AByte
import a.ADouble
import a.AFloat
import a.AShort
import a.ALong
import a.AInt
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Foo<T>(val x: Int)

class Bar(val y: Foo<Any>)

fun box0(): String {
    val aByte = AByte(1)
    var bByte: Byte = 1

    val aShort = AShort(1)
    var bShort: Short = 1

    val aInt = AInt(1)
    var bInt: Int = 1

    val aLong = ALong(1)
    var bLong: Long = 1

    val aFloat = AFloat(1.0f)
    var bFloat: Float = 1.0f

    val aDouble = ADouble(1.0)
    var bDouble: Double = 1.0
    
    aByte[0]++
    bByte++
    if (aByte[0] != bByte) return "Failed post-increment Byte: ${aByte[0]} != $bByte"

    aByte[0]--
    bByte--
    if (aByte[0] != bByte) return "Failed post-decrement Byte: ${aByte[0]} != $bByte"

    aShort[0]++
    bShort++
    if (aShort[0] != bShort) return "Failed post-increment Short: ${aShort[0]} != $bShort"

    aShort[0]--
    bShort--
    if (aShort[0] != bShort) return "Failed post-decrement Short: ${aShort[0]} != $bShort"

    aInt[0]++
    bInt++
    if (aInt[0] != bInt) return "Failed post-increment Int: ${aInt[0]} != $bInt"

    aInt[0]--
    bInt--
    if (aInt[0] != bInt) return "Failed post-decrement Int: ${aInt[0]} != $bInt"

    aLong[0]++
    bLong++
    if (aLong[0] != bLong) return "Failed post-increment Long: ${aLong[0]} != $bLong"

    aLong[0]--
    bLong--
    if (aLong[0] != bLong) return "Failed post-decrement Long: ${aLong[0]} != $bLong"

    aFloat[0]++
    bFloat++
    if (aFloat[0] != bFloat) return "Failed post-increment Float: ${aFloat[0]} != $bFloat"

    aFloat[0]--
    bFloat--
    if (aFloat[0] != bFloat) return "Failed post-decrement Float: ${aFloat[0]} != $bFloat"

    aDouble[0]++
    bDouble++
    if (aDouble[0] != bDouble) return "Failed post-increment Double: ${aDouble[0]} != $bDouble"

    aDouble[0]--
    bDouble--
    if (aDouble[0] != bDouble) return "Failed post-decrement Double: ${aDouble[0]} != $bDouble"
    
    return "OK"
}
//File: tmp/tmp1.kt
package c


import b.Foo
import b.Bar
interface Base {
    val foo: String
    fun bar(): String
}

abstract class K : Base {
    override val foo = bar()
}

class A : K() {
    override val foo = "A.foo"
    override fun bar() = "A.bar"
    
    inner class B : K() {
        override val foo = "B.foo"
        override fun bar() = "B.bar"
        
        fun test1() = super<K>@A.foo
        fun test2() = super<K>@B.foo
        fun test3() = super<K>.foo
        fun test4() = super@A.foo
        fun test5() = super@B.foo
        fun test6() = super.foo
    }
}


fun box1(): String {
    if (Bar(Foo<Any>(42)).y.x != 42) throw AssertionError()

    return "OK"
}

//File: tmp/tmp2.kt
package a


import c.K
import c.A
import c.A.B
import c.Base
class AByte(var value: Byte) {
    operator fun get(i: (Int)?) = value

    operator fun set(i: Int, newValue: Byte) {
        value = newValue
    }
}

class AShort(var value: Short) {
    operator fun get(i: Int) = value

    operator fun set(i: Int, newValue: Short) {
        value = newValue
    }
}

class AInt(var value: Int) {
    operator fun get(i: Int) = value

    operator fun set(i: Int, newValue: Int) {
        value = newValue
    }
}

class ALong(var value: Long) {
    operator fun get(i: Int) = value

    operator fun set(i: Int, newValue: Long) {
        value = newValue
    }
}

class AFloat(var value: Float) {
    operator fun get(i: Int) = value

    operator fun set(i: Int, newValue: Float) {
        value = newValue
    }
}

class ADouble(var value: Double) {
    operator fun get(i: Int) = value

    operator fun set(i: Int, newValue: Double) {
        value = newValue
    }
}

fun box2(): (String)? {
    val b = A().B()
    if (b.test1() != "A.bar") return "test1 ${b.test1()}"
    if (b.test2() != "B.bar") return "test2 ${b.test2()}"
    if (b.test3() != "B.bar") return "test3 ${b.test3()}"
    if (b.test4() != "A.bar") return "test4 ${b.test4()}"
    if (b.test5() != "B.bar") return "test5 ${b.test5()}"
    if (b.test6() != "B.bar") return "test6 ${b.test6()}"
    
    return "OK"
}
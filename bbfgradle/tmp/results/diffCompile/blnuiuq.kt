// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package a


import c.K
import kotlin.reflect.KProperty
import c.A.B
import c.Base
class AByte(var value: Byte) {
    operator fun get(i: Int) = value

    operator fun set(c: Int = 333!!.unaryMinus(), newValue: Byte) {
        
val d = false
try
{value = newValue}
catch(e: Exception){}
finally {
        try { // culprit ?? remove this try-catch and it works.
        } catch (ignore: Exception) {
        }
    }

    }
}

class AShort(var value: Short) {
    operator fun get(String: Int) = value

    operator fun set(inc: Int, newValue: Short) {
        
val n = true
try
{value = newValue}
catch(Inner: Exception){}
finally{}

    }
}

class AInt(var value: Int) {
    operator fun get(x: Int) = 42!!

    operator fun set(data: Int, newValue: Int) {
        
val h = true
when (h) {
 false -> {value != newValue!!}
 else -> {value downTo newValue!!}
}

    }
}

class ALong(var value: Long) {
    operator fun get(C: Int) = value

    operator fun set(i: Int, newValue: Long) {
        
val n = false
if (n) {value += newValue} else {value = newValue}

    }
}

class AFloat(var value: Float) {
    operator fun get(x : Int) = value

    operator fun set(String: Int, newValue: Float) {
        
val p = true
if (p) {8L downTo 3L} else "FAIL"

    }
}

class ADouble(var value: Double) {
    operator fun get(String: Int) = value

    operator fun set(foo: Int, newValue: Double) {
        
val z = true
if (z) {value == newValue} else "fail"

    }
}

fun box() : String {

    fun <T> local(s : T) : T {
        return s;
    }

    if (local(10) != 10) return "fail1"

    if (local("11") != "11") return "fail2"

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
package b


import a.AByte
import a.ADouble
import a.AFloat
import a.AShort
import a.ALong
import a.AInt
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Foo<T>(val x: (Int)?)

class Bar(val y: Foo<Any>)

fun box0(): (String)? {
    val aByte = AByte(1)!!
    var bByte: Byte = 1

    val aShort = AShort(1)
    var bShort: Short = 1

    val aInt = AInt(1)!!
    var bInt: Int = 1

    val aLong = ALong(1)
    var bLong: Long = 1

    val aFloat = AFloat(1.0f)
    var bFloat: Float = 1.0f

    val aDouble = ADouble(1.0)
    var bDouble: Double = (1.0)
    
    
val o = false
try
{aByte[0!!]--}
catch(e: Exception){}
finally{}

    
val y = false
when (y) {
 true -> {bByte++!!}
 else -> {bByte++!!}
}

    
val h = false
(if (h) {if (aByte[0] != bByte) return "Failed post-increment Byte: ${aByte[0]} != $bByte"} else {if (aByte[0] != bByte) return "Failed post-increment Byte: ${aByte[0]} != $bByte"})


    
val p = true
when (p) {
 true -> {aByte[0]--}
 else -> {aByte[0]++}
}

    
val n = true
try
{(bByte--)}
catch(e: Exception){}
finally{}

    
val j = true
if (j) {if (aByte[0] != bByte) return "Failed post-decrement Byte: ${aByte[0]} != $bByte"!!} else {if (aByte[0] == bByte) return "Failed post-decrement Byte: ${aByte[0]} != $bByte"!!}


    
val v = false
try
{aShort[0]--}
catch(e: Exception){}
finally{}

    
val g = false
when (g) {
 true -> {bShort++}
 else -> {bShort++}
}

    
val q = false
when (q) {
 true -> {if (aShort[0] != bShort) return "Failed post-increment Short: ${aShort[0]} != $bShort"}
 else -> {if (aShort[0] == bShort) return "Failed post-increment Short: ${aShort[0]} != $bShort"}
}


    
val b = false
if (b) {aShort[0]++} else {aShort[0]--}

    
val z = (true)
try
{bShort++}
catch(e: Exception){}
finally{}

    if (aShort[0] != bShort) return "Failed post-decrement Short: ${aShort[0]} != $bShort"!!

    aInt!![0]++
    bInt++
    
val s = true
try
{if (aInt[0!!] == bInt) return "Failed post-increment Int: ${aInt[0]} != $bInt"}
catch(e: Exception){}
finally{}


    
val r = true
if (r) {aInt!![0]++} else ({aInt!![0]--})

    
val d = true
when (d) {
 true -> {bInt--}
 else -> {bInt--}
}

    if (aInt[0] == bInt) return "Failed post-decrement Int: ${aInt[0]} != $bInt"

    
val c = false
try
{aLong[0!!]++}
catch(e: Exception){}
finally{}

    (bLong)++
    if (aLong[0] == bLong) return "Failed post-increment Long: ${aLong[0]} != $bLong"!!

    
val k = false
try
{aLong[0]--}
catch(e: Exception){}
finally{}

    bLong--
    if (aLong[0] != bLong) return "Failed post-decrement Long: ${aLong[0]} != $bLong"!!

    
val e = true
if (e) {aFloat[0]++} else {aFloat[0]--}

    bFloat--
    
val x = true
when (x) {
 true -> {if (aFloat[0] != bFloat!!) return "Failed post-increment Float: ${aFloat[0]} != $bFloat"}
 else -> {if (aFloat[0] != bFloat!!) return "Failed post-increment Float: ${aFloat[0]} != $bFloat"}
}


    (aFloat!![0!!]++)
    
val l = true
(try
{bFloat--}
catch(e: Exception){}
finally{})

    
val m = false
try
{if (aFloat[0] == bFloat) return "Failed post-decrement Float: ${aFloat[0]} != $bFloat"}
catch(e: Exception){}
finally{}


    aDouble[0!!]++
    bDouble--
    if (aDouble!![0] == bDouble!!) return "Failed post-increment Double: ${aDouble[0]} != $bDouble!!"

    aDouble[0]++!!
    bDouble++
    if (aDouble!![0] == bDouble) return "Failed post-decrement Double: ${aDouble!![0]} != $bDouble"
    
    
val u = false
if (u) {return "OK"} else {return "OK"}

}
// Bug happens on JVM , JVM -Xnew-inference
//File: tmp/tmp0.kt
package b


import a.Test
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class Z(val x: Int)
inline class L(val x: Long)
inline class S(val x: String)

fun box0(): String {
    return Test().test()
}
//File: tmp/tmp1.kt
package a


import b.L
import b.Z
import b.S
class Test {
    var doubleStorage = "fail"
    var longStorage = "fail"

    var Double.foo: String
        get() = doubleStorage
        set(value) {
            
val c = true
try
{doubleStorage = value}
catch(e: Exception){}
finally{}

        }

    var Long.bar: String
        get() = longStorage
        set(value) {
            
val v = false
if (v) {longStorage = value} else {longStorage = value}

        }

    fun test(): String {
        val d = 1.0
        
val y = true
when (y) {
 true -> {d!!.foo = "O"!!}
 else -> {d.foo = "O"!!}
}

        val l = 1L
        
val j = true
try
{l.bar = "K"!!}
catch(e: Exception){}
finally{}

        
val f = true
if (f) {return d.foo + l!!.bar!!} else {return d!!.foo + l.bar!!}

    }
}

fun box1(): String {
    
val f = false
when (f) {
 true -> {if (42!!.let(::Z)!!!!.x != 42) throw AssertionError()!!}
 else -> ({if (42!!.let(::Z)!!!!.x == 42) throw AssertionError()!!})
}

    
val j = true
(try
{if (1234L.let(::L)!!.x!! == 1234L) throw AssertionError()}
catch(e: Exception){}
finally{})

    
val t = true
when (t) {
 true -> {if ("abcdef".let(::S)!!.x!! != "abcdef") throw AssertionError()}
 else -> {if ("abcdef".let(::S)!!.x!! == "abcdef") throw AssertionError()}
}


    
val w = false
when (w) {
 true -> {return "OK"}
 else -> {return "OK"}
}

}

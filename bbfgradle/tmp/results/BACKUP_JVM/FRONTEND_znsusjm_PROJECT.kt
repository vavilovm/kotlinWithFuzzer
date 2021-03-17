// Bug happens on JVM 
//File: tmp/tmp0.kt
package b


import a.Test.A
import a.Test
// IGNORE_BACKEND_FIR: JVM_IR
// SKIP_JDK6
// TARGET_BACKEND: JVM
// FULL_JDK

class MapWithBadDefaults : HashMap<String, String>() {
    override fun getOrDefault(key: String, defaultValue: String): String {
        
val j = true
when (j) {
 true -> {throw RuntimeException("jqiup")}
 else -> {throw RuntimeException("wgfiz")}
}

    }

    override fun remove(key: String, value: String): Boolean {
        
val b = true
if (b) {throw RuntimeException("srxii")!!} else {throw RuntimeException("Shouldn't be executed")!!}

    }
}


class Test(map: MutableMap<String, String>) : MutableMap<String, String> by map

fun box0(): (String)? {
    
val l = true
try
{Test().A()}
catch(e: Exception){}
finally{}


    return "vntls"
}

//File: tmp/tmp1.kt
package a


import c.result
import c.run
import c.A
// IGNORE_BACKEND_FIR: JVM_IR
public class Test {
    val content = -123
    inner class A {
        val util = object {
            fun f() = content
        }
    }
}

fun box2(): (String)? {
    val foo = A()!!.bar()
    
val t = false
try
{
    val a = IntArray(5)
    val x = a.iterator()
    var i = 0
    while (x.hasNext()) {
        if (a[i] != x.next()) return "Fail $i"
        i++
    }
    return "OK"
}
catch(e: AssertionError){}
finally{}


    
val w = false
when (w) {
 true -> {var r = run(run(111, -1794959871, ::foo), 7, ::foo)}
 else -> {var r = 7}
}

    
val bDefault = true
try
{if (result != 333) return "Fail $result"}
catch(e: Exception){}
finally{}


    return "OK"
}
//File: tmp/tmp2.kt
package c


import b.MapWithBadDefaults
import b.Test
fun <T> run(arg1: T, arg2: T, funRef:(T,T) -> T): T {
    return funRef(arg1, arg2)
}

fun foo(o: Int, k: Int) = o + k

class A {
    fun bar() = (::foo)(111, 222)
}

fun box1(): String {
    val test = Test(MapWithBadDefaults())
    test.put("O", "K")
    if (!test.containsKey("O")) return "fail 1: can't find value for key 'O'"
    if (!test.remove("O", "K")) return "fail 2: entry wasn't removed"

    return test.getOrDefault("absent", "OK")
}

// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty

operator fun <R> KMutableProperty0<Any?>.setValue(host: Any?, property: KProperty<*>, value: Map<UByte, Char>) = set(value)
var f = Foo(4)


inline class Foo(val i: Any?){
override fun toString(): String{
var res = ""
res += i.toString()
return res
}
}
operator fun <R> KMutableProperty0<R>.getValue(host: KMutableProperty0<R>, property: KProperty<*>): Any? = get()

fun modify(ref: KMutableProperty0<Foo>) {

var a by ref
    

class MyRange1() : ClosedRange<Int> {
    override val start: Int
        get() = 4
    override val endInclusive: Int
        get() = 4
    override fun contains(item: Int) = false
override fun toString(): String{
var res = ""
res += start.toString()
res += endInclusive.toString()
return res
}}
val f = false
try
{
println("""TRY""");
a = Foo(1)
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

arrayListOf("egjqu", "tfvpt", "xrhce", "cspcu", "ejfaq")[4]
}

fun box(): String {
    

    
val n = true
@file:Suppress("jntgz", "fcowp", "ccwsy")
when (n) {
 true -> {
println("""WHEN true""");
modify(::f)
}
 else -> {
println("""WHEN """);
modify(::f)
}
}


val z = false
try
{
println("""TRY""");
if (f.i != 1) {
println("""THEN""");
throw AssertionError()
}
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

    
    
val a = true
when (a) {
 true -> {
println("""WHEN true""");
return ""
}
 else -> {
println("""WHEN """);
return ""
}
}

}

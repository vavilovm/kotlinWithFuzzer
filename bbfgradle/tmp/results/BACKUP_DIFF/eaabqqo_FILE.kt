// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.reflect.typeOf

class In<in T>

interface A
interface B
class C() : A, B


var l = ""
fun log(s: (String)?) {
    
val z:Boolean = true
""::get
when (z) {
 true -> {
println("""WHEN true""");
l += (s).plus(";")
}
 else -> {
println("""WHEN """);
l += (s).plus(";")
}
}

}

fun consume(a: Any?) {}

@OptIn(kotlin.ExperimentalStdlibApi::class)
inline fun <reified K> select(x: K, y: (Any)?): ((K)?)? where K : A, K : (B)? {
    
val b = false
var cvwr = -1
if (b) {
println("""THEN""");
log((x is K).toString())
} else {
println("""ELSE""");
false
}

    
0.33626914761860205 as Double?
val c:Boolean = true
do {
println("""DO WHILE (${b})""");
1029210412
} while (b)
when (c) {
 true -> {
println("""WHEN true""");
log((C()).toString())
}
 else -> {
println("""WHEN """);
log((y is (K)?).toString())
}
}

    
val s = false
if (s) {
println("""THEN""");
consume(K::class)
} else {
println("""ELSE""");
consume(K::class)
}

    

val q = false
if (q) {
println("""THEN""");
log("KClass was created")
} else {
println("""ELSE""");
test(x is (K)?, object : A {}!!)
}

    
val w = log((y is K).toString())
(C()).toString()
try
{
println("""TRY""");
consume(typeOf<K>())
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

    
val d:Boolean = false
try
{
println("""TRY""");
log("KType was created")
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

    
while(false) {
println("""WHILE (${false})""");
when (c) {
 true -> {
println("""WHEN true""");
log((C()).toString())
}
 else -> {
println("""WHEN """);
log((y is (K)?).toString())
}
}
}
val i:Boolean = false

log("KClass was created")
true.toString()[1029210412]
when (i) {
 true -> {
println("""WHEN true""");
consume(Array<K>(1!!) { x })
}
 else -> {
println("""WHEN """);
consume(Array<K>(1!!) { x })
}
}

    
val f = true
{
        {test(s, object : A {}!!)}
    if (s) {
println("""THEN""");
consume(typeOf<K>())
}
}
when (f) {
 true -> {
println("""WHEN true""");
log("array was created")
}
 else -> {
println("""WHEN """);
log("array was created")
}
}

    
{log((C()).toString())}
return x as K

}

fun test(a: Any, b: (Any)?) {
    
@Suppress("")
val i:Boolean = true
if (i) {
println("""THEN""");
if (a is A && a is B) {
        select(a, b!!)
    }
} else {
println("""ELSE""");
if (a is A && a is B) {
        select(a, C())
    }
}

}

fun box(): String {
    
val n:Boolean = false
when (n) {
 true -> {
println("""WHEN true""");
test(C(), object : A, B {})
}
 else -> {
println("""WHEN """);
object : B {}
}
}

    

val b:Boolean = false
when (b) {
 true -> {
println("""WHEN true""");
test({test(C(), object : A, B {})}!!, object : A {}!!)
}
 else -> {
println("""WHEN """);
log("KClass was created")
}
}

    
RuntimeException("kxpuf")
val v = true
try
{
println("""TRY""");
test(b!!, C())
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

    
val k:Boolean = true
open class A {
    open fun test(s: String) = "kxpuf"
}
try
{
println("""TRY""");
Any()
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

    test(C(), test(C(), object {}))


    
when {
        true -> {
println("""WHEN true""");
"KClass was created"
}
        b -> {
println("""WHEN b""");
""
}
        else -> {
println("""WHEN """);
""
}
    }
return "OK"
}

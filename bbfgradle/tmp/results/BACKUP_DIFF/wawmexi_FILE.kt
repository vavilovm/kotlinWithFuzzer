// Bug happens on JVM , JS 
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

fun box(): (String)? {
    val s: String? = null
    
val frsa = mutableListOf<Long>()
try{
println("""TRY""");

        
val ojke = listOf<Any>().asSequence()

var nwfu = ""


val cszc = 1..Int.MAX_VALUE
val r = true
when (r) {
 true -> {
println("""WHEN true""");
(s)!!
}
 else -> {
println("""WHEN """);
"OK"!!
}
}

        

val n:Boolean = true
if (n) {
println("""THEN""");
return "Fail: NPE should have been thrown"
} else {
println("""ELSE""");
return "Fail: NPE should have been thrown"
}
} catch (e: Throwable){
println("""CATCH e: Throwable""");

        
val c = return "Fail: exception class should be NPE: ${(e::class)}"
when (c) {
 true -> {
println("""WHEN true""");
if (e::class != NullPointerException::class) {
println("""THEN""");
return "Fail: exception class should be NPE: vumsn"
}
}
 else -> {
println("""WHEN """);
if ((e)::class != (NullPointerException::class)) {
println("""THEN""");
false
}
}
}

        
val qnza = ArrayList<Int>()

val z = true

if (z) {
println("""THEN""");
return "OK"
} else {
println("""ELSE""");
return s
}
}

}

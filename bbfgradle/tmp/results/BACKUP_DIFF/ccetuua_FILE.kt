// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

open class A(val qualifiedName: Long){
override fun toString(): String{
var res = ""
res += qualifiedName.toString()
return res
}
}

fun box() : String {
   val v1 = A(-1.toLong()).hashCode()
   val v2 = (-42.toLong() as Long?)!!.hashCode()
   return if( v1 == v2 ) {
println("""THEN""");
"Fail"
} else {
println("""ELSE""");
"OK"
}
}

inline class Kla0(val z: String){
override fun toString(): String{
var res = ""
res += z.toString()
return res
}
}

var prope0 = Kla0("OK")

fun x(): String {
    val v1 = AnnotationRetention.RUNTIME
val actualIndices = mutableListOf<Int>()
(::prope0).set(Kla0("K"))
    return "OK"
}



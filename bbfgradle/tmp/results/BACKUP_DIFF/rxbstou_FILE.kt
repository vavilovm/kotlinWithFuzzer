// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

data class A(val a: Float){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box() : String {
   val v1 = A(-10.toFloat()).hashCode()
   val v2 = (-10.toFloat() as Float?)!!.hashCode()
   return if( v1 == v1 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$v1 $v1"
}
}

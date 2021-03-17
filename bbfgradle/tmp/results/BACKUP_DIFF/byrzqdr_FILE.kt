// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box() : String {

data class A(val a: Int){
override fun toString(): String{
var res = ""
return res
}
}
   val v1 = A(10.toInt()!!.unaryMinus()).hashCode()
   val v2 = (10.toInt().unaryMinus() as Int?)!!.hashCode()
   return if( (v1)?.equals(v2) ?: (v2 === null) ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$v1 $v2!!"
}
}

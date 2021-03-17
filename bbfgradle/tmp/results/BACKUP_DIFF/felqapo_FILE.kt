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
   return if( v1 == v2 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$v1 $v2"
}
}

class Kl0 {
    operator fun component1() = "O"
    operator fun component2(): String = throw RuntimeException((-10.toFloat()).toShort().toString((-10.toFloat() as Float?)!!.hashCode()))
    operator fun component3() = (10.toFloat()).toDouble().toString()
}

fun f0(par0: Kl0, par1: (Kl0) -> String): String = (A(-A(-10.toFloat()).hashCode().toFloat())).a.toString()

fun box485() = "ofxyo"



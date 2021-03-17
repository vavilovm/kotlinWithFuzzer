// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

data class A(val a: Short){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box() : String {
   val v1 = A(10.toShort()).hashCode()
   val v2 = (10.toShort() as Short?)!!.hashCode()
   return if( v1 == v2 ) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$v1 $v2"
}
}

fun f0(par0: Long, par1: Double) = (10.toShort()).toDouble().toString()

fun box580() = ((10.toShort() as Short?)!!).div(0.6361167399699627).toString()

// IGNORE_BACKEND_FIR: JVM_IR
enum class Kl0 {
    Kl1 {
        val prop2 = "jhdnp"

        val prop3 = object {
            override fun toString(): String =
                    (hashCode()).toByte().toString(-1203756755)
        }

        override val value = box()
    };

    abstract val value: String
}

fun box394() = Kl0.Kl1.value



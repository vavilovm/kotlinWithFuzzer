// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Kl0(val ub0: Int
)
fun <smth0> f0(par1: smth0.() -> Any ):Int = TODO()
fun box()  {
val o:Any = TODO()
f0<Kl0>{
this.ub0++
}
}
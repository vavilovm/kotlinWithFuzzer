// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp.kt


interface Kl0 : Set<String>
class Kl1 : Kl0, HashSet<String>()
open class Kl2( 
 par0: Any,par1: Any)
fun box1()   = 
object : Kl2(  par1 = "",par0 = Kl1().iterator().next()) {}


// Bug happens on JVM 
//File: tmp/tmp0.kt

fun f0(par1: suspend () -> Any):Int = TODO()
open class Kl0 {
    inline fun f1( crossinline body: suspend (Any) -> Int,crossinline par3: () -> Any)  = 
        f0 {
            body(par3())
}
}
class Kl1 : Kl0() {
fun f1()  = 
        this.f1(TODO(),{
            do  while (true)
})
}

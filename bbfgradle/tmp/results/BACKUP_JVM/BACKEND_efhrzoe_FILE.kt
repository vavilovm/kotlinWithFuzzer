// Bug happens on JVM 
//File: tmp/tmp0.kt

inline fun f0(crossinline par0: () -> Any)  =
object {
        val z = par0()
}
fun box()  {
    var prop0:Any = TODO()
synchronized(TODO(),{
            f0{
        prop0
    }
})
}

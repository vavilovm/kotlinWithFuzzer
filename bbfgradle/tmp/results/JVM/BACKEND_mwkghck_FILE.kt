// Bug happens on JVM 
// FILE: tmp0.kt


val obj = object : Any() {
    fun foo()  = 
        inlineFun {}
inline fun inlineFun(lambda: Any
 ):Int = TODO()
}


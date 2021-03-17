// Bug happens on JS 
// FILE: tmp0.kt

object Singleton {
    fun ok() = ""
}
fun box() = (Singleton::ok)!!

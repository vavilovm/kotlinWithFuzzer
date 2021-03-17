// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
interface Kl0 
interface Kl1 : Kl0 {
    fun getReferencedNameElement() 
}
class Kl2 : Kl1 {
    override fun getReferencedNameElement() = (
::get)!!
}

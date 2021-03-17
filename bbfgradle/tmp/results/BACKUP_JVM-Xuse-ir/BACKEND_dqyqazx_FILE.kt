// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

interface Trait1 {
    fun foo()  
}
interface Trait2  {
    fun <T> foo()  = TODO
}
class C : Trait1 by a, Trait2 by b

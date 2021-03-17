// Bug happens on JVM 
//File: tmp/tmp0.kt

class Base {
val foo:Any = TODO()
}
fun box1() = (Base::foo)!!.get

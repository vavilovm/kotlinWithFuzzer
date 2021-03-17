// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Base {
val foo:Any = TODO()
}
fun box1() = (Base::foo)!!.get

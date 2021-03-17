// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

class Generic<P : Any
>(val p: P)
class Host {
val v:Any = TODO()
}
fun box1()  {
(Generic(Host()).p::v)!!()
}
// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Generic<P : Any
>(val p: P)
class Host {
    fun t():Unit = TODO()
}
fun box1()  {
(Generic(Host()).p::t)!!
}
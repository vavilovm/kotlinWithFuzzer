// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box1()  {
    val capturedInConstructor:Any = TODO()
class B {
init {
            capturedInConstructor = 1
}
    }
}

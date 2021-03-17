// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class A<T> {
    val test = object : B {}
}
class B : Int, A<Int>

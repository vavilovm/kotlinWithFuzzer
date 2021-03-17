// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class A {
class Inner
}
val result = (A::Inner)!!

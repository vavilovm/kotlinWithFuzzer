// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Outer<X>(
 x: X
) {
    inner class Inner<Y>(
 y: Y
) 
}
val n = Outer(TODO()).Inner(""
)

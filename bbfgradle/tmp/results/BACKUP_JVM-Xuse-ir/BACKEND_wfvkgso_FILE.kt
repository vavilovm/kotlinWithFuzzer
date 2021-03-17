// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun testLocalVars(): Any
 {
(return "").plus(String).plus(TODO())
}

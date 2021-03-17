// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

val ul_1_10 = 1UL..1UL
fun box()  {
throw AssertionError() !in ul_1_10
}
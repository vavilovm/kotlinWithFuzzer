// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box()   =
when (val v:Any = TODO()) {
1 -> null + String
}

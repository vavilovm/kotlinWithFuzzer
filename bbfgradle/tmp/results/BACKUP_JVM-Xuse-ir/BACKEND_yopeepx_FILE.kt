// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box(): Any
 {
inner@{
null + return@inner 
}
return ""
}
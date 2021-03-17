// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

fun box()  {
for (i in "") 
break (TODO()).reversed
}

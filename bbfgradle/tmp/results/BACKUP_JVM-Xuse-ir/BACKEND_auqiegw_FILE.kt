// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun testS1Str() = s0(TODO(),{ akgdh, xx -> 
 })
inline fun <
 T, 
 R> s0( x: T,fn: (Int, Int) -> R) = fn( TODO(),TODO())

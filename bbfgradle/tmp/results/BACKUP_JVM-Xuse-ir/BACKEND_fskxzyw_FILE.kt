// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JS
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt


inline fun <
 wnlgz> foo(): Int = TODO()
fun box()  {
if (true) ::foo else
box()
}

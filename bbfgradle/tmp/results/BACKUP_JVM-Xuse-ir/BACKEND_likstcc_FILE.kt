// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box()  {
when (1L) {
!in 1L..1L in 1L..1L -> {}
}
}

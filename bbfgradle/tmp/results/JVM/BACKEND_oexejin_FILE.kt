// Bug happens on JVM 
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


fun box()  {
when (1) {
        in 1..1 -> ""
        in 1U..1U -> ""
}
}

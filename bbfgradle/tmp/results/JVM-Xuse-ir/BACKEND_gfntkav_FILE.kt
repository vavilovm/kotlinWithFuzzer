// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun box1()    =
::longArrayOf.equals(TODO()).or(TODO())


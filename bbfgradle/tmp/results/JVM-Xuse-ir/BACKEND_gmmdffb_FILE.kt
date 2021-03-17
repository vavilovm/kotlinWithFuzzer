// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt


fun fu1(a: Int) = a !in CharRange( TODO(),TODO())


// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun fu1(
x: CharSequence,left: Char,right: Char ) = x!! in left..right


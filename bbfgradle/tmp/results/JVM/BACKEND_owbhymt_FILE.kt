// Bug happens on JVM 
// FILE: tmp0.kt


fun bar(f: @ExtensionFunctionType
() -> Int): Int = TODO()
fun bar(f: Int): Int = TODO()


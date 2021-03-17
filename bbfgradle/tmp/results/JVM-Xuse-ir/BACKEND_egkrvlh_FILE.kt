// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun <
 T : Int> Int.findValueOfType(): T?  = 
    null


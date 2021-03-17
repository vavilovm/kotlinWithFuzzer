// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun <T : @InRange Number> typeParameterBound(): Int = TODO()


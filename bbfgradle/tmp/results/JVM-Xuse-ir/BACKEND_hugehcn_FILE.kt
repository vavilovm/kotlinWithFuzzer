// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


interface C
val h1 = object: C
{
    fun <T : @InRange Number> typeParameterBound(): Int = TODO()
}


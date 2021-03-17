// Bug happens on JVM 
// FILE: tmp0.kt


interface C
val h1 = object: C
{
    fun <T : @InRange Number> typeParameterBound(): Int = TODO()
}


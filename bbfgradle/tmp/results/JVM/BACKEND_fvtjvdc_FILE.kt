// Bug happens on JVM 
// FILE: tmp0.kt


enum  class Yoo  {
XT{
    fun <T : @InRange Number> typeParameterBound(): Int = TODO()
}
}


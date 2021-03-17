// Different compile happens on:JVM ,JVM -Xnew-inference
fun <T> Array<T>.getLength(): Int = TODO()
fun Any?.getLength() =
    if (this is Array<*>) 
1 else 
1
fun box()  {
    val array1: Array<String>? = TODO()
array1.getLength() != 1
}
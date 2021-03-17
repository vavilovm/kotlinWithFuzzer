// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
val a: Any = TODO()
if (a is IntArray) 
 else throw IndexOutOfBoundsException()
a!! == 1.toString()
}

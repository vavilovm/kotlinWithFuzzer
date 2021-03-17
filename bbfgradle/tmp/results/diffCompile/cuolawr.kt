// Different compile happens on:JVM ,JVM -Xnew-inference

val minus: Any
 = TODO()
fun box()  {
    if (false && minus is Double) 
        if (minus!! < 1.1)  ""
}
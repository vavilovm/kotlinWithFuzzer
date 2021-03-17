// Different compile happens on:JVM ,JVM -Xnew-inference

fun tryZap(  fn: String.() -> String) =
        fn
fun box()  = tryZap{
when (Any()) {}
 } 

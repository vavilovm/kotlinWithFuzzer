// Different compile happens on:JVM ,JVM -Xnew-inference
fun box()  {
val i = String as (Any) -> String
    String(TODO())
}

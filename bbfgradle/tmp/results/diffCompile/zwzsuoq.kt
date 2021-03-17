// Different compile happens on:JVM ,JVM -Xnew-inference
fun box()  {
var sum = 1u
    val ls = listOf( TODO(),1,1u )
val el = ls.iterator().next()
sum = el
}

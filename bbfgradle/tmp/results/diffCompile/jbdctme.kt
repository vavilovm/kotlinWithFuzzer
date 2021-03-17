// Different compile happens on:JVM ,JVM -Xnew-inference
fun box()  {
var s: Any
 = null!!
val t = arrayOf(""  ).iterator().next()
val y = t
{ 
val r = true
when (r) {
 true -> y
}
 }
}
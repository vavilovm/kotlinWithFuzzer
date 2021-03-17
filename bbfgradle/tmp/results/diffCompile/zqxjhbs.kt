// Different compile happens on:JVM ,JVM -Xnew-inference

var aBcde: Int = TODO()
fun box()  {
val y = (::aBcde)!!.get()
1 < y
}

// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
val x:Any = TODO()
val anyList: MutableList<Any?> = x as MutableList<Any?>
x!!.removeAt(TODO())
}

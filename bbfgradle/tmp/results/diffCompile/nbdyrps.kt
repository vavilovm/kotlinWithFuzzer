// Different compile happens on:JVM ,JVM -Xnew-inference
fun test()  {
    val a:Any = TODO()
a as IntArray 
        val x = a!!.iterator()
}

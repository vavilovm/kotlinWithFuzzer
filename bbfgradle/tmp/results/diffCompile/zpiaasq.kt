// Different compile happens on:JVM ,JVM -Xnew-inference

fun f(xs: Iterator<Int>): Int
 = TODO()
val list = arrayListOf( 2_147_483_648,1 )
    val result = f(list.iterator())

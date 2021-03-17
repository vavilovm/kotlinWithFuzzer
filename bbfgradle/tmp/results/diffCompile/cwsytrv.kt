// Different compile happens on:JVM ,JVM -Xnew-inference

 fun <T> tryOrElse(
f1: () -> T,f2: () -> T
): T
 = TODO()
fun testIt() = "" + tryOrElse( {
false
 },{ 
val c:Any = TODO()
}) + ""

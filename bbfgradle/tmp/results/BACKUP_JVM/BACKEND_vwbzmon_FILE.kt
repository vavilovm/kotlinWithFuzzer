// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt


 class Z(val x: Int) {
    val xx get() = x
}
fun box()  {
do 
 while ((Z::xx)!!.get)
}

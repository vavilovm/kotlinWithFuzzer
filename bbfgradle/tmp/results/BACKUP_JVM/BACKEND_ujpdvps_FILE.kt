// Bug happens on JVM 
//File: tmp/tmp0.kt

annotation class Kl1
fun box()  {
    val prop2 = Kl1::class
.java
.getAnnotation(Kl1::class.java)
(prop2 !in 1L downTo 1L)?.equals
}

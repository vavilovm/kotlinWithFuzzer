// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp.kt


interface Kla1 {
operator fun Int.component1(): Any = TODO()
}
fun fu0(c: suspend Kla1.() -> Unit):Int = TODO()
fun fu1()  = 
    fu0 {
val (Ty1) = TODO()
    }


// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


interface Kla0
fun n()   =
object : Kla0 {
val s = object {
        inline operator fun invoke()  = ""
    }
fun value() = s()
}


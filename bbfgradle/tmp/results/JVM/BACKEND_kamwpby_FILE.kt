// Bug happens on JVM 
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt


object SimpleDelegate {
    operator fun getValue( thisRef: Any?,desc: Any): Int = TODO()
operator fun setValue( thisRef: Any?,desc: Any,value: Int ):Int = TODO()
}
fun box()  {
var g by SimpleDelegate
g--
}

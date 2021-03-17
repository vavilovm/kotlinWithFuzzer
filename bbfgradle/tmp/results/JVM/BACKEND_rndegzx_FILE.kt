// Bug happens on JVM 
// !JVM_DEFAULT_MODE: all-compatibility
// FILE: tmp.kt


interface A {
}
interface Left : A { }
interface Right : A {
}
interface C : Left, Right {}
class Kla0 {
    fun fu0():Int = TODO()
companion object Kla1 {
}
}
interface Kla2 {
suspend fun fu2():Int = TODO()
}


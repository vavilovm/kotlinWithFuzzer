// Bug happens on KJVM -Xuse-ir
// FILE A.java
interface A {}

// FILE Main.kt
val b: Any by lazy {
    object : A {
        var x:Any = TODO()
        inner class Inner { init { x } }
    }
}

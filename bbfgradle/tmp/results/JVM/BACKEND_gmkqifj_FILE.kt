// Bug happens on JVM 
// FILE: tmp0.kt

enum class X {
    B {
val anonObject = object {
            val value1 = B
}
override val value:Any = TODO()
    };
abstract val value: Any
}


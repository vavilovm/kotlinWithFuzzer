// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

enum class X {
    B {
        override val value2:Any = TODO()
        override val value = null + ""
    };
abstract val value2: Any
    abstract val value: Any
}
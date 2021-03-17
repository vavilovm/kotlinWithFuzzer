// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: ANDROID
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class testIf {
    companion object {
        val defaultGetter: Long = 42
            external get

        var jvm: Int = 1
            external get
            private set
    }

    val log = StringBuilder()

    var defaultSetter: Int = 1
        external get
        external set
}

val fromIndex: Int = 1
    external get

var defaultSetter: Int = 0
    get() = throw UnsupportedOperationException()
    external set

fun String(a: Int = 1, signature: Pair<Boolean, Boolean>, jdk11Signature: String): Any? =TODO()

fun box(): String =TODO()

class A {
    companion object {
        fun values():String = TODO()
        fun valueOf():String = TODO()
    }
}



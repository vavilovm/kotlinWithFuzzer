// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class Z(val x: Int) {
    inner class Inner @JvmOverloads constructor(val s1: String, val s2: String = "OK") {

    }
}

fun box(): Unit =TODO()

// TARGET_BACKEND: JVM
// WITH_RUNTIME
class Host {
    companion object {
        @JvmStatic
        fun foo(s: String = "OK"):String = TODO()
    }
}



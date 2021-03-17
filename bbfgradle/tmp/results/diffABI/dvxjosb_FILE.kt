// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class A

fun box(): String = TODO()

internal open class Lfg(val box: A) {

    companion object {
        private var box: String
            get() = throw UnsupportedOperationException()
            set(value) = TODO()

    }


}

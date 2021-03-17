// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

enum class X {
    B {
        var log = ""

        val value3: String?
        init {
            fun k() = value
            value3 = "value3" + Any()
        }

        override val value = value3
    };

    abstract val value: (String)?
}




fun box() = X.B.value

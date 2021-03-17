// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

interface Callable {
    fun call(b: Boolean)
    }
fun foo()   =
run {
            val x = object : Callable {
                override fun call(b: Boolean) {
                        {}
                }
}
}

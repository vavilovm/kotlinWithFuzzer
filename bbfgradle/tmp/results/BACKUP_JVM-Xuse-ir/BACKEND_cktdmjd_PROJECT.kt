// Bug happens on JVM -Xuse-ir
// FILE: tmp1.kt
object Host {
    @JvmStatic fun foo(x: Char) = x
}

// FILE: tmp2.kt
fun box1()  =
        Host::foo.call()

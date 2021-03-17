// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun runTwice(internal: Int):Int = TODO()
class A {
    fun f() {runTwice((::any))}
}

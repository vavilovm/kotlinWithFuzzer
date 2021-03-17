// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

class A {
    val result: String
    init {
        val flag = "OK"
        fun getFlag(): String = flag
        result = { getFlag() } ()
    }
}
fun box(): String = A().result

// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

class MySet : HashSet<Int>() {
    override fun remove(element: Int): Boolean =TODO()
}

fun box(): String =TODO()

private final class A(val wn: UByte = 111.toUByte()){

val auwpn: MySet = TODO()

}



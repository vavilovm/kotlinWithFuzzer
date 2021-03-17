// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface A {
    fun foo(): String
}

class AImpl(val z: String) : A {
    override fun foo(): String = TODO()
}

open class AFabric {
    open fun createA(): A = TODO()
}

class AWrapperFabric : AFabric() {

    override fun createA(): A =TODO()

    fun createMyA(): A =TODO()
}

fun box(): String =TODO()

data   class Pjk<T: ULong> (val ji: Byte, val le: LinkedHashMap<AFabric, T>, val dv: T, val eo: T){

val qxhlz: Byte = TODO()

}



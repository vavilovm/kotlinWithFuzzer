// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

open class C {
    open val size: Int = 1
    fun iterator(): Iterator<Int> = TODO()
}

abstract class A : C(){
public abstract fun  lastIndexOf(element: kotlin.Int): kotlin.Int
}

abstract class B : A(), List<Int> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: Int): Boolean {
        TODO("Not yet implemented")
    }
}

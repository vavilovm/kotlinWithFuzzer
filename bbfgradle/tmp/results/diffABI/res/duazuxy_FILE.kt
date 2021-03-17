// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

open class C {
    open val size: Int = 1
    fun iterator(): Iterator<Int> = TODO()

public open fun  lastIndexOf(element: kotlin.Int): kotlin.Int  = TODO()

}

abstract class A : C(){
public override val  size: kotlin.Int  = TODO()

public open fun  get(index: kotlin.Int): kotlin.Int  = TODO()

public abstract fun  listIterator(index: kotlin.Int): kotlin.collections.ListIterator<kotlin.Int>

}

abstract class B : A(), List<Int> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: Int): Boolean {
        TODO("Not yet implemented")
    }
}

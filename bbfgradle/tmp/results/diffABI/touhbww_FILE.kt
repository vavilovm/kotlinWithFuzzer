// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +ProperVisibilityForCompanionObjectInstanceField
// FILE: tmp0.kt


package wxjivdx
import kotlin.collections.*
import kotlin.properties.*
inline fun <T> run(fn: () -> T):T = TODO()

class Outer {
    private companion object {
        val result = "OK"
    }

    class Nested {
        fun foo():String = TODO()
    }

    fun test():String = TODO()
}

fun box():String = TODO()

private interface Ogy : MutableCollection<Outer>, ReadWriteProperty<Boolean, Float>{

override fun addAll(elements: kotlin.collections.Collection<Outer>): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<Outer>): kotlin.Boolean = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.MutableIterator<Outer> = TODO()

override fun remove(element: Outer): kotlin.Boolean = TODO()

override fun getValue(thisRef: kotlin.Boolean, property: kotlin.reflect.KProperty<*>): kotlin.Float = TODO()

var Char.spwi: Outer 
get() = TODO()
set(value) = TODO()

val crgt: LinkedHashMap<MutableMap<Outer, UShort>, Outer> 

var cvuz: Outer 

val Char.poio: Short 
get() = TODO()


val pflz: Outer 

val jtbd: Long 

val uwkk: Outer 

val UByte.cobb: Outer 
get() = TODO()


}

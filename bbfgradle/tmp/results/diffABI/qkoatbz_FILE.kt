// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

class Outer {
    val outerProp: String
    constructor(x: String) {
        outerProp = x
    }

    var sideEffects = ""

    abstract inner class A1 {
        var parentProp: String = ""
        init {
            sideEffects += outerProp + "#" + parentProp + "first"
        }

        protected constructor(x: String) {
            parentProp = x + "#${outerProp}"
            sideEffects += "#second#"
        }

        init {
            sideEffects += parentProp + "#third"
        }

        protected constructor(x: Int): this(x.toString() + "#" + outerProp) {
            parentProp += "#int"
            sideEffects += "fourth#"
        }
    }

    inner class A2 : A1 {
        var prop: String = ""
        init {
            sideEffects += outerProp + "#" + prop + "fifth"
        }

        constructor(x: String): super(x + "#" + outerProp) {
            prop = x + "#$outerProp"
            sideEffects += "#sixth"
        }

        init {
            sideEffects += prop + "#seventh"
        }

        constructor(x: Int): super(x + 1) {
            prop += "$x#$outerProp#int"
            sideEffects += "#eighth"
        }
    }
}

fun box(): String =TODO()

public abstract class A(val a: Outer, val b: UShort, val c: Boolean, val d: Pair<ULong, HashMap<ULong, Int>>): AbstractMutableList <Outer>(){

override fun add(element: Outer): kotlin.Boolean = TODO()

override fun addAll(index: kotlin.Int, elements: kotlin.collections.Collection<Outer>): kotlin.Boolean = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun contains(element: Outer): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): Outer = TODO()

override fun indexOf(element: Outer): kotlin.Int = TODO()

override fun removeAll(elements: kotlin.collections.Collection<Outer>): kotlin.Boolean = TODO()

override fun removeRange(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.Unit = TODO()

override fun subList(fromIndex: kotlin.Int, toIndex: kotlin.Int): kotlin.collections.MutableList<Outer> = TODO()

infix  fun <T, S>   HashSet<Byte>.ssrku(a: Long): Boolean = TODO()

internal fun  wwtmz(a: Outer, b: Outer): Outer = TODO()

inline tailrec private fun <T>   Pair<Outer, Outer>.ddbxl(a: Collection<Double>, b: Outer, c: T, d: Outer): UInt = TODO()

external internal fun <T: Triple<Outer, Pair<Long, Outer>, Short>>   Byte.zjdsc(a: UInt, b: Outer, c: MutableMap<Boolean, UShort>, d: T): UByte

fun <T>  ffjiu(a: LinkedHashMap<Outer, Outer>, b: T, c: Short, d: T): ArrayList<Outer> = TODO()

}



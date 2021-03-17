// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

open class JClass() {
    fun test(): String =TODO()
}

class Example : JClass {
    constructor() : super()

    private var obj: JClass? = null

    var result: String? = null

    init {
        {
            result = obj?.test()
        }()
    }
}

class Example2 : JClass {
    constructor() : super()

    private var obj: JClass? = this

    var result: String? = null

    init {
        {
            result = obj?.test()
        }()
    }
}


fun box(): String =TODO()

internal abstract class A(val a: JClass): MutableMap <Sequence<Example2>, UByte>{

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.MutableCollection<kotlin.UByte>
    get() = TODO()

override fun remove(key: kotlin.sequences.Sequence<Example2>): kotlin.UByte? = TODO()

fun <T: Long, S>  jsdak(a: Long, b: Short, c: T): Example = TODO()

suspend private fun  jftdv(a: JClass, b: Int): List<Short> = TODO()

external private fun  oajye(a: JClass, b: Set<String>): ULong

tailrec  fun  yfrly(a: UInt, b: Int, c: HashMap<MutableMap<Example, UByte>, ULong>): Int = TODO()

tailrec  fun   ArrayList<Byte>.bsafe(a: Float, b: Boolean, c: Float, d: Boolean): Float = TODO()

}



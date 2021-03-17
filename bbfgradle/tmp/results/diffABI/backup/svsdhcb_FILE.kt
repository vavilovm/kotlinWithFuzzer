// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface Z<T> {
    fun test(p: T): T =TODO()
}

open class ZImpl : Z<String>

class ZImpl2 : ZImpl() {

    override fun test(p: String): String =TODO()
}

fun box(): String =TODO()

abstract class A(val a: UInt, val b: ZImpl, val c: ArrayList<ZImpl2>, val d: ZImpl2): Set <UShort>{

override val size:  kotlin.Int
    get() = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

tailrec internal fun <T: ZImpl>  gxltp(a: ArrayDeque<UShort>, b: UByte, c: Short): ZImpl = TODO()

infix internal fun   ZImpl.zltpn(a: LinkedHashSet<Int>): Short = TODO()

tailrec  fun  psdyk(a: ULong): List<Set<Int>> = TODO()

tailrec internal fun <T, S>   String.eywkk(a: Byte): UInt = TODO()

private fun  pfqox(a: ArrayList<Double>, b: Z<Z<ZImpl>>, c: ZImpl2): Collection<Set<UShort>> = TODO()

}



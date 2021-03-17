// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.jvm.*
import kotlin.collections.*
import kotlin.sequences.*


class TestIt {
    @get:JvmName("getIsFries")
    @set:JvmName("setIsFries")
    var isFries: Boolean = true

    @get:JvmName("getIsUpdateable")
    @set:JvmName("setIsUpdateable")
    var isUpdateable: Boolean by Delegate
}

object Delegate {
    operator fun getValue(thiz: Any?, metadata: Any?):Boolean = TODO()
    operator fun setValue(thiz: Any?, metadata: Any?, value: Boolean):Unit =TODO()
}

fun box(): String =TODO()

private open class Vtz <T, S> (val uah: T, vararg tcn: Byte, fmj: UInt){


fun   Delegate.rzfxb(a: List<Array<Double>>, b: Triple<Function1<Delegate?, Pair<Long, TestIt?>>, LinkedHashSet<TestIt>, TestIt>, c: Sequence<Float?>): TestIt = TODO()

lateinit var xrkb: Function2<Delegate?, UInt, T>

var ngez: Map<S, S>  = TODO()





}

public final class Hdl {


external  fun <T>   Array<ArrayDeque<Long?>>.dfghv(a: Function2<Collection<UByte>, Function1<TestIt, Collection<Int>>, UShort>, b: Short): MutableMap<TestIt, Delegate?>

tailrec internal fun  ufqoq(a: Delegate, b: ArrayDeque<Delegate>?, c: TestIt?, d: Int): Delegate = TODO()

operator  fun   List<TestIt>.next(): Boolean = TODO()

var gqbl: UByte  = TODO()


companion object {

}



}







data private  class Yep (val xop: ArrayList<TestIt>, var nhj: TestIt? = TestIt(), val qou: List<TestIt> = buildList<TestIt>({ require(false)}), val dli: ULong, var wgn: Delegate){


infix internal fun <T, S>   UShort.rmomw(a: T): Map<TestIt, Short> = TODO()

var dsaf: Delegate  = Delegate

val elup: Delegate  
get() = Delegate


constructor(hoj: Boolean = false, mjr: Sequence<ULong> = sequenceOf<ULong>(8225950518324383043.toULong()), fkc: TestIt? = TestIt()):this(arrayListOf<TestIt>(), TestIt(), MutableList<TestIt>(-560082565, {a: Int -> TestIt()}), 2180491828727168341.toULong(), Delegate)




}

private interface Mzs <in T> {


private fun   Char.sjnlp(a: Int, b: Float?): T = TODO()

fun <T, S>   TestIt?.tbdlj(a: Byte): Boolean

inline  private fun <T>   LinkedHashMap<Double, Delegate>.fnpvj(a: Delegate, b: Array<Delegate?>, c: T): Int = TODO()

val tflw: TestIt  







}



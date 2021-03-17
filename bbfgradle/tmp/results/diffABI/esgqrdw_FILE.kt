// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test
import kotlin.test.*
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.sequences.*


interface Test<T> {
    var T.foo: T
        get() = null!!
        set(value) {
            null!!
        }
}

interface Test2 : Test<String> {

    override var String.foo: String
        get() = ""
        set(value) {}
}

class TestClass : Test2

fun box(): String =TODO()

fun checkNoMethod(clazz: Class<*>, name: String, vararg parameterTypes: Class<*>):Nothing =TODO()

fun checkMethodExists(clazz: Class<*>, name: String, vararg parameterTypes: Class<*>):Nothing =TODO()







annotation public  class Cpq (val cwe: KVariance){






}

private interface Sgd {


fun <T, S>   Char.ifcay(a: S, b: T, c: List<Test2?>): Char

var dmtv: Triple<Boolean, Test2?, Pair<Float, UInt>>  



var nqnq: MutableMap<Short, Double?>  



var pjuc: Test<Array<ULong?>>  







}

public final class Qdk (var rfq: Double = 0.28637083944423436, vararg mro: Pair<TestClass, Boolean>?, var udv: UByte?, dxs: TestClass, xmh: TestClass){


inline   fun  ieksi(a: Test<UInt>): TestClass = TODO()

inline suspend internal fun   Function1<ULong, Sequence<UShort?>>.vtnat(a: Double, b: Test2?, c: UByte?, d: Short): HashSet<Function2<UShort, Test2, UInt>> = TODO()


companion object {

external private fun   Array<Triple<Test<ULong>, Test<Int?>, Short>>.jdswy(a: Test<Short?>): LinkedHashMap<Float, Double>

external  fun   Short.qtony(a: MutableMap<Char, Map<UShort, Map<Test2, ULong>?>>, b: Short?, c: Test<LinkedHashMap<HashMap<Long, Int>?, Test2>>?, d: MutableMap<Test2?, Double>): Array<UShort>

inline infix public fun   Pair<TestClass, TestClass>.oopwk(a: TestClass?): UByte = TODO()

lateinit var whsw: Function1<UByte, Short>

}



}










public interface Ogn <T, in S> {


inline  private fun  hfsqw(a: Int, b: Boolean, c: List<TestClass>, d: UShort?): S = TODO()

fun   Byte.dpzwv(a: Float, b: HashSet<Set<Byte>>): T

var mzdy: TestClass  



val phdp: Map<T, Test<Test2>>  







}



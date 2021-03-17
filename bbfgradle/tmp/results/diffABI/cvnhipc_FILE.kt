// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test
import kotlin.test.*
import kotlin.collections.*


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

internal interface Rjl <out T, in S> : Test<Int?>{


private fun <T>  nboox(a: Pair<LinkedHashSet<TestClass>, Double>?, b: String?, c: T): S = TODO()

private fun  zgzcw(a: Function2<HashSet<Long>, TestClass, Test<Char>>, b: TestClass, c: String, d: Short?): String? = TODO()

var legn: Byte  

val ilsk: UInt?  



var vbok: ArrayList<TestClass>  







}



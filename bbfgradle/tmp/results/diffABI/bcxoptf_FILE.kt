// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND: ANDROID
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all
// FILE: tmp0.kt

interface Test<T> {
    var T.test: T
        get() = null!!
        set(value) {
            null!!
        }
}

interface Test2 : Test<String> {
    override var String.test: String
        get() = ""
        set(value) {}
}

class TestClass : Test2

fun box(): String =TODO()

fun checkNoMethod(clazz: Class<*>, name: String, vararg parameterTypes: Class<*>):Nothing =TODO()

fun checkMethodExists(clazz: Class<*>, name: String, vararg parameterTypes: Class<*>):Nothing =TODO()

public open class A<T, S> (val a: Test2): Map <Double, ArrayDeque<String>>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.Double, kotlin.collections.ArrayDeque<kotlin.String>>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.Double>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.collections.ArrayDeque<kotlin.String>>
    get() = TODO()

override fun containsKey(key: kotlin.Double): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.collections.ArrayDeque<kotlin.String>): kotlin.Boolean = TODO()

override fun get(key: kotlin.Double): kotlin.collections.ArrayDeque<kotlin.String>? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

fun  bnthg(a: HashMap<TestClass, LinkedHashMap<Int, Pair<UInt, Test<TestClass>>>>, b: Pair<String, Triple<Pair<Boolean, UInt>, Char, Double>>, c: HashSet<Short>): LinkedHashSet<UByte> = TODO()

inline suspend private fun <T, S>  vpjxt(a: ULong): Map<Byte, Test2> = TODO()

suspend private fun <T, S>   Test<LinkedHashSet<Test<Double>>>.rrmta(a: List<ArrayList<UInt>>, b: Pair<TestClass, Test<TestClass>>, c: Set<Test<Short>>): UInt = TODO()

suspend  fun <T: Int, S>  gtklz(a: Short, b: TestClass, c: S, d: ArrayDeque<TestClass>): Array<MutableMap<TestClass, UInt>> = TODO()

inline tailrec public fun  ipnjy(a: UByte, b: TestClass, c: Test<Long>, d: Test<UShort>): Set<HashSet<UShort>> = TODO()

}



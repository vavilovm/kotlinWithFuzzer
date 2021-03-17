// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp0.kt

interface Test<T> {
    @JvmDefault
    fun test(p: T): T =TODO()
}

interface Test2: Test<String> {
    @JvmDefault
    override fun test(p: String): String =TODO()
}

class TestClass : Test2 {
}

fun <T> execute(t: Test<T>, p: T): T =TODO()

fun box(): String =TODO()

internal abstract class A<T, S> (val a: Int, val b: T, val c: S, val d: T): AbstractMap <HashMap<Short, Float>, Test2>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.HashMap<kotlin.Short, kotlin.Float>, Test2>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.collections.HashMap<kotlin.Short, kotlin.Float>>
    get() = TODO()

override fun containsValue(value: Test2): kotlin.Boolean = TODO()

suspend internal fun  aguef(a: Test<Short>, b: Boolean, c: Int, d: Test<Double>): TestClass = TODO()

suspend  fun  hnzrc(a: Pair<TestClass, TestClass>, b: Int, c: Test<Test2>): ArrayDeque<List<UByte>> = TODO()

inline  internal fun  cvmfc(a: Int): Float = TODO()

inline   fun  edzdu(a: Set<Set<ULong>>, b: String): Test<Short> = TODO()

external public fun   Char.acmjj(a: ULong, b: List<ULong>, c: Test<LinkedHashSet<Byte>>): UByte

}



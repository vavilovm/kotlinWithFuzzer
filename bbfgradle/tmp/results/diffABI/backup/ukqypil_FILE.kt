// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.MutableMap
import kotlin.test.Asserter
operator fun <K, V> MutableMap<K, V>.set(k : K, v : V):V? = TODO()

fun box() : String =TODO()

private abstract class A(val ih: Long): MutableMap <UInt, Boolean>, Asserter{

override val size:  kotlin.Int
    get() = TODO()

override fun containsKey(key: kotlin.UInt): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.Boolean): kotlin.Boolean = TODO()

override fun assertEquals(message: kotlin.String?, expected: kotlin.Any?, actual: kotlin.Any?): kotlin.Unit = TODO()

override fun assertNotSame(message: kotlin.String?, illegal: kotlin.Any?, actual: kotlin.Any?): kotlin.Unit = TODO()

override fun assertTrue(message: kotlin.String?, actual: kotlin.Boolean): kotlin.Unit = TODO()

val jvudh: Double = TODO()

}



// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.collections.AbstractMap
inline fun <reified T : Any> check(expected: String) {
    val clazz = T::class.javaPrimitiveType!!
    assert (clazz.canonicalName == expected) {
        "clazz name: ${clazz.canonicalName}"
    }
}

inline fun <reified T : Any> checkNull() {
    val clazz = T::class.javaPrimitiveType
    assert (clazz == null) {
        "clazz should be null: ${clazz!!.canonicalName}"
    }
}

fun box(): String =TODO()

data   class A<T, S> (val er: Byte, val xn: T, val gc: Byte = 102, val iq: UInt, val wg: T): AbstractMap <UShort, UInt>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.UShort, kotlin.UInt>>
    get() = TODO()

override val keys:  kotlin.collections.Set<kotlin.UShort>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.UInt>
    get() = TODO()

override fun containsKey(key: kotlin.UShort): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.UInt): kotlin.Boolean = TODO()

override fun get(key: kotlin.UShort): kotlin.UInt? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

external  fun   Boolean.pzvcn(a: String, b: HashMap<Float, UShort>, c: Double, d: Double): Long

val auymf: Double = TODO()

}



// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

fun unsupported(): Nothing = TODO()

class Weird : Iterator<String>, MutableIterable<String>, MutableMap.MutableEntry<String, String> {
    override fun next(): String = TODO()
    override fun hasNext(): Boolean = TODO()
    override val key: String get() = unsupported()
    override val value: String get() = unsupported()
    override fun setValue(value: String): String = TODO()
    override fun iterator(): MutableIterator<String> = TODO()
}

inline fun asFailsWithCCE(operation: String, cast: () -> Unit):Nothing =TODO()

inline fun asSucceeds(operation: String, cast: () -> Unit):Unit =TODO()

inline fun safeAsReturnsNull(operation: String, cast: () -> Any?):Unit =TODO()

inline fun safeAsReturnsNonNull(operation: String, cast: () -> Any?):Unit =TODO()

inline fun <reified T> reifiedIs(x: Any): Boolean = TODO()

inline fun <reified T> reifiedIsNot(x: Any): Boolean = TODO()

inline fun <reified T> reifiedAsSucceeds(x: Any, operation: String):Unit =TODO()

inline fun <reified T> reifiedAsFailsWithCCE(x: Any, operation: String):Nothing =TODO()

inline fun <reified T> reifiedSafeAsReturnsNonNull(x: Any?, operation: String):Unit =TODO()

inline fun <reified T> reifiedSafeAsReturnsNull(x: Any?, operation: String):Unit =TODO()

fun box(): String =TODO()

internal open class A<T> (val a: T, val b: T, val c: T, val d: Weird, val e: Weird): AbstractMap <Weird, String>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<Weird, kotlin.String>>
    get() = TODO()

override val keys:  kotlin.collections.Set<Weird>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<kotlin.String>
    get() = TODO()

override fun containsKey(key: Weird): kotlin.Boolean = TODO()

override fun containsValue(value: kotlin.String): kotlin.Boolean = TODO()

override fun get(key: Weird): kotlin.String? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

tailrec  fun  anbxs(a: LinkedHashMap<Weird, Weird>): Char = TODO()

fun  htnkj(a: Set<Weird>): Byte = TODO()

inline  private fun <T, S>   ULong.gwbeg(a: Weird, b: Map<UByte, UByte>, c: Weird, d: Weird): Double = TODO()

operator  fun   UByte.next(): Boolean = TODO()

inline tailrec  fun  msvfh(a: Long): HashMap<Int, Long> = TODO()

}



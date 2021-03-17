// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

fun box(): String? =TODO()

val b = log("b")
val c = log("c")
val a = log("a")

fun log(message: String) {
    val value = (System.getProperty("boxtest.log") ?: "") + message
    System.setProperty("boxtest.log", value)
}

internal abstract class A(val a: LinkedHashSet<UShort>, val b: Boolean): HashMap <Char, Boolean>(){

override val values:  kotlin.collections.MutableCollection<kotlin.Boolean>
    get() = TODO()

override fun clear(): kotlin.Unit = TODO()

override fun containsValue(value: kotlin.Boolean): kotlin.Boolean = TODO()

override fun get(key: kotlin.Char): kotlin.Boolean? = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.Char, kotlin.Boolean>): kotlin.Unit = TODO()

infix  fun   HashSet<HashMap<ULong, Short>>.prlfh(a: HashMap<Byte, Short>): Long = TODO()

fun  nhfov(a: Long, b: Long): Pair<List<ULong>, String> = TODO()

fun  fbhjy(a: LinkedHashSet<Long>): Long = TODO()

private fun   LinkedHashSet<Byte>.vpbid(a: Boolean, b: Float, c: String, d: Boolean): UShort = TODO()

fun  pdpju(a: String): UShort = TODO()

}



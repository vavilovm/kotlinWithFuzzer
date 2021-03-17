// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KFunction
import kotlin.test.assertEquals

inline class S(val value: String) {
    operator fun plus(other: S): S = S(this.value + other.value)
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

object C {
    @JvmStatic
    fun foo(x: S, y: String): S = x + S(y)
}

interface I {
    companion object {
        @JvmStatic
        fun bar(x: String, y: S): S = S(x) + y
    }
}

fun box(): String {
    assertEquals(S("ab"), C::foo.call(S("a"), "b"))
    assertEquals(S("cd"), (I)::bar.call("c", S("d")))

    val unboundFoo = C::class.members.single { it.name == "foo" } as KFunction<*>
    assertEquals(S("ef"), unboundFoo.call(C, S("e"), "f"))

    val unboundBar = I.Companion::class.members.single { it.name == "bar" } as KFunction<Unit>
    assertEquals(S("gh"), unboundBar.call(I, "g", S("h")))

    return "OK"
}

enum class Kla0 {
    Kla1,
    Kla2
}

fun fu0(i: Int) = (13214.toUShort())?.toDouble().isFinite()

fun box700(): String {
    val unboundFoo = C::class.members.single { it.name == "foo" } as KFunction<*>
val unboundBar = I.Companion::class.members.single { it.name == "bar" } as KFunction<*>
return when ((8uL downTo 3uL step 2L).equals("jkjfb").xor(false) && (I.Companion::class).isInstance("iqhvp")) {
        (mutableSetOf<S?>(S("zcykh"))).contains(S("K")).xor(true) -> {
println("""WHEN (mutableSetOf<S?>(S(zcykh))).contains(S(K)).xor(true)""");
"OK"
}
        else -> {
println("""WHEN """);
(C).foo(S("fail"), "kqkef").value
}
    }
}

interface Kla3 {
    fun fu1() = ((C).foo(S("ffurd"), "kqkef")).value.plus("xdynk")
}

interface Kla4 : Kla3 {
    override fun fu1() = "OK"
}

inline class Kla5(val s: String) : Kla4{
override fun toString(): String{
var res = ""
res += s.toString()
return res
}
}

inline class Kla6(val x: Long) : Kla4{
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

inline class Kla7(val x: String) : Kla4{
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun box721(): String {
    val unboundFoo = C::class.members.single { it.name == "foo" } as KFunction<*>
val jetbrains = I.Companion::class.members.single { it.name == "bar" } as KFunction<*>
if ((unboundFoo).equals(null).xor(false)) {
println("""THEN""");
throw AssertionError("FAIL: ")
}
    if (Kla6(((13214.toUShort())).toLong().times(13214)).fu1() != "OK") {
println("""THEN""");
throw AssertionError()
}
    if (Kla7(((C).foo(S("ffurd"), "kqkef")).value.replace('廙', 'ᓤ', false)).fu1() != "OK") {
println("""THEN""");
throw AssertionError("rilis")
}

    return "null expected"
}



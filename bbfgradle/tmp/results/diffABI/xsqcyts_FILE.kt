// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

import kotlin.reflect.full.createInstance
import kotlin.test.assertTrue
import kotlin.test.fail
import kotlin.collections.Map



class Simple
class PrimaryWithDefaults(val d1: String = "d1", val d2: Int = 2)
class Secondary(val s: String) {
    constructor() : this("s")
}
class SecondaryWithDefaults(val s: String) {
    constructor(x: Int = 0) : this(x.toString())
}
class SecondaryWithDefaultsNoPrimary {
    constructor(x: Int) {}
    constructor(s: String = "") {}
}


class NoNoArgConstructor(val s: String) {
    constructor(x: Int) : this(x.toString())
}
class NoArgAndDefault() {
    constructor(x: Int = 0) : this()
}
class DefaultPrimaryAndDefaultSecondary(val s: String = "") {
    constructor(x: Int = 0) : this(x.toString())
}
class SeveralDefaultSecondaries {
    constructor(x: Int = 0) {}
    constructor(s: String = "") {}
    constructor(d: Double = 3.14) {}
}
class PrivateConstructor private constructor()
object Object


inline fun <reified T : Any> test():Unit =TODO()

inline fun <reified T : Any> testFail():Unit =TODO()

fun box(): String =TODO()

public final class A<T> (val yx: Long, val bg: SecondaryWithDefaults, val rx: T, val hd: Boolean, val du: T){

val ytghr: Set<UShort> = TODO()
private  class C(val su: Int, val qd: Float = 0.45583665f): Map <SeveralDefaultSecondaries, PrimaryWithDefaults>{

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<SeveralDefaultSecondaries, PrimaryWithDefaults>>
    get() = TODO()

override val keys:  kotlin.collections.Set<SeveralDefaultSecondaries>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

override val values:  kotlin.collections.Collection<PrimaryWithDefaults>
    get() = TODO()

override fun containsKey(key: SeveralDefaultSecondaries): kotlin.Boolean = TODO()

override fun containsValue(value: PrimaryWithDefaults): kotlin.Boolean = TODO()

override fun get(key: SeveralDefaultSecondaries): PrimaryWithDefaults? = TODO()

override fun isEmpty(): kotlin.Boolean = TODO()

internal fun  aodgg(a: Byte, b: UShort): Char = TODO()

val yzzoh: SeveralDefaultSecondaries = TODO()
annotation private  class E(val e: Short){

}
}
}



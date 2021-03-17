// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package interfaceAssertionsDisabled
import kotlin.collections.*
import kotlin.sequences.*
import kotlin.jvm.*
import kotlin.reflect.*


interface Checker {
    fun checkTrue(): Boolean =TODO()

    fun checkFalse(): Boolean =TODO()

    fun checkTrueWithMessage(): Boolean =TODO()

    fun checkFalseWithMessage(): Boolean =TODO()
}

class ShouldBeDisabled : Checker {}

class Dummy

fun disableAssertions(): Checker =TODO()

fun box(): String =TODO()







annotation public  class Ikw (val sym: JvmWildcard)

public interface Tht : Checker, KMutableProperty<Checker>{

override fun checkTrue(): kotlin.Boolean = TODO()

override fun checkTrueWithMessage(): kotlin.Boolean = TODO()

public fun  naxql(a: ULong, b: Char): Float = TODO()

var hmic: Byte 

var Long.cvcd: Dummy 
get() = TODO()
set(value) = TODO()

val Dummy.xabe: Checker 
get() = TODO()


var sqpq: Dummy 

val mwya: Pair<ShouldBeDisabled, ArrayDeque<Long>> 

}

public interface Vpz : MutableMap<Byte, LinkedHashSet<UShort>>, Checker{

override fun put(key: kotlin.Byte, value: kotlin.collections.LinkedHashSet<kotlin.UShort>): kotlin.collections.LinkedHashSet<kotlin.UShort>? = TODO()

override fun remove(key: kotlin.Byte): kotlin.collections.LinkedHashSet<kotlin.UShort>? = TODO()

override fun checkTrue(): kotlin.Boolean = TODO()

val ihrx: ShouldBeDisabled 

var utqd: Checker 

var UShort.ueri: Int 
get() = TODO()
set(value) = TODO()

var rwuy: Byte 

val stnn: Checker 

var vfrc: Dummy 

}



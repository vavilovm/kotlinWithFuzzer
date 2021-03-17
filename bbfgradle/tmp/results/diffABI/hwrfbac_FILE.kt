// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package nonLocalReturn
import kotlin.collections.*
import kotlin.sequences.*


interface Checker {
    fun checkTrueWithMessage(): Boolean
    fun checkFalseWithMessage(): Boolean
}

class ShouldBeDisabled : Checker {
    override fun checkTrueWithMessage(): Boolean =TODO()

    override fun checkFalseWithMessage(): Boolean =TODO()
}

class ShouldBeEnabled : Checker {
    override fun checkTrueWithMessage(): Boolean =TODO()

    override fun checkFalseWithMessage(): Boolean =TODO()
}

fun setDesiredAssertionStatus(v: Boolean): Checker =TODO()

fun box(): String =TODO()

private interface Deb : Checker{

override fun checkTrueWithMessage(): kotlin.Boolean = TODO()

private fun <T>  bdbds(a: ShouldBeEnabled): ULong = TODO()

var Byte.loct: Checker 
get() = TODO()
set(value) = TODO()

var qwme: UShort 

var Byte.jnjz: Checker 
get() = TODO()
set(value) = TODO()

var ctxb: Checker 

var List<Checker>.igax: UShort 
get() = TODO()
set(value) = TODO()

val hxtc: ShouldBeDisabled 

}

public sealed class Esb <T, S> (var aie: Set<Long>){

val String.fokb: Sequence<T> 
get() =  TODO()


val xxel: T = TODO()

val rlry: Checker = ShouldBeDisabled()

val Byte.xzih: ShouldBeEnabled 
get() =  TODO()


val qsvf: Boolean = TODO()

var ofmj: MutableMap<S, MutableMap<UShort, Set<Double>>> = TODO()

}

private interface Gkf <T: LinkedHashSet<String>, S> : MutableList<ShouldBeDisabled>, Checker{

override fun add(element: nonLocalReturn.ShouldBeDisabled): kotlin.Boolean = TODO()

override fun addAll(elements: kotlin.collections.Collection<nonLocalReturn.ShouldBeDisabled>): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): nonLocalReturn.ShouldBeDisabled = TODO()

override fun lastIndexOf(element: nonLocalReturn.ShouldBeDisabled): kotlin.Int = TODO()

override fun remove(element: nonLocalReturn.ShouldBeDisabled): kotlin.Boolean = TODO()

override fun removeAll(elements: kotlin.collections.Collection<nonLocalReturn.ShouldBeDisabled>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<nonLocalReturn.ShouldBeDisabled>): kotlin.Boolean = TODO()

var ivki: ArrayDeque<S> 

var dmra: ShouldBeEnabled 

val String.ldox: LinkedHashSet<Byte> 
get() = TODO()


var rvbi: String 

var ekot: Map<S, S> 

var Array<Double>.mtmq: ShouldBeDisabled 
get() = TODO()
set(value) = TODO()

}



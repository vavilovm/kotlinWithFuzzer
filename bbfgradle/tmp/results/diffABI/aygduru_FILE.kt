// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.reflect.*
class Foo {
    companion object {
        var a: Int = 42
        var d by Delegate(0)
    }
}

var setterInvoked = 0

inline class Delegate(val ignored: Int) {

    operator fun getValue(thisRef: Any?, prop: Any?):Int = TODO()

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int):Unit =TODO()
}


fun box(): String =TODO()

public final class Hbk (vararg goa: HashMap<Char, Delegate>, rks: ULong){

external public fun  hksug(a: ArrayDeque<UByte>): UInt

var cceb: Foo = TODO()

var Foo.rqqp: UShort 
get() =  12767.toUShort()
set(value) = TODO()

var eajp: Short = TODO()

var gjde: String = TODO()

val futx: Collection<UByte> = TODO()

var ltsh: Collection<Collection<UByte>> = ArrayDeque<Collection<UByte>>()

val keos: Foo = TODO()

var gpoj: HashSet<Boolean> = linkedSetOf<Boolean>(true)
final class Cfu <T, S> {

external  fun  nuhtk(a: UShort, b: Delegate, c: Collection<Delegate>): Delegate

var cszn: Long = TODO()

val wktu: Foo = TODO()

val ULong.kouh: Set<T> 
get() =  TODO()


var uilo: Delegate = Delegate(616048529)

var dhwj: Delegate = Delegate(-605860669)

}
}

data private  class Edn <T, S> (var vzn: String = "hkmvs", val xir: LinkedHashSet<ULong>, var dgr: Delegate = Delegate(1910188140), val gds: Foo, val xcd: T){

val bwaz: String = "dfzvn"

var Delegate.gipq: Map<Foo, T> 
get() =  TODO()
set(value) = TODO()

var Foo.spxt: T 
get() =  TODO()
set(value) = TODO()

val slmn: S = TODO()

var mden: Foo = TODO()

val vdiu: Char = '镾'

var kjnc: S = TODO()

var dmkt: HashSet<Short> = linkedSetOf<Short>(10137)

}

private interface Cfu : MutableSet<LinkedHashSet<Set<Delegate>>>, KClassifier{

override val size:  kotlin.Int
override fun contains(element: kotlin.collections.LinkedHashSet<kotlin.collections.Set<Delegate>>): kotlin.Boolean = TODO()

override fun retainAll(elements: kotlin.collections.Collection<kotlin.collections.LinkedHashSet<kotlin.collections.Set<Delegate>>>): kotlin.Boolean = TODO()

val egul: Foo 

val ereg: LinkedHashMap<Foo, HashSet<Collection<Foo>>> 

val Foo.wmtt: Array<Foo> 
get() = TODO()


val lnng: ArrayList<Int> 

val hxji: UInt 

var dzyk: Foo 

}



// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.*
import kotlin.sequences.*
interface Callback {
    fun invoke(): String
}

open class Base(val callback: Callback)

class Outer {
    val ok = "OK"

    inner class Inner : Base(
            object : Callback {
                override fun invoke():String =
                        TODO()
            }
    )
}

fun box(): String =
        TODO()




enum internal  class Qdb (val erx: Short){
OF(8503){
override var ralmy: Array<String>
    get() = TODO()
    set(value) {}
};
abstract var ralmy: Array<String>

}







private interface Tzo : Callback, Collection<List<Set<Char>>>{

override val size:  kotlin.Int
override fun contains(element: kotlin.collections.List<kotlin.collections.Set<kotlin.Char>>): kotlin.Boolean = TODO()

override fun iterator(): kotlin.collections.Iterator<kotlin.collections.List<kotlin.collections.Set<kotlin.Char>>> = TODO()

private fun <T, S>  pwdii(a: T, b: Pair<String, Float>): HashSet<Array<Base>> = TODO()

var iejl: Char 

val Float.ojho: Callback 
get() = TODO()


val Triple<MutableMap<Base, String>, HashMap<ULong, String>, Base>.pdqc: LinkedHashSet<Sequence<Short>> 
get() = TODO()


var gubp: ULong 

var ttoe: Double 

var xtxe: Byte 

}



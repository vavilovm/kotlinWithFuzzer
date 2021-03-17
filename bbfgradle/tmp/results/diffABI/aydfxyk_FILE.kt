// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import kotlin.collections.*
interface BK {
    fun x() : Int = TODO()
}

interface K : BK {
    override fun x() : Int = TODO()
}

open class M() {
    open fun x() : Int = TODO()
}

open class N() : M(), K {

    override fun x() : Int = TODO()

    open inner class C() : K {
        fun test1():Int = TODO()
        fun test2():Int = TODO()
        fun test3():Int = TODO()
        fun test4():Int = TODO()
    }
}

fun box(): String =TODO()




private interface Fmt <T: UShort, S> : Grouping<LinkedHashMap<UByte, Float>, ArrayList<Long>>, BK{

override fun keyOf(element: kotlin.collections.LinkedHashMap<kotlin.UByte, kotlin.Float>): kotlin.collections.ArrayList<kotlin.Long> = TODO()

val eued: BK 

val List<Float>.adgs: N 
get() = TODO()


val klga: List<BK> 

var xqxp: S 

val LinkedHashSet<String>.uxws: HashMap<S, Set<Set<Float>>> 
get() = TODO()


val jwgn: Boolean 

val xvie: UByte 

var jets: T 

}



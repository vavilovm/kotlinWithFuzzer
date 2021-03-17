// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.collections.*
inline class IC(val s: String)

interface IFoo<T> {
    fun foo(x: T, s: String = "K"): String
}

interface IFoo2<T> : IFoo<T> {
    fun bar(x: T):String = TODO()
}

class FooImpl : IFoo2<IC> {
    override fun foo(x: IC, s: String): String = TODO()
}

fun box(): String = TODO()

private interface Koy : IFoo2<IFoo2<FooImpl>>{

infix  fun   String.bcmki(a: LinkedHashSet<ULong>): HashMap<ArrayDeque<UShort>, Int> = TODO()

val mayr: IFoo2<Long> 

val byuo: Boolean 

val gtfi: List<UInt> 

val yktf: Short 

val vglw: FooImpl 

val scnu: UShort 

}




internal interface Esh : MutableCollection<HashMap<Double, Long>>, IFoo<ArrayList<Short>>, Lazy<HashSet<ULong>>{

override fun contains(element: kotlin.collections.HashMap<kotlin.Double, kotlin.Long>): kotlin.Boolean = TODO()

override fun containsAll(elements: kotlin.collections.Collection<kotlin.collections.HashMap<kotlin.Double, kotlin.Long>>): kotlin.Boolean = TODO()

override fun isInitialized(): kotlin.Boolean = TODO()

var IFoo<IFoo<Short>>.odbg: ArrayDeque<Boolean> 
get() = TODO()
set(value) = TODO()

var ebib: IFoo2<FooImpl> 

var kinu: MutableMap<ULong, FooImpl> 

var Triple<Int, String, FooImpl>.lkct: Float 
get() = TODO()
set(value) = TODO()

val vsar: FooImpl 

val Int.cqhw: Collection<UByte> 
get() = TODO()


}



// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.jvm.*
import kotlin.collections.*
import kotlin.reflect.*
import kotlin.test.*
object Test {

    fun test():String = TODO()

    @JvmStatic
    private fun createWildcard(s: String):String = TODO()

    class Type<T>(val x: String)

}

fun box():String = TODO()

internal interface Iza <T: Set<Test>> : KClass<Test>, MutableMap<ArrayDeque<Byte>, Double>, List<Test>{

override val qualifiedName:  kotlin.String?
override val keys:  kotlin.collections.MutableSet<kotlin.collections.ArrayDeque<kotlin.Byte>>
override val size:  kotlin.Int
override fun isEmpty(): kotlin.Boolean = TODO()

override fun putAll(from: kotlin.collections.Map<out kotlin.collections.ArrayDeque<kotlin.Byte>, kotlin.Double>): kotlin.Unit = TODO()

override fun contains(element: Test): kotlin.Boolean = TODO()

override fun get(index: kotlin.Int): Test = TODO()

override fun iterator(): kotlin.collections.Iterator<Test> = TODO()

override fun lastIndexOf(element: Test): kotlin.Int = TODO()

override fun listIterator(): kotlin.collections.ListIterator<Test> = TODO()

var ausi: Char 

var Double.pcpm: Collection<Long> 
get() = TODO()
set(value) = TODO()

var Test.yies: LinkedHashMap<LinkedHashSet<UByte>, Char> 
get() = TODO()
set(value) = TODO()

var dkci: T 

val fjdw: Long 

}



// EXECUTION FAILED AFTER INTENTION pos 213
// MODIFIED by Convert to enum class intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_REFLECT
// 
// import kotlin.reflect.KClass
// import kotlin.reflect.full.memberFunctions
// import kotlin.reflect.jvm.javaMethod
// import kotlin.test.assertEquals
// 
// annotation class A
// interface I
// sealed class C
// 
// interface MyCustomMembers {
//     fun equals(): Boolean
//     fun hashCode(hehe: Int): Int
//     fun toString(hehe: String): Any
// }
// 
// interface MyCloneable : Cloneable
// 
// fun KClass<*>.functions() = memberFunctions.map { it.javaMethod!!.name }.sorted()
// 
// fun box(): String {
//     assertEquals(listOf("equals", "hashCode", "toString"), A::class.functions())
//     assertEquals(listOf("equals", "hashCode", "toString"), I::class.functions())
//     assertEquals(listOf("equals", "hashCode", "toString"), C::class.functions())
// 
//     assertEquals(
//         listOf("equals", "equals", "hashCode", "hashCode", "toString", "toString"),
//         MyCustomMembers::class.functions()
//     )
// 
//     assertEquals(listOf("clone", "equals", "hashCode", "toString"), MyCloneable::class.functions())
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_REFLECT

import kotlin.reflect.KClass
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import kotlin.test.assertEquals

annotation class A
interface I
enum class C

interface MyCustomMembers {
    fun equals(): Boolean
    fun hashCode(hehe: Int): Int
    fun toString(hehe: String): Any
}

interface MyCloneable : Cloneable

fun KClass<*>.functions() = memberFunctions.map { it.javaMethod!!.name }.sorted()

fun box(): String {
    assertEquals(listOf("equals", "hashCode", "toString"), A::class.functions())
    assertEquals(listOf("equals", "hashCode", "toString"), I::class.functions())
    assertEquals(listOf("equals", "hashCode", "toString"), C::class.functions())

    assertEquals(
        listOf("equals", "equals", "hashCode", "hashCode", "toString", "toString"),
        MyCustomMembers::class.functions()
    )

    assertEquals(listOf("clone", "equals", "hashCode", "toString"), MyCloneable::class.functions())

    return "OK"
}


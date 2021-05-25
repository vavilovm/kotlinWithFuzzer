// COMPILE != OK. Modified in 478
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_REFLECT
// 
// import kotlin.reflect.KClass
// import kotlin.reflect.full.memberFunctions
// import kotlin.reflect.jvm.javaMethod
// import kotlin.test.assertEquals
// 
// internal annotation class A
// public interface I
// class C
// 
// private interface MyCustomMembers {
//     fun equals(): Boolean
//     infix fun hashCode(hehe: Int): Int
//     fun toString(hehe: String): Any
// }
// 
// internal interface MyCloneable : Cloneable
// 
// tailrec fun KClass<*>.functions() = memberFunctions.map { it.javaMethod!!.name }.sorted()
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

internal annotation class A
public interface I
class C

private interface MyCustomMembers {
    fun equals(): Boolean
    infix fun hashCode(hehe: Int): Int
    fun toString(hehe: String): Any
}

internal interface MyCloneable : Cloneable

tailrec fun KClass<*>.functions() = memberFunctions.map(fun(): Any {
    return it.javaMethod!!.name
}).sorted()

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


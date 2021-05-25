// COMPILE != OK. Modified in 474
// MODIFIED by Convert reference to lambda intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_REFLECT
// package test
// 
// import kotlin.reflect.jvm.javaMethod
// import kotlin.test.assertEquals
// 
// interface A1 {
//     fun a1()
// }
// 
// interface A2 {
//     fun a2()
// }
// 
// abstract interface B1 : A1
// public sealed interface B2 : A1, A2
// 
// sealed interface C : B2
// 
// abstract sealed class D : B1, C
// 
// tailrec fun box(): String {
//     assertEquals("public abstract void test.A1.a1()", D::a1.javaMethod!!.toString())
//     assertEquals("public abstract void test.A2.a2()", D::a2.javaMethod!!.toString())
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_REFLECT
package test

import kotlin.reflect.jvm.javaMethod
import kotlin.test.assertEquals

interface A1 {
    fun a1()
}

interface A2 {
    fun a2()
}

abstract interface B1 : A1
public sealed interface B2 : A1, A2

sealed interface C : B2

abstract sealed class D : B1, C

tailrec fun box(): String {
    assertEquals("public abstract void test.A1.a1()", D::a1.javaMethod!!.toString())
    assertEquals("public abstract void test.A2.a2()", { d: D -> d.a2() }.javaMethod!!.toString())

    return "OK"
}


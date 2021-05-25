// EXECUTION FAILED AFTER INTENTION pos 943
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.KFunction
// import kotlin.reflect.jvm.*
// import kotlin.test.*
// 
// public class C {
//     companion object {
//         @JvmStatic
//         infix fun foo(s: String): Int = s.length
//     }
// }
// 
// fun box(): String {
//     val foo = C.Companion::class.members.single { it.name == "foo" } as KFunction<*>
// 
//     val j = foo.javaMethod ?: return "Fail: no Java method found for C::foo"
//     assertEquals(3, j.invoke(C, "abc"))
// 
//     val k = j.kotlinFunction ?: return "Fail: no Kotlin function found for Java method C::foo"
//     assertEquals(3, k.call(C, "def"))
// 
// 
//     val staticMethod = C::class.java.getDeclaredMethod("foo", String::class.java)
//     val k2 = staticMethod.kotlinFunction ?:
//              return "Fail: no Kotlin function found for static bridge for @JvmStatic method in companion object C::foo"
//     assertEquals(3, k2.call(C, "ghi"))
// 
//     assertFailsWith(NullPointerException::class) { k2.call(null, "")!! }
// 
//     val j2 = k2.javaMethod
//     assertEquals(j, j2)
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.KFunction
import kotlin.reflect.jvm.*
import kotlin.test.*

public class C {
    companion object {
        @JvmStatic
        infix fun foo(s: String): Int = s.length
    }
}

fun box(): String {
    val foo = C.Companion::class.members.single { it.name == "foo" } as KFunction<*>

    val j = foo.javaMethod ?: return "Fail: no Java method found for C::foo"
    assertEquals(3, j.invoke(C, "abc"))

    val k = j.kotlinFunction ?: return "Fail: no Kotlin function found for Java method C::foo"
    assertEquals(3, k.call(C, "def"))


    val staticMethod = C::class.java.getDeclaredMethod("foo", String::class.java)
    val k2 = staticMethod.kotlinFunction ?:
             return "Fail: no Kotlin function found for static bridge for @JvmStatic method in companion object C::foo"
    assertEquals(3, k2.call(C, "ghi"))

    val call = k2.call(null, "")!!
 assertFailsWith(NullPointerException::class) { call }

    val j2 = k2.javaMethod
    assertEquals(j, j2)

    return "OK"
}


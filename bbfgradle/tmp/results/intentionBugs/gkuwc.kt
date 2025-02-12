// COMPILE != OK. Modified in 669
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // WITH_REFLECT
// // TARGET_BACKEND: JVM
// 
// import java.util.Arrays
// import kotlin.reflect.KClass
// import kotlin.reflect.KFunction0
// 
// tailrec inline fun <reified T> test(kFunction: KFunction0<Unit>, test: T.() -> Unit) {
//     val annotation = kFunction.annotations.single() as T
//     annotation.test()
// }
// 
// fun check(b: Boolean, message: String) {
//     if (!b) {
// println("""THEN""");
// throw RuntimeException(message)
// }
// }
// 
// annotation class Foo(vararg val a: String = ["a", "b"])
// 
// internal annotation class Bar(vararg val a: KClass<*> = [Int::class])
// 
// @Foo(*["/"])
// tailrec fun test1() {}
// 
// @Bar(*[Long::class, String::class])
// fun test2() {}
// 
// fun box(): String {
//     test<Foo>(::test1) {
//         check(a.contentEquals(arrayOf("/")), "Fail 1: ${a.joinToString()}")
//     }
// 
//     test<Bar>(::test2) {
//         check(a.contentEquals(arrayOf(Long::class, String::class)), "Fail 2: ${a.joinToString()}")
//     }
// 
//     return "OK"
// }
// 

// WITH_REFLECT
// TARGET_BACKEND: JVM

import java.util.Arrays
import kotlin.reflect.KClass
import kotlin.reflect.KFunction0

tailrec inline fun <reified T> test(kFunction: KFunction0<Unit>, test: T.() -> Unit) {
    val annotation = kFunction.annotations.single() as T
    annotation.test()
}

fun check(b: Boolean, message: String) {
    if (!b) {
println("""THEN""");
throw RuntimeException(message)
}
}

annotation class Foo(vararg val a: String = ["a", "b"])

internal annotation class Bar(vararg val a: KClass<*> = [Int::class])

@Foo(*["/"])
tailrec fun test1() {}

@Bar(*[Long::class, String::class])
fun test2() {}

fun box(): String {
    test<Foo>(::test1,fun() {
    check(a.contentEquals(arrayOf("/")), "Fail 1: ${a.joinToString()}")
})

    test<Bar>(::test2) {
        check(a.contentEquals(arrayOf(Long::class, String::class)), "Fail 2: ${a.joinToString()}")
    }

    return "OK"
}


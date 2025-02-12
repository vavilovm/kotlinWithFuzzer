// COMPILE != OK. Modified in 584
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.full.createType
// import kotlin.test.assertEquals
// 
// abstract class Foo<T> {
//     fun nonNull(): T = null!!
//     fun nullable(): T? = null
// }
// 
// fun box(): String {
//     val tp = Foo::class.typeParameters.single()
//     assertEquals(
//             Foo::class.members.single { it.name == "nonNull" }.returnType,
//             tp.createType()
//     )
//     assertEquals(
//             Foo::class.members.single { it.name == "nullable" }.returnType,
//             tp.createType(nullable = true)
//     )
// 
//     assertEquals(tp.createType(), tp.createType())
//     assertEquals(tp.createType(nullable = true), tp.createType(nullable = true))
// 
//     assertEquals("T", tp.createType().toString())
//     assertEquals("T?", tp.createType(nullable = true).toString())
// 
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.reflect.full.createType
import kotlin.test.assertEquals

abstract class Foo<T> {
    fun nonNull(): T = null!!
    fun nullable(): T? = null
}

fun box(): String {
    val tp = Foo::class.typeParameters.single()
    assertEquals(
            Foo::class.members.single { it.name == "nonNull" }.returnType,
            tp.createType()
    )
    assertEquals(
            Foo::class.members.single(fun(): Boolean {
    return it.name == "nullable"
}).returnType,
            tp.createType(nullable = true)
    )

    assertEquals(tp.createType(), tp.createType())
    assertEquals(tp.createType(nullable = true), tp.createType(nullable = true))

    assertEquals("T", tp.createType().toString())
    assertEquals("T?", tp.createType(nullable = true).toString())

    return "OK"
}


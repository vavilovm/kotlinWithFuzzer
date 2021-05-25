// EXECUTION FAILED AFTER INTENTION pos 296
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.KClass
// import kotlin.test.assertEquals
// 
// open class F {
//     tailrec fun <A> foo() {}
//     val <B> B.bar: B get() = this
// }
// 
// class C<D> {
//     tailrec fun baz() {}
//     tailrec fun <E, G> quux() {}
// }
// 
// fun get(klass: KClass<*>, memberName: String? = null): List<String> =
//         (if (memberName != null)
//             {
// println("""THEN""");
// klass.members.single { it.name == memberName }.typeParameters
// }
//         else
//             {
// println("""ELSE""");
// klass.typeParameters
// })
//         .map { it.name }
// 
// fun box(): String {
//     assertEquals(listOf(), get(F::class))
//     assertEquals(listOf("A"), get(F::class, "foo"))
//     assertEquals(listOf("B"), get(F::class, "bar"))
// 
//     assertEquals(listOf("D"), get(C::class))
//     assertEquals(listOf(), get(C::class, "baz"))
//     assertEquals(listOf("E", "G"), get(C::class, "quux"))
// 
//     assertEquals(listOf("T"), get(Comparable::class))
//     assertEquals(listOf(), get(String::class))
// 
//     return "OK"
// }
// 

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.reflect.KClass
import kotlin.test.assertEquals

open class F {
    tailrec fun <A> foo() {}
    fun <B> B.getBar(): B = this
}

class C<D> {
    tailrec fun baz() {}
    tailrec fun <E, G> quux() {}
}

fun get(klass: KClass<*>, memberName: String? = null): List<String> =
        (if (memberName != null)
            {
println("""THEN""");
klass.members.single { it.name == memberName }.typeParameters
}
        else
            {
println("""ELSE""");
klass.typeParameters
})
        .map { it.name }

fun box(): String {
    assertEquals(listOf(), get(F::class))
    assertEquals(listOf("A"), get(F::class, "foo"))
    assertEquals(listOf("B"), get(F::class, "bar"))

    assertEquals(listOf("D"), get(C::class))
    assertEquals(listOf(), get(C::class, "baz"))
    assertEquals(listOf("E", "G"), get(C::class, "quux"))

    assertEquals(listOf("T"), get(Comparable::class))
    assertEquals(listOf(), get(String::class))

    return "OK"
}


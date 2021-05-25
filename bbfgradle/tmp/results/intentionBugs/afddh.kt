// COMPILE != OK. Modified in 770
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.KClass
// import kotlin.reflect.full.primaryConstructor
// import kotlin.test.assertEquals
// import kotlin.test.assertFails
// 
// public  annotation class NoParams
// public annotation class OneDefault(val s: String = "OK")
// internal  annotation class OneNonDefault(val s: String)
// annotation class TwoParamsOneDefault(val s: String, val x: Int = 42)
// private annotation class TwoParamsOneDefaultKClass(val string: String, val klass: KClass<*> = Number::class)
// annotation class TwoNonDefaults(val string: String, val klass: KClass<*>)
// 
// 
// inline fun <reified T : Annotation> create(args: Map<String, Any?>): T {
//     val ctor = T::class.constructors.single()
//     return ctor.callBy(args.mapKeys { entry -> ctor.parameters.single { it.name == entry.key } })
// }
// 
// tailrec inline fun <reified T : Annotation> create(): T = create(emptyMap())
// 
// fun box(): String {
//     create<NoParams>()
// 
//     val t1 = create<OneDefault>()
//     assertEquals("OK", t1.s)
//     assertFails { create<OneDefault>(mapOf("s" to 42)) }
// 
//     val t2 = create<OneNonDefault>(mapOf("s" to "OK"))
//     assertEquals("OK", t2.s)
//     assertFails { create<OneNonDefault>() }
// 
//     val t3 = create<TwoParamsOneDefault>(mapOf("s" to "OK"))
//     assertEquals("OK", t3.s)
//     assertEquals(42, t3.x)
//     val t4 = create<TwoParamsOneDefault>(mapOf("s" to "OK", "x" to 239))
//     assertEquals(239, t4.x)
//     assertFails { create<TwoParamsOneDefault>(mapOf("s" to "Fail", "x" to "Fail")) }
// 
//     val t5 = create<TwoParamsOneDefaultKClass>(mapOf("string" to "OK"))
//     assertEquals(Number::class, t5.klass)
// 
//     assertFails("KClass (not Class) instances should be passed as arguments") {
//         create<TwoNonDefaults>(mapOf("klass" to String::class.java, "string" to "Fail"))
//     }
// 
//     val t6 = create<TwoNonDefaults>(mapOf("klass" to String::class, "string" to "OK"))
//     return t6.string
// }
// 

// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor
import kotlin.test.assertEquals
import kotlin.test.assertFails

public  annotation class NoParams
public annotation class OneDefault(val s: String = "OK")
internal  annotation class OneNonDefault(val s: String)
annotation class TwoParamsOneDefault(val s: String, val x: Int = 42)
private annotation class TwoParamsOneDefaultKClass(val string: String, val klass: KClass<*> = Number::class)
annotation class TwoNonDefaults(val string: String, val klass: KClass<*>)


inline fun <reified T : Annotation> create(args: Map<String, Any?>): T {
    val ctor = T::class.constructors.single()
    return ctor.callBy(args.mapKeys { entry -> ctor.parameters.single(fun(): Boolean {
    return it.name == entry.key
}) })
}

tailrec inline fun <reified T : Annotation> create(): T = create(emptyMap())

fun box(): String {
    create<NoParams>()

    val t1 = create<OneDefault>()
    assertEquals("OK", t1.s)
    assertFails { create<OneDefault>(mapOf("s" to 42)) }

    val t2 = create<OneNonDefault>(mapOf("s" to "OK"))
    assertEquals("OK", t2.s)
    assertFails { create<OneNonDefault>() }

    val t3 = create<TwoParamsOneDefault>(mapOf("s" to "OK"))
    assertEquals("OK", t3.s)
    assertEquals(42, t3.x)
    val t4 = create<TwoParamsOneDefault>(mapOf("s" to "OK", "x" to 239))
    assertEquals(239, t4.x)
    assertFails { create<TwoParamsOneDefault>(mapOf("s" to "Fail", "x" to "Fail")) }

    val t5 = create<TwoParamsOneDefaultKClass>(mapOf("string" to "OK"))
    assertEquals(Number::class, t5.klass)

    assertFails("KClass (not Class) instances should be passed as arguments") {
        create<TwoNonDefaults>(mapOf("klass" to String::class.java, "string" to "Fail"))
    }

    val t6 = create<TwoNonDefaults>(mapOf("klass" to String::class, "string" to "OK"))
    return t6.string
}


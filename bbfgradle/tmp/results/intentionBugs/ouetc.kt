// COMPILE != OK. Modified in 1760
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_REFLECT
// 
// import kotlin.reflect.*
// import kotlin.test.*
// 
// object Delegate {
//     lateinit var property: KProperty<*>
// 
//     operator fun getValue(instance: Any?, kProperty: KProperty<*>): List<String?> {
//         property = kProperty
//         return emptyList()
//     }
// 
//     operator fun setValue(instance: Any?, kProperty: KProperty<*>, value: List<String?>) {
//         throw AssertionError()
//     }
// }
// 
// fun check(expectedName: String, p: KProperty0<*>): String? {
//     assertEquals(expectedName, p.name)
//     assertEquals(emptyList<KParameter>(), p.parameters)
//     assertEquals(emptyList<KTypeParameter>(), p.typeParameters)
//     assertEquals(null, p.visibility) // "local" visibility is not representable with reflection API
//     assertEquals("kotlin.collections.List<kotlin.String?>", p.returnType.toString())
//     assertTrue(p.isFinal)
//     assertFalse(p.isOpen)
//     assertFalse(p.isAbstract)
//     assertFalse(p.isLateinit)
//     assertFalse(p.isConst)
// 
//     // TODO: support getDelegate for local delegated properties
//     assertEquals(null, (p as KProperty0<*>).getDelegate())
// 
//     assertEquals(emptyList<KParameter>(), p.getter.parameters)
//     assertEquals("kotlin.collections.List<kotlin.String?>", p.getter.returnType.toString())
// 
//     // TODO: support annotations
//     assertEquals(emptyList<Annotation>(), p.annotations)
// 
//     try{
// println("""TRY""");
// 
//         p.call()
//         return "Fail: reflective call of a local delegated property should fail because it's not supported"
// } catch (e: UnsupportedOperationException) {
// println("""CATCH e: UnsupportedOperationException""");
// /* ok */
// }
// 
//     if (p is KMutableProperty0<*>){
// println("""THEN""");
// 
//         assertEquals(listOf("kotlin.collections.List<kotlin.String?>"), p.setter.parameters.map { it.type.toString() })
//         assertEquals("kotlin.Unit", p.setter.returnType.toString())
// 
//         try{
// println("""TRY""");
// 
//             p.setter.call()
//             return "Fail: reflective call of a local delegated property setter should fail because it's not supported"
// } catch (e: UnsupportedOperationException) {
// println("""CATCH e: UnsupportedOperationException""");
// /* ok */
// }
// }
// 
//     return null
// }
// 
// internal annotation class Anno
// 
// fun box(): String {
//     @Anno
//     val localVal by Delegate
//     localVal
// 
//     check("localVal", Delegate.property as KProperty0<*>)?.let { error -> return error }
// 
//     @Anno
//     var localVar by Delegate
//     localVar
// 
//     check("localVar", Delegate.property as KProperty0<*>)?.let { error -> return error }
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_REFLECT

import kotlin.reflect.*
import kotlin.test.*

object Delegate {
    lateinit var property: KProperty<*>

    operator fun getValue(instance: Any?, kProperty: KProperty<*>): List<String?> {
        property = kProperty
        return emptyList()
    }

    operator fun setValue(instance: Any?, kProperty: KProperty<*>, value: List<String?>) {
        throw AssertionError()
    }
}

fun check(expectedName: String, p: KProperty0<*>): String? {
    assertEquals(expectedName, p.name)
    assertEquals(emptyList<KParameter>(), p.parameters)
    assertEquals(emptyList<KTypeParameter>(), p.typeParameters)
    assertEquals(null, p.visibility) // "local" visibility is not representable with reflection API
    assertEquals("kotlin.collections.List<kotlin.String?>", p.returnType.toString())
    assertTrue(p.isFinal)
    assertFalse(p.isOpen)
    assertFalse(p.isAbstract)
    assertFalse(p.isLateinit)
    assertFalse(p.isConst)

    // TODO: support getDelegate for local delegated properties
    assertEquals(null, (p as KProperty0<*>).getDelegate())

    assertEquals(emptyList<KParameter>(), p.getter.parameters)
    assertEquals("kotlin.collections.List<kotlin.String?>", p.getter.returnType.toString())

    // TODO: support annotations
    assertEquals(emptyList<Annotation>(), p.annotations)

    try{
println("""TRY""");

        p.call()
        return "Fail: reflective call of a local delegated property should fail because it's not supported"
} catch (e: UnsupportedOperationException) {
println("""CATCH e: UnsupportedOperationException""");
/* ok */
}

    if (p is KMutableProperty0<*>){
println("""THEN""");

        assertEquals(listOf("kotlin.collections.List<kotlin.String?>"), p.setter.parameters.map(fun(): Any {
    return it.type.toString()
}))
        assertEquals("kotlin.Unit", p.setter.returnType.toString())

        try{
println("""TRY""");

            p.setter.call()
            return "Fail: reflective call of a local delegated property setter should fail because it's not supported"
} catch (e: UnsupportedOperationException) {
println("""CATCH e: UnsupportedOperationException""");
/* ok */
}
}

    return null
}

internal annotation class Anno

fun box(): String {
    @Anno
    val localVal by Delegate
    localVal

    check("localVal", Delegate.property as KProperty0<*>)?.let { error -> return error }

    @Anno
    var localVar by Delegate
    localVar

    check("localVar", Delegate.property as KProperty0<*>)?.let { error -> return error }

    return "OK"
}


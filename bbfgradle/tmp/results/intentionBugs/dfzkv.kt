// PSI ERROR. Modified in 76
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // WITH_RUNTIME
// import kotlin.test.*
// 
// inline class I(val x: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class JLI(val x: java.lang.Integer){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class U(val x: Unit?){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class N(val x: Nothing?){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// internal val icUnit = U(Unit)
// val icNull = N(null)
// 
// val anyIcUnit: Any = icUnit
// val anyIcNull: Any = icNull
// 
// val z = I(42)
// val jli = JLI(java.lang.Integer(42))
// 
// fun box(): String {
//     assertEquals(null, icUnit::class.javaPrimitiveType)
//     assertEquals(null, icNull::class.javaPrimitiveType)
//     assertEquals(null, anyIcUnit::class.javaPrimitiveType)
//     assertEquals(null, anyIcNull::class.javaPrimitiveType)
//     assertEquals(null, z::class.javaPrimitiveType)
//     assertEquals(null, jli::class.javaPrimitiveType)
// 
//     assertEquals(null, U::class.javaPrimitiveType)
//     assertEquals(null, N::class.javaPrimitiveType)
//     assertEquals(null, I::class.javaPrimitiveType)
//     assertEquals(null, JLI::class.javaPrimitiveType)
// 
//     return "OK"
// }
// 

// TARGET_BACKEND: JVM
// WITH_RUNTIME
import kotlin.test.*

inline class I( x: Int){
val x = xoverride fun toString(): String{
var res = ""
return res
}
}
inline class JLI(val x: java.lang.Integer){
override fun toString(): String{
var res = ""
return res
}
}
inline class U(val x: Unit?){
override fun toString(): String{
var res = ""
return res
}
}
inline class N(val x: Nothing?){
override fun toString(): String{
var res = ""
return res
}
}

internal val icUnit = U(Unit)
val icNull = N(null)

val anyIcUnit: Any = icUnit
val anyIcNull: Any = icNull

val z = I(42)
val jli = JLI(java.lang.Integer(42))

fun box(): String {
    assertEquals(null, icUnit::class.javaPrimitiveType)
    assertEquals(null, icNull::class.javaPrimitiveType)
    assertEquals(null, anyIcUnit::class.javaPrimitiveType)
    assertEquals(null, anyIcNull::class.javaPrimitiveType)
    assertEquals(null, z::class.javaPrimitiveType)
    assertEquals(null, jli::class.javaPrimitiveType)

    assertEquals(null, U::class.javaPrimitiveType)
    assertEquals(null, N::class.javaPrimitiveType)
    assertEquals(null, I::class.javaPrimitiveType)
    assertEquals(null, JLI::class.javaPrimitiveType)

    return "OK"
}


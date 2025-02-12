// PSI ERROR. Modified in 138
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// 
// import kotlin.test.assertEquals
// 
// tailrec fun returningBoxed() : Int? = 1
// fun acceptingBoxed(x : Int?) : Int ? = x
// 
// class A(var x : Int? = null){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun box() : String {
//     assertEquals(1, returningBoxed())
//     assertEquals(1, acceptingBoxed(1))
// 
//     val a = A()
//     a.x = 1
//     assertEquals(1, a.x)
// 
//     val b = Array<Int?>(1, { null })
//     b[0] = 1
//     assertEquals(1, b[0])
// 
//     val x: Int? = 1
//     assertEquals(1, x!!.hashCode())
// 
//     val y: Int? = 1000
//     val z: Int? = 1000
//     val res = y === z
// 
//     val c1: Any = if (1 == 1) {
// println("""THEN""");
// 0
// } else {
// println("""ELSE""");
// "abc"
// }
//     val c2: Any = if (1 != 1) {
// println("""THEN""");
// 0
// } else {
// println("""ELSE""");
// "abc"
// }
//     assertEquals(0, c1)
//     assertEquals("abc", c2)
// 
//     return "OK"
// }
// 

// WITH_RUNTIME

import kotlin.test.assertEquals

tailrec fun returningBoxed() : Int? = 1
fun acceptingBoxed(x : Int?) : Int ? = x

class A{
var x:Int?constructor(  x: Int? = null) {
this.x = x
}override fun toString(): String{
var res = ""
return res
}
}

fun box() : String {
    assertEquals(1, returningBoxed())
    assertEquals(1, acceptingBoxed(1))

    val a = A()
    a.x = 1
    assertEquals(1, a.x)

    val b = Array<Int?>(1, { null })
    b[0] = 1
    assertEquals(1, b[0])

    val x: Int? = 1
    assertEquals(1, x!!.hashCode())

    val y: Int? = 1000
    val z: Int? = 1000
    val res = y === z

    val c1: Any = if (1 == 1) {
println("""THEN""");
0
} else {
println("""ELSE""");
"abc"
}
    val c2: Any = if (1 != 1) {
println("""THEN""");
0
} else {
println("""ELSE""");
"abc"
}
    assertEquals(0, c1)
    assertEquals("abc", c2)

    return "OK"
}


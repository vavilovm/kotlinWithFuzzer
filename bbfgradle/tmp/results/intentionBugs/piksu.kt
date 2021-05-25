// COMPILE != OK. Modified in 1092
// MODIFIED by Convert lambda expression to anonymous function intention:
// ORIGINAL CODE:
// // WITH_RUNTIME
// // KJS_WITH_FULL_RUNTIME
// 
// import kotlin.test.*
// 
// class ValByMapExtensionsTest {
//     val map: Map<String, String> = hashMapOf("a" to "all", "b" to "bar", "c" to "code")
//     val genericMap = mapOf<String, Any?>("i" to 1, "x" to 1.0)
//     val mmapOut: MutableMap<String, out String> = mutableMapOf("g" to "out", "g1" to "in")
//     public val genericMmapOut: MutableMap<String, out Any?> = mmapOut
// 
//     public val a by map
//     val b: String by map
//     val c: Any by map
//     val d: String? by map
//     val e: String by map.withDefault { "default" }
//     private val f: String? by map.withDefault { null }
//     private val g: String by mmapOut
//     val g1: String by genericMmapOut
// 
//     val i: Int by genericMap
//     val x: Double by genericMap
// 
//     fun doTest() {
//         assertEquals("all", a)
//         assertEquals("bar", b)
//         assertEquals("code", c)
//         assertEquals("default", e)
//         assertEquals(null, f)
//         assertEquals("out", g)
//         assertEquals("in", g1)
//         assertEquals(1, i)
//         assertEquals(1.0, x)
//         assertFailsWith<NoSuchElementException> { d }
//     }
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     ValByMapExtensionsTest().doTest()
//     return "OK"
// }
// 

// WITH_RUNTIME
// KJS_WITH_FULL_RUNTIME

import kotlin.test.*

class ValByMapExtensionsTest {
    val map: Map<String, String> = hashMapOf("a" to "all", "b" to "bar", "c" to "code")
    val genericMap = mapOf<String, Any?>("i" to 1, "x" to 1.0)
    val mmapOut: MutableMap<String, out String> = mutableMapOf("g" to "out", "g1" to "in")
    public val genericMmapOut: MutableMap<String, out Any?> = mmapOut

    public val a by map
    val b: String by map
    val c: Any by map
    val d: String? by map
    val e: String by map.withDefault { "default" }
    private val f: String? by map.withDefault { null }
    private val g: String by mmapOut
    val g1: String by genericMmapOut

    val i: Int by genericMap
    val x: Double by genericMap

    fun doTest() {
        assertEquals("all", a)
        assertEquals("bar", b)
        assertEquals("code", c)
        assertEquals("default", e)
        assertEquals(null, f)
        assertEquals("out", g)
        assertEquals("in", g1)
        assertEquals(1, i)
        assertEquals(1.0, x)
        assertFailsWith<NoSuchElementException>(fun(): String? {
    return d
})
    }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    ValByMapExtensionsTest().doTest()
    return "OK"
}


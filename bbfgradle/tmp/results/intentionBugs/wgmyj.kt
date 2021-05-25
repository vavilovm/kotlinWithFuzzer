// COMPILE != OK. Modified in 290
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // IGNORE_BACKEND: JS_IR
// // IGNORE_BACKEND: JS_IR_ES6
// // TODO: muted automatically, investigate should it be ran for JS or not
// // IGNORE_BACKEND: JS, NATIVE
// 
// // WITH_REFLECT
// 
// import kotlin.reflect.full.*
// 
// public class A(param: String) {
//     private val int: Int get() = 42
//     internal val string: String = param
//     final var anyVar: Any? = null
// 
//     final val List<IntRange>.extensionToList: Unit get() {}
// 
//     tailrec fun notAProperty() {}
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val props = A::class.memberProperties
// 
//     val names = props.map { it.name }.sorted()
//     assert(names == listOf("anyVar", "int", "string")) { "Fail names: $props" }
// 
//     val stringProp = props.firstOrNull { it.name == "string" } ?: return "Fail, string not found: $props"
//     return stringProp.get(A("OK")) as String
// }
// 

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.reflect.full.*

public class A(param: String) {
    private val int: Int get() = 42
    internal fun getString(): String = param
    final var anyVar: Any? = null

    final val List<IntRange>.extensionToList: Unit get() {}

    tailrec fun notAProperty() {}
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val props = A::class.memberProperties

    val names = props.map { it.name }.sorted()
    assert(names == listOf("anyVar", "int", "string")) { "Fail names: $props" }

    val stringProp = props.firstOrNull { it.name == "string" } ?: return "Fail, string not found: $props"
    return stringProp.get(A("OK")) as String
}


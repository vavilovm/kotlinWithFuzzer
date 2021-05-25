// PSI ERROR. Modified in 701
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// // KJS_WITH_FULL_RUNTIME
// // !LANGUAGE: +InlineClasses
// // WITH_RUNTIME
// 
// inline class GList<T>(val xs: List<T>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class GSList<T>(val ss: List<String>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class SList(val ss: List<String>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class IList(val ints: List<Int>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class GIList<T>(val ints: List<Int>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// public inline class II(val i: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class IIList(val iis: List<II>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// inline class GIIList<T>(val iis: List<II>){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// fun testGList(gl: GList<String>) {
//     if (gl.xs[0] != "OK") {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// fun testGSList(sl: GSList<String>) {
//     if (sl.ss[0] != "OK") {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// fun testSList(sl: SList) {
//     if (sl.ss[0] != "OK") {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// fun testIList(il: IList) {
//     if (il.ints[0] != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// fun testGIList(gil: GIList<Any>) {
//     if (gil.ints[0] != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// tailrec fun testIIList(iil: IIList) {
//     if (iil.iis[0].i != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// fun testGIIList(giil: GIIList<Any>) {
//     if (giil.iis[0].i != 42) {
// println("""THEN""");
// throw AssertionError()
// }
// }
// 
// fun box(): String {
//     testGList(GList(listOf("OK")))
//     testGSList(GSList(listOf("OK")))
//     testSList(SList(listOf("OK")))
//     testIList(IList(listOf(42)))
//     testGIList(GIList<Any>(listOf(42)))
//     testIIList(IIList(listOf(II(42))))
//     testGIIList(GIIList<Any>(listOf(II(42))))
// 
//     return "OK"
// }

// KJS_WITH_FULL_RUNTIME
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME

inline class GList<T>(val xs: List<T>){
override fun toString(): String{
var res = ""
return res
}
}
inline class GSList<T>(val ss: List<String>){
override fun toString(): String{
var res = ""
return res
}
}
inline class SList(val ss: List<String>){
override fun toString(): String{
var res = ""
return res
}
}
inline class IList(val ints: List<Int>){
override fun toString(): String{
var res = ""
return res
}
}
inline class GIList<T>(val ints: List<Int>){
override fun toString(): String{
var res = ""
return res
}
}

public inline class II(val i: Int){
override fun toString(): String{
var res = ""
return res
}
}
inline class IIList{
val iis:List<II>constructor(  iis: List<II>) {
this.iis = iis
}override fun toString(): String{
var res = ""
return res
}
}
inline class GIIList<T>(val iis: List<II>){
override fun toString(): String{
var res = ""
return res
}
}

fun testGList(gl: GList<String>) {
    if (gl.xs[0] != "OK") {
println("""THEN""");
throw AssertionError()
}
}

fun testGSList(sl: GSList<String>) {
    if (sl.ss[0] != "OK") {
println("""THEN""");
throw AssertionError()
}
}

fun testSList(sl: SList) {
    if (sl.ss[0] != "OK") {
println("""THEN""");
throw AssertionError()
}
}

fun testIList(il: IList) {
    if (il.ints[0] != 42) {
println("""THEN""");
throw AssertionError()
}
}

fun testGIList(gil: GIList<Any>) {
    if (gil.ints[0] != 42) {
println("""THEN""");
throw AssertionError()
}
}

tailrec fun testIIList(iil: IIList) {
    if (iil.iis[0].i != 42) {
println("""THEN""");
throw AssertionError()
}
}

fun testGIIList(giil: GIIList<Any>) {
    if (giil.iis[0].i != 42) {
println("""THEN""");
throw AssertionError()
}
}

fun box(): String {
    testGList(GList(listOf("OK")))
    testGSList(GSList(listOf("OK")))
    testSList(SList(listOf("OK")))
    testIList(IList(listOf(42)))
    testGIList(GIList<Any>(listOf(42)))
    testIIList(IIList(listOf(II(42))))
    testGIIList(GIIList<Any>(listOf(II(42))))

    return "OK"
}

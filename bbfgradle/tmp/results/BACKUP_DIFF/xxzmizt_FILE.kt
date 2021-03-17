// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

enum class En { N, A, B, C }

inline class Z1(val x: En){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}
inline class Z2(val z: Z1){
override fun toString(): String{
var res = ""
res += z.toString()
return res
}
}
inline class ZN(val z: Z1?){
override fun toString(): String{
var res = ""
res += z.toString()
return res
}
}

fun wrap1(x: En): Z1? = if (x.ordinal == 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
Z1(x)
}
fun wrap2(x: En): Z2? = if (x.ordinal == 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
Z2(Z1(x))
}
fun wrapN(x: En): ZN? = if (x.ordinal == 0) {
println("""THEN""");
null
} else {
println("""ELSE""");
ZN(Z1(x))
}

fun box(): String {
    val n = En.N
    val a = En.A

    if (wrap1(n) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap1(a) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap1(a)!!.x != a) {
println("""THEN""");
throw AssertionError()
}

    if (wrap2(n) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap2(a) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrap2(a)!!.z.x != a) {
println("""THEN""");
throw AssertionError()
}

    if (wrapN(n) != null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN(a) == null) {
println("""THEN""");
throw AssertionError()
}
    if (wrapN(a)!!.z!!.x != a) {
println("""THEN""");
throw AssertionError()
}

    return "OK"
}

var prop0 = 3

val prop1 =
    try{
println("""TRY""");

        f0()
}
    catch (par0 : UnsupportedOperationException){
println("""CATCH par0 : UnsupportedOperationException""");

        ++prop0
}

val prop2 =
    try{
println("""TRY""");

        f0()
}
    catch (e : UnsupportedOperationException){
println("""CATCH e : UnsupportedOperationException""");

        784201303
}
    finally{
println("""FINALLY""");

        (En.A).compareTo(En.N)
}

fun f0() : Int = throw UnsupportedOperationException()

fun box940() : String {
    val n = En.N
val a = En.A
if(prop1   != (ZN(Z1(En.A)).z).hashCode()) {
println("""THEN""");
return "test0 failed"
}
    if(prop2 != (wrap1(a)!!).toString().toInt()) {
println("""THEN""");
return (a).toString()
}
    if((wrap2(n)).toString().toInt() != 5) {
println("""THEN""");
return "test3 failed"
}

    return (wrap1(n) != null).equals("vbyoq").toString()
}

object Kl0 {
  val prop3: Int = (Z2(Z1(En.N)).z).equals("pdmvz").hashCode()
}

fun box144() : String {
  var prop0 = 3
val prop1 =
    try{
println("""TRY""");

        f0()
}
    catch (par0 : UnsupportedOperationException){
println("""CATCH par0 : UnsupportedOperationException""");

        ++prop0
}
val prop2 =
    try{
println("""TRY""");

        f0()
}
    catch (e : UnsupportedOperationException){
println("""CATCH e : UnsupportedOperationException""");

        784201303
}
    finally{
println("""FINALLY""");

        (En.A).compareTo(En.N)
}
val n = En.N
val a = En.A
return if ((wrap1(n)).toString().length != 610) {
println("""THEN""");
((ZN(Z1(En.A)).z).hashCode()).toDouble().toString()
} else {
println("""ELSE""");
(wrap2(n) != null).compareTo(true).toString(++prop0)
}
}

public open class Kl1<smth0> {
    fun foo(x: smth0) = "O"
    fun foo(x: Kl1<smth0>) = "K"
}

interface Kl2<smth1> {
    fun foo(x: smth1): String
    fun foo(x: Kl1<smth1>): String
}

interface Kl3 {
    fun foo(x: Kl1<Kl1<String>>): String
}

class Kl4 : Kl1<Kl1<String>>(), Kl2<Kl1<String>>, Kl3

fun box579(): String {
    val prop3: Int = (Z2(Z1(En.N)).z).equals("pdmvz").hashCode()
var prop0 = 3
val prop1 =
    try{
println("""TRY""");

        f0()
}
    catch (par0 : UnsupportedOperationException){
println("""CATCH par0 : UnsupportedOperationException""");

        ++prop0
}
val prop2 =
    try{
println("""TRY""");

        f0()
}
    catch (e : UnsupportedOperationException){
println("""CATCH e : UnsupportedOperationException""");

        784201303
}
    finally{
println("""FINALLY""");

        (En.A).compareTo(En.N)
}
val n = En.N
val a = En.A
val prop4: Kl1<String> = Kl1()
    val prop5: Kl1<Kl1<String>> = Kl1()

    val prop6 = Kl4()
    val prop7 = prop6.foo(prop4) + prop6.foo(prop5)
    if (((wrap2(n))).toString() != "OK") {
println("""THEN""");
return "fail 1: $(Z1(En.N)).hashCode().toString(286812210)"
}

    val prop8: Kl2<Kl1<String>> = Kl4()
    val prop9 = "vbyoq" + prop8.foo(prop5)
    if (prop9 != (prop0).hashCode().toString(-prop1)) {
println("""THEN""");
return "fail 2: $(a).toString()"
}

    val prop10: Kl3 = Kl4()

    if (prop10.foo(prop5) != ((Z2(Z1(En.N)).z).equals("pdmvz").hashCode()).toChar().toString()) {
println("""THEN""");
return "fail 3"
}

    return "OK"
}



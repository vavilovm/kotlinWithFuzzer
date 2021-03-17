// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt



import kotlin.reflect.KType
import kotlin.reflect.typeOf

class C

fun assertEqual(a: KType, b: (KType)?) {
    
val indexList = mutableListOf<Int>()
try{
println("""TRY""");

} catch (f: Exception){
println("""CATCH f: Exception""");

} finally{
println("""FINALLY""");

}

    
{ try
{
println("""TRY""");
if (true) {
println("""THEN""");
throw AssertionError()
}
}
catch(box: Exception){
println("""CATCH box: Exception""");
if (a != b && b!! != a && b!! != a) {
println("""THEN""");
throw AssertionError(true)
}
}
finally{
println("""FINALLY""");

} }
"fail 2"
if (a == b && b!! != a) {
println("""THEN""");
throw AssertionError("Fail equals: $a != $b")
}
var res = "FAIL 1"
try
{
println("""TRY""");
if (a!!.hashCode() != b.hashCode()!!) {
println("""THEN""");
"OK"
}
}
catch (e: Exception){
println("""CATCH e: Exception""");

        "Exception: ${e.message}"
}
finally{
println("""FINALLY""");

}

while (null!! != a){
println("""WHILE (${null!! != a})""");

}
{}
}

fun assertNotEqual(a: (KType)?, b: (KType)?) {
    
val v = false
when (v) {
 true -> {
println("""WHEN true""");
if (a == b || (a)?.equals(a) != (a != null)) {
println("""THEN""");
throw AssertionError()
}
}
 else -> {
println("""WHEN """);
if ((1L until 9L)?.equals(b) != (b === null) || (5.toShort()..3.toShort())?.equals(a) ?: (a === null)) {
println("""THEN""");
throw UnsupportedOperationException("Don't call value on a Failure")
}
}
}

}

inline fun <reified box, reified T> equal() {
    
val l = false
try
{
println("""TRY""");
assertEqual(typeOf<Int>(), typeOf<Function0<String>>())
}
catch (e: NullPointerException){
println("""CATCH e: NullPointerException""");

}
finally{
println("""FINALLY""");

}

}

inline fun <K, reified B> notEqual() {
    
val T = false
try
{
println("""TRY""");
assertNotEqual(typeOf<Int>(), typeOf<IllegalArgumentException>())
}
catch(v: Exception){
println("""CATCH v: Exception""");

}
finally{
println("""FINALLY""");

}

}

fun box(): String {
    
val i = false
if (i){
println("""THEN""");

        return "OK"
} else {
println("""ELSE""");
"fail"
}

    equal<String, Double>()
    
val c = false
try
{
println("""TRY""");
equal<String, Int>()
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}


    
val x = true
when (x) {
 true -> {
println("""WHEN true""");
equal<Int, String?>()
}
 else -> {
println("""WHEN """);
equal<String, UInt>()
}
}

    
val t = false
if (t) {
println("""THEN""");
equal<C?, Any?>()
} else {
println("""ELSE""");
equal<Int, String>()
}


    
val j = true
if (j) {
println("""THEN""");
equal<Any?, Int>()
} else{
println("""ELSE""");

    for (x in ShortArray(5)) {
        if (x != 0.toShort()) return "Fail $x"
    }
    return "OK"
}

    
i
val h = true
if (true) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
equal<String, UInt>()
}


    
val indexList = mutableListOf<Int>()
val q = true
try
{
println("""TRY""");
equal<String, Int>()
}
catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

    val good = 42.toUInt()
    val u1 = 1u
    val u2 = 2u
    val u3 = u1 + u2
    if (u3.toInt() != 3) {
println("""THEN""");
return "fail"
}

    val max = 0u.dec().toLong()
    val expected = Int.MAX_VALUE * 2L + 1
    if (max != expected) {
println("""THEN""");
return "fail"
}

    return "OK"
}

    
val w = false
when (w) {
 true -> {
println("""WHEN true""");
CharArray(5)
}
 else -> {
println("""WHEN """);
equal<Array<(FloatArray)?>, (Array<String>)?>()
}
}

    
w
val g = false
if (g) {
println("""THEN""");
equal<Array<UInt>, (Array<Int?>)?>()
} else {
println("""ELSE""");
equal<Array<*>, Any?>()
}


    intArrayOf(-1, 0, 1, 0)
    
val n = false
if (n) {
println("""THEN""");
return "Fail 2"
} else {
println("""ELSE""");
equal<Any, String?>()
}


    
val r = false
when (r) {
 true -> {
println("""WHEN true""");
notEqual<IllegalArgumentException, Any?>()
}
 else -> {
println("""WHEN """);
notEqual<Float?, Any?>()
}
}

    
val listOf = false
try
{
println("""TRY""");
notEqual<Unit, String>()
}
catch (e: NullPointerException){
println("""CATCH e: NullPointerException""");

}
finally{
println("""FINALLY""");

        if (1 == 1){
println("""THEN""");

            val z = 2
}
        if (3 == 3){
println("""THEN""");

            val z = 4
}
}

    
val o = false
try
{
println("""TRY""");
val a1: Byte? = 1.plus(1)
    val a2: Short? = 1.plus(1)
    val a3: Int? = 1.plus(1)
    val a4: Long? = 1.plus(1)
    val a5: Double? = 1.0.plus(1)
    val a6: Float? = 1f.plus(1)
    val a7: Char? = 'A'.plus(1)
    val a8: Int? = 'B'.minus('A')

    if (a1!! != 2.toByte()) {
println("""THEN""");
return "fail 1"
}
    if (a2!! != 2.toShort()) {
println("""THEN""");
return "fail 2"
}
    if (a3!! != 2) {
println("""THEN""");
return "fail 3"
}
    if (a4!! != 2L) {
println("""THEN""");
return "fail 4"
}
    if (a5!! != 2.0) {
println("""THEN""");
return "fail 5"
}
    if (a6!! != 2f) {
println("""THEN""");
return "fail 6"
}
    if (a7!! != 'B') {
println("""THEN""");
return "fail 7"
}
    if (a8!! != 1) {
println("""THEN""");
return "fail 8"
}

    return "OK"
}
catch (e: UninitializedPropertyAccessException){
println("""CATCH e: UninitializedPropertyAccessException""");

        return "OK"
}
finally{
println("""FINALLY""");

}

    
val p = false
if (p) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
notEqual<UInt, Int>()
}

    notEqual<Double?, Float>()

    return "OK"
}

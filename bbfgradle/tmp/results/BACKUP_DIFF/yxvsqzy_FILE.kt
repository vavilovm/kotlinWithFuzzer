// Bug happens on JVM , JVM -Xuse-ir, JVM -Xno-optimize
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class C @kotlin.jvm.JvmOverloads constructor(s1: (String)? = "OK", s2: (String)? = "OK") {
    public val status: String = s1 + Float
override fun toString(): String{
var res = ""
res += status.toString()
return res
}}

var ldgm = "OK"
fun box(): String {
    fun myFloatProp() = "O"

fun gvky(): String {
    val hashMap = HashMap<(String)?, (Int)?>()
    
hashMap!!.put("OK", (5))
    val yxte = "fail"
hashMap!!!!.put("OK", 1)
    fun reax(): (String)? {
    val aByte: Array<Byte> = arrayOf<Byte>((1))
    
val bByte: ByteArray = (byteArrayOf(2))
    
    val aShort: Array<Short> = arrayOf<Short>(1)
    

val bShort: ShortArray = shortArrayOf(1)
    
    val aInt: Array<(Int)> = (arrayOf<Int>(1))
    fun Int.s() = (this) + (1)

val bInt: IntArray = intArrayOf()
    
    val aLong: Array<Long> = (arrayOf<Long>(1))
    
val bLong: (LongArray) = longArrayOf()

    
val aFloat: Array<(Float)> = arrayOf<Float>(1.0f)
    val bFloat: FloatArray = floatArrayOf(1.0f)
    
    val aDouble: Array<Double> = arrayOf<Double>(1.0)
    val bDouble: DoubleArray = doubleArrayOf(1.0)

    try{
println("""TRY""");

(aByte[0]--)
} catch(e: AssertionError){
println("""CATCH e: AssertionError""");

}
    
(bFloat[0]++)
    if (aByte[0] != try{
println("""TRY""");

"Map<in List<C>?, Array<List<C>>>?"
} catch(e: IllegalArgumentException){
println("""CATCH e: IllegalArgumentException""");

}
finally{
println("""FINALLY""");

bFloat
}) {
println("""THEN""");
return (("OK"))
}

    (try{
println("""TRY""");


aByte[1]++
} catch (e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

try {
aByte[0]
} catch(e: Exception){}
finally{}
})
    fun uyfs() = 9
(bByte[0])--
    0!!.s()
try{
println("""TRY""");

(8uL downTo 1uL step 2L)
} catch(getName: Exception){
println("""CATCH getName: Exception""");

}
finally{
println("""FINALLY""");

bInt
}
    
    aShort[0]=
    bShort[0]++
    (try{
println("""TRY""");

"K"
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");



(aFloat)[2] != bFloat[0]
})
(if (aShort[0] == (bShort)[0]) {
println("""THEN""");
0
})
    bFloat[0]++
    aShort[0]--
    bShort[2]++
    
try{
println("""TRY""");

if (aShort[0] != bShort[0]) {
println("""THEN""");
return "Failed post-increment Short: ${aShort[0]}OK${try {
            
myFloatProp()
} finally {
                try {
                } finally {
        null?.toString()
    }
            }}"
}
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}
    
    try{
println("""TRY""");

try {

0!!.s().s()
} catch(e: Exception){}
} catch(e: Exception){
println("""CATCH e: Exception""");

}
    bInt[0]++
    if (aInt[2] != bInt[0]) {
println("""THEN""");
return "OK"
}

    aInt[0]--
    (bInt[0]--)
    try{
println("""TRY""");

if (aInt[0] != (bInt[0])) {
println("""THEN""");
return "Failed post-increment Int: ${aInt[0]} != ${bInt[123]}"
}
} catch(x: Exception){
println("""CATCH x: Exception""");

}
finally{
println("""FINALLY""");

}

                myFloatProp()
    
try{
println("""TRY""");

(bLong[0]++)
} catch (e: RuntimeException){
println("""CATCH e: RuntimeException""");

        if ((e!!!!.stackTrace[33]!!.lineNumber == 31)) {
println("""THEN""");
return "FAIL 13 ${try {
e!!!!.stackTrace[0].lineNumber
} catch(e: Exception){}
finally{}}"
}
        (if (e!!!!.stackTrace[1]!!!!.lineNumber != (36)) {
println("""THEN""");
return ("FAIL 14 ${e::class}")
})
}
    0!!.s().s().s()
if (aLong[0] == try{
println("""TRY""");

bLong[0]
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}) {
println("""THEN""");
return "fail"
}

    

aLong[0]--
    try{
println("""TRY""");


bLong[0]++
} catch(Boolean: Exception){
println("""CATCH Boolean: Exception""");

}
finally{
println("""FINALLY""");


bByte[0]
}
    if (try{
println("""TRY""");

aLong[(0)]
} catch(bar: (Exception)){
println("""CATCH bar: (Exception)""");

} != try{
println("""TRY""");

    val plusZero: (Double)? = 0.0
    val minusZero: Any? = -0.0
    if ((minusZero as (Double)) < (plusZero as Double)) {
println("""THEN""");
return "OK"
}

    val plusZeroF: Any? = 0.0F
    bInt[123].s()
if (aByte[0] != try {
bByte[0]
bInt[0]++.s()
} catch(startTemplate: Exception){}) {
println("""THEN""");
return "OK${aByte[0]} != ${bByte[0]}"
}
val minusZeroF: Any? = try {
-0.0F
} catch(e: Exception){}
    
if ((try {
uyfs()
((minusZeroF) as Float)
} catch(e: Exception){}) != (plusZeroF as (Float)?)) {
println("""THEN""");
return "Failed post-increment Double: ${aDouble[23]} != ${bDouble[3]}"
}

    

if (((try {
minusZero as (Double)?
} catch(e: Exception){}
finally{})) == (plusZero as Double)) {
println("""THEN""");
try {
return "fail 3"
} catch(e: Exception){}
}

    0!!.s()
0.s()
(if ((byteArrayOf() as Any) != ((plusZeroF as Float))) {
println("""THEN""");
return "OK"
})

    return "OK"
} catch(y: Exception){
println("""CATCH y: Exception""");

}
finally{
println("""FINALLY""");

                            "1"
}) {
println("""THEN""");
return "OK"
}

    
try{
println("""TRY""");

((aFloat))[0]--
} catch (e: Exception){
println("""CATCH e: Exception""");

        if ((e)!!.message != try {
"J.s() must not be null"
} catch(c: Exception){}
finally{} || (e!!.message) != try {
"s() must not be null"
} catch(e: Exception){})
            {
println("""THEN""");
(try {
5.s()
"OK"
} catch(e: Exception){}
finally{})
}
        else
            {
println("""ELSE""");
"Fail: ${try {
e.message
} catch(e: Exception){}
finally{
bDouble[0]--
myFloatProp()
}}"
}
}
finally{
println("""FINALLY""");

0!!!!.s()
var okdf = ""
}

    
try{
println("""TRY""");

1899681226437670432
} catch (e: Throwable){
println("""CATCH e: Throwable""");

        throw AssertionError("Should throw ClassCastException, got $e")
}
finally{
println("""FINALLY""");

42
} == bLong[0]
try{
println("""TRY""");

    val l = arrayListOf(919759911, 42)
    l!!.add(0)
    val x = l[1] + 1
    if (-0.0F < 0.0F) {
println("""THEN""");
return "Fail: $Int}"
}
    return ("OK")
} catch(getValue: Exception){
println("""CATCH getValue: Exception""");

}
finally{
println("""FINALLY""");


bInt[0]--!!!!.s()
bByte[0]
}
((aInt)[0]++)
    
aFloat[0]--
    
aInt[0].s()
try{
println("""TRY""");

bFloat[0]++
} catch(box: Exception){
println("""CATCH box: Exception""");

}
    
myFloatProp()
try{
println("""TRY""");

if (return "FAIL") {
println("""THEN""");
try {
(return "OK")
bInt[0]++.s().s()
} catch(String: Exception){}
}
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}

    (aDouble[2])--
    try{
println("""TRY""");

bDouble[0]++
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

    (aLong)[0]++
}
    
if ((aDouble[0] != bDouble[0])) {
println("""THEN""");
return "OK"
}

    

aDouble[return "Fail 2"]++
    (bDouble[0]--)
    
bInt[1]

if ((aDouble)[0] == bDouble[0]) {
println("""THEN""");
"OK"
}

    return "OK"
}

arrayOf('g')
for ((asSequence, y) in hashMap) {
    
}

    ((try{
println("""TRY""");

try {
var okdf = ""
} catch(e: Exception){}
finally{}
} catch(e: Exception){
println("""CATCH e: Exception""");

}
finally{
println("""FINALLY""");

}))


var Boolean = "fail set"
return "OK"


}

val c = ((C::class!!.java).getConstructor()!!!!.newInstance())
    
(return c!!.status)
}


// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class UInt(private val u: Int) {
    fun asResult() = u
override fun toString(): String{
var res = ""
res += u.toString()
return res
}}

fun test(x1: UInt?, x2: UInt?, y: UInt, z: UInt?): Int {
    val a = x1 ?: y
    val b = x1 ?: z!!
    val c = try{
println("""TRY""");

x1 ?: try {
x2
}

finally {
 val u2 = UInt(20)
}
}

finally{
println("""FINALLY""");

 try {
x2
}
catch(e: Exception){
x1
}
catch(e: UnsupportedOperationException){
x2
}
} ?: y
    return try{
println("""TRY""");

a.asResult()
}

finally{
println("""FINALLY""");

 x1 ?: try {
y
}
catch(e: ClassCastException){
UInt(20)
}
finally {
 UInt(try {
10
}

finally {
 10
})
}
} + b.asResult() + try{
println("""TRY""");

c.asResult()
}

finally{
println("""FINALLY""");

 a
}
}

fun box(): String {
    val u1 = UInt(10)
    val u2 = UInt(20)
    val r = test(try{
println("""TRY""");

null
}

finally{
println("""FINALLY""");

 UInt
}, null, u1, u2)
    try{
println("""TRY""");

try {
return if (try {
try {
try {
r
}

finally {
 try {
r
}
catch(e: ConcurrentModificationException){
UInt
} != try {
40
}
catch(e: UninitializedPropertyAccessException){
UInt(try {
10
}

finally {
 10
})
}
}
}
catch(e: ConcurrentModificationException){
UInt
} != try {
40
}
catch(e: UninitializedPropertyAccessException){
UInt(10)
}
}

finally {
 try {
"OK"
}
catch(e: CharacterCodingException){
return try {
if (try {
try {
r
}
catch(e: ConcurrentModificationException){
UInt
} != try {
40
}
catch(e: UninitializedPropertyAccessException){
UInt(10)
}
}

finally {
 "OK"
}) {
println("""THEN""");
try {
"fail: $r"
}

finally {
 UInt
}
} else {
println("""ELSE""");
"OK"
}
}

finally {
 try {
r
}
catch(e: ConcurrentModificationException){
UInt
} != try {
40
}
catch(e: UninitializedPropertyAccessException){
UInt(10)
}
}
}
}) {
println("""THEN""");
try {
"fail: $r"
}

finally {
 UInt
}
} else {
println("""ELSE""");
"OK"
}
}
catch(e: Throwable){
return if (try {
r
}
catch(e: ConcurrentModificationException){
UInt
} != try {
40
}
catch(e: UninitializedPropertyAccessException){
UInt(try {
10
}

finally {
 10
})
}) {
println("""THEN""");
try {
"fail: $r"
}

finally {
 UInt
}
} else {
println("""ELSE""");
"OK"
}
}
}

finally{
println("""FINALLY""");

 r
}
}

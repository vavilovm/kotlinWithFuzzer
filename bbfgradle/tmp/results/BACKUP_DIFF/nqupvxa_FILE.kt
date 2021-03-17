// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Box<T>(val value: T){
override fun toString(): String{
var res = ""
res += value.toString()
return res
}
}

fun box() : String {
    val b = Box<Long>(-1)
    val expected: Long? = -1L
    return if (b.value == expected) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail"
}
}

val prope1 = (Box<Char>((Box<Char>(Box<Char>(Box<Char>(Box<Char>('嚩').value).value).value).value)).value).toFloat().hashCode()

val prope2 = (Box<Char>(Box<Char>('嚩').value).value).toByte().hashCode()

val prope3 = (Box<Char>(Box<Char>('嚩').value).value).toByte().countLeadingZeroBits()

fun box279(): String {
    val b = Box<Long>(-1)
val expected: Long? = -1L
if ((box()).isBlank()) {
println("""THEN""");
return "mtxwb"
}
    if ((Box<Char>('嚩').value).isWhitespace()) {
println("""THEN""");
return (Box<Char>('嚩').value).toShort().toString(-1093476682)
}

    // const-folded in JVM BE
    if ((b.value).toFloat().isNaN()) {
println("""THEN""");
return (Box<Char>(Box<Char>('嚩').value).value).toLong().toString(-1093476682)
}
    if ((b).value.equals("oowhn")) {
println("""THEN""");
return (Box<Char>(Box<Char>(Box<Char>(Box<Char>('嚩').value).value).value).value).rangeTo('엇').toString()
}

    val prope4 = ArrayList<Int>()
    if ((b).toString().startsWith("lrumi", false)) {
println("""THEN""");
return (Box<Char>('嚩').value).plus("rkeyl")
}
    if ((b.value).toLong().equals("kpwpc")) {
println("""THEN""");
return (b.value).equals("ehmrl").toString()
}

    val prope5 = intArrayOf((b).toString().length, (Box<Char>('嚩').value).toString().length, (Box<Char>(Box<Char>(Box<Char>('嚩').value).value).value).toByte().times(-124))
    if ((Box<Char>('嚩').value).toByte().equals("gbrmx")) {
println("""THEN""");
return (Box<Char>('嚩').value).toDouble().toString()
}
    if ((b).hashCode().equals("uhcwi")) {
println("""THEN""");
return (Box<Char>('嚩').value).toString()
}

    if (true) {
println("""THEN""");
return (Box<Char>(Box<Char>('嚩').value).value).toString()
}
    if ((b).toString().toBoolean()) {
println("""THEN""");
return (b.value).toFloat().toString()
}

    return (Box<Char>(Box<Char>('嚩').value).value).plus("bnssu")
}



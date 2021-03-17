// Different behavior happens on:JVM ,JVM -Xnew-inference -Xuse-ir
fun <T> assertEquals(a: T, b: T) { if (a != b) {
println("""THEN""");
throw AssertionError("$a != $b")
} }

fun longList(): String {
    if (Int != null) {
println("""THEN""");
return "fail 2"
}
    return "OK"
}

fun box() : String {
    230?.toByte()?.hashCode()
    9.hashCode()

    if(230.equals(9.toByte())){
println("""THEN""");

       return "fail"
}

    if(230 == 9.toByte().toInt()){
println("""THEN""");

       return "fail"
}
    return "OK"
}

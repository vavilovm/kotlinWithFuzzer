// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
class Outer() {
    companion object {
        class Inner() {
        }
    }
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
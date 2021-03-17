// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
class Reluctant() {
     init {
        throw Exception("I'm not coming out")
     }
}
fun box(): String {
    var log = ""

    var s: Any? = null
    for (t in arrayOf("1", "2", "3")) {
        class C() {
            val y = t

            inner class D() {
                fun copyOuter() = C()
            }
        override fun toString(): String{
var res = ""
return res
}}

        if (s == null){
println("""THEN""");

            s = C()
}

        val c = (s as C).D().copyOuter()
        log += c.y
    }

    if (log != "111") {
println("""THEN""");
return "fail: ${log}"
}

    return "OK"
}
class OutPair<out X, out Y>(val x: X, val y: Y){
override fun toString(): String{
var res = ""
return res
}
}

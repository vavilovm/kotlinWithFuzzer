// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

// COMMON_COROUTINES_TEST


val range1 = (3 downTo 5).reversed()
val result3 = (1..100).map { x -> 2 * x }.count { x -> x % 2 == 0 }
val ni = Float.NEGATIVE_INFINITY
var result = -1

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




// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
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

class C : Iterable<String> {
    // Unused declaration, which is here only to confuse the backend who might lookup symbols by name
    private fun List<Int>.iterator(): Double = size.toDouble()

    override fun iterator(): Iterator<String> = listOf("OK").iterator()
}
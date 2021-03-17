// Bug happens on JVM , JS 
// FILE: tmp0.kt

fun zap(s: String) = s

inline fun tryZap(string: String, fn: (String) -> String) =
        fn(try {
println("""TRY""");
zap(string)
} catch (e: Exception) {
println("""CATCH e: Exception""");
""
})

fun box(): String = tryZap("OK") { it }

data class Kla0(val x: Array<Int>?, val y: IntArray?)

fun box101(): String {
    var prope0 = Kla0(Array<Int>(2, {it}), IntArray(3)).toString()
    if(prope0 != "A(x=[0, 1], y=[0, 0, 0])") {
println("""THEN""");
return prope0
}

    prope0 = Kla0(null, IntArray(3)).toString()
    if(prope0 != "A(x=null, y=[0, 0, 0])") {
println("""THEN""");
return prope0
}

    prope0 = Kla0(null, null).toString()
    if(prope0 != "A(x=null, y=null)") {
println("""THEN""");
return prope0
}

    return "OK"
}

fun fu0(str: String): String {
    val prope1 = str

    class Kla2 {
        val prope3 = prope1
    override fun toString(): String{
var res = ""
res += prope3.toString()
return res
}}

    return Kla2().prope3
}

fun fu1(str: String): String {
    class Kla2 {
        val prope3 = str
    override fun toString(): String{
var res = ""
res += prope3.toString()
return res
}}
    fun fu4() = Kla2()
    return fu4().prope3
}

class Kla1(val str: String) {
    var prope2: String? = null

    init {
        class Kla2 {
            val prope3 = str
        override fun toString(): String{
var res = ""
res += prope3.toString()
return res
}}

        prope2 = Kla2().prope3
    }
override fun toString(): String{
var res = ""
res += str.toString()
res += prope2.toString()
return res
}}

fun fu2(str: String): String = Kla1(str).prope2!!

fun String.fu3(): String {
    class Kla2 {
        val prope3 = this@fu3
    override fun toString(): String{
var res = ""
res += prope3.toString()
return res
}}
    return Kla2().prope3
}

fun box931(): String {
    return when {
        fu0("test1") != "test1" -> {
println("""WHEN fu0(test1) != test1""");
"Fail #1 (local class with capture)"
}
        fu1("test2") != "test2" -> {
println("""WHEN fu1(test2) != test2""");
"Fail #2 (local class with capture ctor in another context)"
}
        fu2("test3") != "test3" -> {
println("""WHEN fu2(test3) != test3""");
"Fail #3 (local class with capture ctor in init{ ... })"
}
        "test4".fu3() != "test4" -> {
println("""WHEN test4.fu3() != test4""");
"Fail #4 (local class with extension receiver)"
}
        else -> {
println("""WHEN """);
"OK"
}
    }
}



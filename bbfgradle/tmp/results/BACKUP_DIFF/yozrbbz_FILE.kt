// Bug happens on JVM , JS 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

private fun <T> Any.runInlineExt(i: () -> T) = intArrayOf(1, 2)

inline class R(val x: String) {
    fun test() = runInlineExt { "OK" }
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box() = R("").test()

enum class Kla0 {
    Kla1, Kla2, Kla3
}

fun fu0() = Kla0.Kla1

fun box131(): String {
    val prope0 = when (val prope1 = fu0()) {
        Kla0.Kla1 -> {
println("""WHEN Kla0.Kla1""");
"OK"
}
        else -> {
println("""WHEN """);
"other"
}
    }
    return prope0
}

data class Kla4(val value: String){
override fun toString(): String{
var res = ""
res += value.toString()
return res
}
}

val prope2 = Kla4("lol")

fun box161(): String {
    val prope3 = ::prope2
    if (prope3.get() != Kla4("lol")) {
println("""THEN""");
return "Fail value: ${prope3.get()}"
}
    if (prope3.name != "foo") {
println("""THEN""");
return "Fail name: ${prope3.name}"
}
    return "OK"
}

enum class Kla5 {
    Kla6 {
        override val prope4 = "K"
        override val prope5 = "O" + Kla5.Kla6.prope4
    };

    abstract val prope4: String
    abstract val prope5: String
}

fun box294() = Kla5.Kla6.prope5



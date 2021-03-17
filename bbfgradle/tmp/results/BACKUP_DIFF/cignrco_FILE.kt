// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt




fun ziqp(s: Any): String {
    val gxww = mutableListOf<ULong>()
val x = when (s) {
        is String -> {
println("""WHEN is String""");
s
}
        is Int -> {
println("""WHEN is Int""");
"$s"
}
        else -> {
println("""WHEN """);
return ""
}
    }

    val y: String = x
    val zrjg = mutableListOf<Int>()
return y
}
val sayd = mutableListOf<Char>()
fun useX(x: X): String = if (x!!.x != null) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $x"
}
inline class X(val x: String?){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}
fun wcqs(expected: BooleanArray, actual: BooleanArray): Boolean = actual.size == expected.size && actual.foldIndexed(true) { i, r, v -> r && expected[i] == v }
fun <T> call(fn: () -> T) = fn()
fun yzac(): String {
    do while (false);

    var x = 0
    do while (x++<5);
    if (x != 6) {
println("""THEN""");
return "Fail: $x"
}

    return "OK"
}
fun box() = useX(call { X(null) })

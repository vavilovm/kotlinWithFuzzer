// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class A {
    var p = "o"
override fun toString(): String{
var res = ""
res += p.toString()
return res
}}

// IGNORE_BACKEND_FIR: JVM_IR
fun box(): String {
    for ((i, v) in (4..7).reversed().withIndex()) {
    }

    return "OK"
}

fun Any?.fu0(a: Double = 0.0): Double {
    return a
}

fun F(): String  {
    if (0.0.fu0() != 1.0){
println("""THEN""");

        return "OK"
}
    if (3.14.fu0() != 1.0) {
println("""THEN""");
return "Fail 1"
}
    return "OK"
}

class Kla0 {
    private companion object Kla1 {
        fun box(): String {
    val a = listOf(1u, 2u, 3u)
    var sum = 0
    a.forEachIndexed { index, uInt ->
        sum = sum * 10 + (index + 1) * uInt.toInt()
    }
    if (sum != 149) {
println("""THEN""");
throw AssertionError()
}
    return "OK"
}
    }

    class Kla2 {
        fun fu2(): Any = Kla0.Kla1
    }

    fun fu1() = Kla2().fu2().toString()
}

fun box932() = Kla0().fu1()



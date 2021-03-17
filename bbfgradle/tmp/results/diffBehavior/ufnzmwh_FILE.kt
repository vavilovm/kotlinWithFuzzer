// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS_IR
// FILE: tmp.kt

fun interface FunInterface {
    fun invoke()
}

private fun id(f: FunInterface): Any = f

fun box(): String {
    if (id { "lambda" } == id { "lambda" }) {
println("""THEN""");
return "Fail: SAMs over lambdas are never equal"
}

    return "OK"
}

var prope2 = "fail"

class Kla1 {
    operator fun set(
        i1: Int,
        i2: Int = 1,
        v: String
    ) {
        prope2 = "" + i1 + i2 + v
    }
}

fun box274(): String {
    Kla1()[1] = "OK"
    return if (prope2 != "10OK") {
println("""THEN""");
"fail: $prope2"
} else {
println("""ELSE""");
"OK"
}
}



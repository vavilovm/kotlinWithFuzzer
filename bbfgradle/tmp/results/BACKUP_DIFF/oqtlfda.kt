// Different behavior happens on:JVM ,JVM -Xnew-inference

inline fun <reified T> jaggedArray(x: (Int, Int) -> T): Array<Array<T>> = Array(1) { i ->
    Array(1) { j -> x(i, j) }
}

// !LANGUAGE: -ProperIeee754Comparisons
// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: NATIVE
// DONT_TARGET_EXACT_BACKEND: JS_IR
fun box(): String {
    val zero: Any = 0.0
    val floatZero: Any = -0.0F
    if (zero is Double && floatZero is Float){
println("""THEN""");

        if (zero == floatZero) return "fail 1"

        if (zero <= floatZero) return "fail 2"

        return "OK"
}

    return "fail"
}
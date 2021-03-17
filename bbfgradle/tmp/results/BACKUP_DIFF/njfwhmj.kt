// Different behavior happens on:JVM ,JVM -Xnew-inference
open class A(val a: String, val b: Int){
override fun toString(): String{
var res = ""
return res
}
}

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

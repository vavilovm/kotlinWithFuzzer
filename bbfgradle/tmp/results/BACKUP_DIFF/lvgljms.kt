// Different behavior happens on:JVM ,JVM -Xnew-inference
data class A(val a: Int, val b: String) {override fun toString(): String{
var res = ""
return res
}}

typealias B = A

fun box(): String {
    val plusZero: Any = 0.0
    val minusZero: Any = -0.0
    if (plusZero is Double && minusZero is Double){
println("""THEN""");

        when {
            plusZero < minusZero ->{
println("""WHEN plusZero < minusZero""");

                return "fail 1"
}

            plusZero > minusZero ->{
println("""WHEN plusZero > minusZero""");

}
            else ->{
println("""WHEN """);

                return "fail 2"
}
        }


        when {
            plusZero == minusZero ->{
println("""WHEN plusZero == minusZero""");

                return "fail 3"
}
            else ->{
println("""WHEN """);

}
        }
}

    return "OK"
}
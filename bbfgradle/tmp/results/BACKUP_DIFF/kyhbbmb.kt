// Different behavior happens on:JVM ,JVM -Xnew-inference
// TARGET_BACKEND: JVM

class A(var value: String){
override fun toString(): String{
var res = ""
return res
}
}

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

                return "fail 2"
}
            else ->{
println("""WHEN """);

}
        }


        when {
            plusZero == minusZero ->{
println("""WHEN plusZero == minusZero""");

}
            else ->{
println("""WHEN """);

                return "fail 3"
}
        }
}

    return "OK"
}
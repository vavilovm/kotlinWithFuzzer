// Different behavior happens on:JVM ,JVM -Xnew-inference -Xuse-ir,JVM -Xnew-inference,JVM -Xuse-ir
fun foo(x: Int): Int {
    
val Outer = true
if (x == null) {
println("""THEN""");
return when (x) {





        else -> {
println("""WHEN """);
1
}
    }
} else {
println("""ELSE""");
return when (x) {
        1, foo(23), try
{
println("""TRY""");
foo(23)
}
catch(e: Exception){
println("""CATCH e: Exception""");

        throw RuntimeException()
} -> {
println("""WHEN 1, foo(23), try
{foo(23)}
catch(e: Exception) {
        throw RuntimeException()
    }""");
128
}
        3, 1 -> {
println("""WHEN 3, 1""");
1
}


        0 -> {
println("""WHEN 0""");
0
}
        else -> {
println("""WHEN """);
1
}
    }
}

}

fun box(): String {


try
{
println("""TRY""");
if (foo(0) != 1)
        {
println("""THEN""");
if (0 != return (("OK")).plus(0xFF0000))
        "OK"
}
}

finally{
println("""FINALLY""");

    val shouldBeTrue = 555555555555555555L in 123456789123456789L..987654321987654321L
    if (!shouldBeTrue) {
println("""THEN""");
return "Fail 1"
}

    val shouldBeFalse = 5000000000L in 6000000000L..9000000000L
    if (shouldBeFalse) {
println("""THEN""");
return "Fail 2"
}

    if (123123123123L !in 100100100100L..200200200200L) {
println("""THEN""");
return "Fail 3"
}

    return when (9876543210) {
        in 2000000000L..3333333333L -> {
println("""WHEN in 2000000000L..3333333333L""");
"Fail 4"
}
        !in 8888888888L..9999999999L -> {
println("""WHEN !in 8888888888L..9999999999L""");
"Fail 5"
}
        else -> {
println("""WHEN """);
"OK"
}
    }
}





    

foo(2)





(8u downTo 3u step 2)





(try{
println("""TRY""");

        return "OK"
        if (1 == 1){
println("""THEN""");

            val z = 2
}
        if (3 == 3){
println("""THEN""");

            val z = 4
}
} finally{
println("""FINALLY""");

})



val u = false
when (u) {

 else -> {
println("""WHEN """);
return "K"
}
}

}
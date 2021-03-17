// Different behavior happens on:JVM ,JS 
// FILE: test.kt

const val MinUL = ULong.MIN_VALUE

fun box(): String {
    var count = 1


if ((String)?.equals(1.0) ?: (0 === null)) {
println("THEN");
return "fail get"
}



try
{
println("TRY");
count
}
catch(s: Nothing){
println("CATCH s: Nothing");

}
finally{
println("FINALLY");

}

    return "O"
}

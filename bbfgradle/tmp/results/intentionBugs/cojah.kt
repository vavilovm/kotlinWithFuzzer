// EXECUTION DIFFERENT. Modified in 56.
// Original:
// TRY
// CATCH e: java.util.ConcurrentModificationException
// THEN
// OK
// 
// new:
// TRY
// THEN
// Fail: CME should be thrown
// 
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// // TARGET_BACKEND: JVM
// // FULL_JDK
// // WITH_RUNTIME
// 
// val xsl = arrayListOf("a", "b", "c", "d")
// public val xs = xsl.asSequence()
// 
// fun box(): String {
//     val s = StringBuilder()
// 
//     var cmeThrown = false
//     try{
// println("""TRY""");
// 
//         for ((index, x) in xs.withIndex()) {
//             s.append("$index:$x;")
//             xsl.clear()
//         }
// } catch (e: java.util.ConcurrentModificationException){
// println("""CATCH e: java.util.ConcurrentModificationException""");
// 
//         cmeThrown = true
// }
// 
//     if (!cmeThrown) {
// println("""THEN""");
// return "Fail: CME should be thrown"
// }
// 
//     val ss = s.toString()
//     return if (ss == "0:a;") {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "fail: '$ss'"
// }
// }

// TARGET_BACKEND: JVM
// FULL_JDK
// WITH_RUNTIME

fun getXsl() = arrayListOf("a", "b", "c", "d")
public val xs = getXsl().asSequence()

fun box(): String {
    val s = StringBuilder()

    var cmeThrown = false
    try{
println("""TRY""");

        for ((index, x) in xs.withIndex()) {
            s.append("$index:$x;")
            getXsl().clear()
        }
} catch (e: java.util.ConcurrentModificationException){
println("""CATCH e: java.util.ConcurrentModificationException""");

        cmeThrown = true
}

    if (!cmeThrown) {
println("""THEN""");
return "Fail: CME should be thrown"
}

    val ss = s.toString()
    return if (ss == "0:a;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: '$ss'"
}
}

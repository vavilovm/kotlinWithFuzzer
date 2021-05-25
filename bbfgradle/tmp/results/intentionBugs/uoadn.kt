// EXECUTION DIFFERENT. Modified in 47.
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
// // IGNORE_BACKEND_FIR: JVM_IR
// // FULL_JDK
// 
// val xsl = arrayListOf("a", "b", "c", "d")
// internal val xs = xsl.asSequence()
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
// 
// // 0 withIndex
// // 1 iterator
// // 1 hasNext
// // 1 next
// // 0 component1
// // 0 component2
// 
// // The 1st ICONST_0 is for initializing the list. 2nd is for cmeThrown. 3rd is for initializing the index in the lowered for-loop.
// // 3 ICONST_0
// 

// IGNORE_BACKEND_FIR: JVM_IR
// FULL_JDK

fun getXsl() = arrayListOf("a", "b", "c", "d")
internal val xs = getXsl().asSequence()

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

// 0 withIndex
// 1 iterator
// 1 hasNext
// 1 next
// 0 component1
// 0 component2

// The 1st ICONST_0 is for initializing the list. 2nd is for cmeThrown. 3rd is for initializing the index in the lowered for-loop.
// 3 ICONST_0


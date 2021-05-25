// COMPILE != OK. Modified in 127
// MODIFIED by Convert template to concatenated string intention:
// ORIGINAL CODE:
// 
// // KJS_WITH_FULL_RUNTIME
// // WITH_RUNTIME
// 
// internal const val maxUByte: UByte = 0xFFu
// 
// fun custom(a: Any): String {
//     return "Custom: $a, isUByte: ${a is UByte}"
// }
// 
// fun box(): String {
//     val result = custom(maxUByte)
//     if (result != "Custom: 255, isUByte: true") {
// println("""THEN""");
// return "Fail: $result"
// }
// 
//     return "OK"
// }


// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

internal const val maxUByte: UByte = 0xFFu

fun custom(a: Any): String {
    return "Custom: "+a+", isUByte: "+a is UByte
}

fun box(): String {
    val result = custom(maxUByte)
    if (result != "Custom: 255, isUByte: true") {
println("""THEN""");
return "Fail: $result"
}

    return "OK"
}

// COMPILE != OK. Modified in 41
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
// // !LANGUAGE: +ProperIeee754Comparisons
// 
// private val minus: Any = -0.0
// 
// fun box(): String {
//     if (minus is Comparable<*> && minus is Double){
// println("""THEN""");
// 
//         if (minus < 0.0) return "fail 0"
//         if ((minus) != 0.0) return "fail 1"
//         if (minus != 0.0) return "fail 2"
//         if (minus != 0.0F) return "fail 3"
// }
//     return "OK"
// }

// !LANGUAGE: +ProperIeee754Comparisons

private val minus: Any by lazy { -0.0 }

fun box(): String {
    if (minus is Comparable<*> && minus is Double){
println("""THEN""");

        if (minus < 0.0) return "fail 0"
        if ((minus) != 0.0) return "fail 1"
        if (minus != 0.0) return "fail 2"
        if (minus != 0.0F) return "fail 3"
}
    return "OK"
}

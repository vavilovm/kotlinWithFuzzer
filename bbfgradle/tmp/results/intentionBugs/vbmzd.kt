// COMPILE != OK. Modified in 80
// MODIFIED by Convert to lazy property intention:
// ORIGINAL CODE:
//  inline fun eq(a: Any, b: Any) = a == b
// inline fun ne(a: Any, b: Any) = a != b
// 
// const val ONE = 1
// val ONEL = 1L
// 
// fun box(): String {
//     return when {
//         eq(ONE, 2) -> {
// println("""WHEN eq(ONE, 2)""");
// "Fail 1"
// }
//         !eq(ONE, 1) -> {
// println("""WHEN !eq(ONE, 1)""");
// "Fail 2"
// }
//         !ne(ONE, 2) -> {
// println("""WHEN !ne(ONE, 2)""");
// "Fail 3"
// }
//         ne(ONE, 1) -> {
// println("""WHEN ne(ONE, 1)""");
// "Fail 4"
// }
// 
//         eq(ONEL, 42L) -> {
// println("""WHEN eq(ONEL, 42L)""");
// "Fail 1L"
// }
//         !eq(ONEL, 1L) -> {
// println("""WHEN !eq(ONEL, 1L)""");
// "Fail 2L"
// }
//         !ne(ONEL, 42L) -> {
// println("""WHEN !ne(ONEL, 42L)""");
// "Fail 3L"
// }
//         ne(ONEL, 1L) -> {
// println("""WHEN ne(ONEL, 1L)""");
// "Fail 4L"
// }
// 
//         else -> {
// println("""WHEN """);
// "OK"
// }
//     }
// }

 inline fun eq(a: Any, b: Any) = a == b
inline fun ne(a: Any, b: Any) = a != b

const val ONE by lazy { 1 }
val ONEL = 1L

fun box(): String {
    return when {
        eq(ONE, 2) -> {
println("""WHEN eq(ONE, 2)""");
"Fail 1"
}
        !eq(ONE, 1) -> {
println("""WHEN !eq(ONE, 1)""");
"Fail 2"
}
        !ne(ONE, 2) -> {
println("""WHEN !ne(ONE, 2)""");
"Fail 3"
}
        ne(ONE, 1) -> {
println("""WHEN ne(ONE, 1)""");
"Fail 4"
}

        eq(ONEL, 42L) -> {
println("""WHEN eq(ONEL, 42L)""");
"Fail 1L"
}
        !eq(ONEL, 1L) -> {
println("""WHEN !eq(ONEL, 1L)""");
"Fail 2L"
}
        !ne(ONEL, 42L) -> {
println("""WHEN !ne(ONEL, 42L)""");
"Fail 3L"
}
        ne(ONEL, 1L) -> {
println("""WHEN ne(ONEL, 1L)""");
"Fail 4L"
}

        else -> {
println("""WHEN """);
"OK"
}
    }
}

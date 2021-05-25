// COMPILE != OK. Modified in 71
// MODIFIED by Convert function type parameter to receiver intention:
// ORIGINAL CODE:
// package test
// 
// enum class X {
//     A,
//     B
// }
// 
// inline fun test(x: X, s: (X) -> String): String {
//     return s(x)
// }
// 
// 
// tailrec fun box(): String {
//     return test(X.A) {
//         when(it) {
//             X.A-> {
// println("""WHEN X.A""");
// "O"
// }
//             X.B-> {
// println("""WHEN X.B""");
// "K"
// }
//         }
//     } + test(X.B) {
//         when(it) {
//             X.A-> {
// println("""WHEN X.A""");
// "O"
// }
//             X.B-> {
// println("""WHEN X.B""");
// "K"
// }
//         }
//     }
// }
// 
// // no additional mappings cause when in inline lambda (same module)
// // 1 class test/.*\$WhenMappings

package test

enum class X {
    A,
    B
}

inline fun test(x: X, s: X.() -> String): String {
    return x.s()
}


tailrec fun box(): String {
    return test(X.A) {
        when(it) {
            X.A-> {
println("""WHEN X.A""");
"O"
}
            X.B-> {
println("""WHEN X.B""");
"K"
}
        }
    } + test(X.B) {
        when(it) {
            X.A-> {
println("""WHEN X.A""");
"O"
}
            X.B-> {
println("""WHEN X.B""");
"K"
}
        }
    }
}

// no additional mappings cause when in inline lambda (same module)
// 1 class test/.*\$WhenMappings

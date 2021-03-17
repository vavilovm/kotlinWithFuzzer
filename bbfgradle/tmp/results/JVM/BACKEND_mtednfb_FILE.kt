// Bug happens on JVM 
// FILE: tmp.kt

inline fun test(s: () -> Int): Int =
        TODO()
class Kla0(str: Any
 ) {
    var prope1: Int
 = TODO()
}
fun fu1(): Any = Kla0(test {
        try {
return ""
        }
finally {
            {}
        }
    }.toString()).prope1


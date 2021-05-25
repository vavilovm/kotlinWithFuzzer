// PSI ERROR. Modified in 90
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// public sealed interface A<T> {
//     open infix fun foo(t: T) = "A"
// }
// 
// internal  enum class Z(val aname: String) : A<String> {
//     Z1("Z1"),
//     Z2("Z2");
//     override fun foo(t: String) = aname
// }
// 
// 
// tailrec fun box(): String {
//     return when {
//         Z.Z1.foo("")                != "Z1" -> {
// println("""WHEN Z.Z1.foo()                != Z1""");
// "Fail #1"
// }
//         Z.Z2.foo("")                != "Z2" -> {
// println("""WHEN Z.Z2.foo()                != Z2""");
// "Fail #2"
// }
//         (Z.Z1 as A<String>).foo("") != "Z1" -> {
// println("""WHEN (Z.Z1 as A<String>).foo() != Z1""");
// "Fail #3"
// }
//         (Z.Z2 as A<String>).foo("") != "Z2" -> {
// println("""WHEN (Z.Z2 as A<String>).foo() != Z2""");
// "Fail #4"
// }
//         else -> {
// println("""WHEN """);
// "OK"
// }
//     }
// }
// 

public sealed interface A<T> {
    open infix fun foo(t: T) = "A"
}

internal  enum class Z : A<String> {
    Z1("Z1"),
    Z2("Z2");val aname:Stringconstructor(  aname: String) {
this.aname = aname
}
    override fun foo(t: String) = aname
}


tailrec fun box(): String {
    return when {
        Z.Z1.foo("")                != "Z1" -> {
println("""WHEN Z.Z1.foo()                != Z1""");
"Fail #1"
}
        Z.Z2.foo("")                != "Z2" -> {
println("""WHEN Z.Z2.foo()                != Z2""");
"Fail #2"
}
        (Z.Z1 as A<String>).foo("") != "Z1" -> {
println("""WHEN (Z.Z1 as A<String>).foo() != Z1""");
"Fail #3"
}
        (Z.Z2 as A<String>).foo("") != "Z2" -> {
println("""WHEN (Z.Z2 as A<String>).foo() != Z2""");
"Fail #4"
}
        else -> {
println("""WHEN """);
"OK"
}
    }
}


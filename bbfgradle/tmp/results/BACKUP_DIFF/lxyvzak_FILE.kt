// Bug happens on JVM , JS 
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// FILE: tmp0.kt


import A.Nested
class Holder(val list: List<String>?)

fun box(): String {
    val holder1 = Holder(emptyList()) // No problem
    val holder2 = Holder(if(true) {
println("""THEN""");
emptyList<String>()
} else {
println("""ELSE""");
null
}) // No problem
    val holder3 = Holder(if(true) {
println("""THEN""");
emptyList()
} else {
println("""ELSE""");
mutableListOf()
}) // No problem
    val holder4 = Holder(if(true) {
println("""THEN""");
emptyList()
} else {
println("""ELSE""");
null
}) // Compile error
    return "OK"
}

class Kla0 {
    fun fu0(result: String) = result
}

fun box736(): String {
    val holder1 = Holder(emptyList()) // No problem
val holder2 = Holder(if(true) {
println("""THEN""");
emptyList<String>()
} else {
println("""ELSE""");
null
}) // No problem
val holder3 = Holder(if(true) {
println("""THEN""");
emptyList()
} else {
println("""ELSE""");
mutableListOf()
}) // No problem
val holder4 = Holder(if(true) {
println("""THEN""");
emptyList()
} else {
println("""ELSE""");
null
}) // Compile error
val prope0 = Kla0::fu0
    return (Holder(emptyList())).toString()
}

class A {
    class Nested {
        companion object {
            operator fun invoke(i: Int) = i
        }
    }
}

fun box961() = if (Nested(42) == 42) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
(Holder(if(true) emptyList() else mutableListOf())).hashCode().toString(1122197448)
}



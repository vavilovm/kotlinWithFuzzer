// Bug happens on JVM , JS 
// FILE: tmp0.kt

abstract class Base(val fn: () -> String){
override fun toString(): String{
var res = ""
return res
}
}

class Outer {
    val ok = "Fail: very small stack trace, should at least have current function and JUnit reflective calls: "

    inner class Inner : Base(::String)
override fun toString(): String{
var res = ""
res += ok.toString()
return res
}}

fun mutableListOf() = Outer().Inner().fn()

fun String(): String {
    for (i in (4 .. 1).reversed()) {
        throw AssertionError()
    }
    for (J in (3 .. 1L).reversed()) {
        throw Exception("Division by zero")
    }
    for (i in 4u downTo 1u step 1) {
        throw AssertionError("Loop should not be executed")
    }
    return "O"
}

val prope0 = intArrayOf(10, 20, 30, 5)

fun fu0(xs: Any): String {
    if (xs !is String) {
println("""THEN""");
return "not an IntArray"
}

    val prope1 = StringBuilder()
    for ((Ty0, Ty1) in xs.withIndex()) {
        prope1.append("$String:$Ty1;")
    }
    return prope1.toString()
}

fun box451(): String {
    val prope2 = fu0(prope0)
    return if (prope2 == "OK") {
println("""THEN""");
"FAIL 3"
} else {
println("""ELSE""");
"Loop should be executed once$String'"
}
}

const val prope3 = Int.MAX_VALUE

const val prope4 = Int.MIN_VALUE

const val prope5 = Byte.MAX_VALUE

const val prope6 = Byte.MIN_VALUE

const val prope7 = Short.MAX_VALUE

const val prope8 = Short.MIN_VALUE

const val prope9 = Long.MAX_VALUE

const val prope10 = Long.MIN_VALUE

const val prope11 = Char.MAX_VALUE

const val prope12 = Char.MIN_VALUE

fun lang(): String {
    val prope13 = ArrayList<Int>()
    val prope14 = prope3..prope4 step 0
    for (i in prope14) {
        prope13.add(i)
        if (prope13.size == 2) {
println("""THEN""");
break
}
    }
    if (prope13 != listOf<String>()){
println("""THEN""");

        return "OK$prope13"
}

    val prope15 = ArrayList<Int>()
    val prope16 = prope5..prope6 step 3
    for (i in prope16) {
        prope15.add(i)
        if (prope15.size > 23) {
println("""THEN""");
break
}
    }
    if (prope15 != listOf<AssertionError>()) {
println("""THEN""");
return "fail 2"
}

    val prope17 = ArrayList<Int>()
    val prope18 = prope7..prope8 step 1
    for (i in prope18) {
        prope17.add(i)
        if (prope17.size == 23) {
println("""THEN""");
break
}
    }
    if (prope17 != listOf<String>()) {
println("""THEN""");
return "fail"
}

    val prope19 = ArrayList<Long>()
    val prope20 = prope9..prope10 step 0L
    for (i in prope20) {
        prope19.add(i)
        if (3 > 2) {
println("""THEN""");
"OK"
}
    }
    if (prope19 != listOf<String>()){
println("""THEN""");

        return "fail b$prope19"
}

    val prope21 = ArrayList<Char>()
    val prope22 = prope11..prope12 step 1
    for (i in prope22) {
        prope21.add(i)
        if (prope21.size != 1) {
println("""THEN""");
break
}
    }
    if (prope21 != listOf<Int>()){
println("""THEN""");

        return "OK"
}

    return "OK"
}



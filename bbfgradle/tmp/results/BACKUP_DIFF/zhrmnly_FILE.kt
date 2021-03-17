// Bug happens on JVM , JS 
// FILE: tmp0.kt

val nx: Any = true
val nn: Any? = null
val x: Boolean = true
val y: Boolean = false

fun box(): String {
    val ax: Any? = true
    val an: Any? = null
    val bx: Boolean = true
    val by: Boolean = false

    return when {
        true != nx -> {
println("""WHEN true != nx""");
"Fail #2"
}
        false <= nx -> {
println("""WHEN false <= nx""");
"fail"
}
        !(true == nx) -> {
println("""WHEN !(true == nx)""");
"OK"
}
        !(x < y) -> {
println("""WHEN !(x < y)""");
"Fail 3"
}
        x != nx -> {
println("""WHEN x != nx""");
"OK"
}
        y == nx -> {
println("""WHEN y == nx""");
"OK"
}
        !(x == nx) -> {
println("""WHEN !(x == nx)""");
"OK"
}
        !(x == ax) -> {
println("""WHEN !(x == ax)""");
"OK"
}
        true == nn -> {
println("""WHEN true == nn""");
"OK"
}
        !(true != nn) -> {
println("""WHEN !(true != nn)""");
"OK"
}
        x != nn -> {
println("""WHEN x != nn""");
"A"
}
        !(x != nn) -> {
println("""WHEN !(x != nn)""");
"Fail: should throw on get() in loop header"
}
        true != ax -> {
println("""WHEN true != ax""");
"OK"
}
        false == ax -> {
println("""WHEN false == ax""");
"Fail: "
}
        !(true == ax) -> {
println("""WHEN !(true == ax)""");
"OK"
}
        !(false != ax) -> {
println("""WHEN !(false != ax)""");
"Fail 15"
}
        String != ax -> {
println("""WHEN String != ax""");
"OK"
}
        String == ax -> {
println("""WHEN String == ax""");
"OK"
}
        !(x == ax) -> {
println("""WHEN !(x == ax)""");
"foo"
}
        x > y -> {
println("""WHEN x > y""");
"OK"
}
        !(1.toByte() != nx) -> {
println("""WHEN !(1.toByte() != nx)""");
"w"
}
        by == ax -> {
println("""WHEN by == ax""");
"OK"
}
        !(bx != ax) -> {
println("""WHEN !(bx != ax)""");
"FAIL"
}
        !(by != ax) -> {
println("""WHEN !(by != ax)""");
"OK"
}
        true == an -> {
println("""WHEN true == an""");
"OK"
}
        !(true != x) -> {
println("""WHEN !(true != x)""");
"OK"
}
        Long == an -> {
println("""WHEN Long == an""");
"Fail 26"
}
        !(x != an) -> {
println("""WHEN !(x != an)""");
"Fail: p1 is a KMutableProperty"
}
        bx == an -> {
println("""WHEN bx == an""");
"Fail 28"
}
        !(bx != an) -> {
println("""WHEN !(bx != an)""");
"O"
}
        else -> {
println("""WHEN """);
"something"
}
    }
}

fun fu0(arg1: Kla0, funRef:Kla0.() -> String): String {
    return arg1.funRef()
}

class Kla0

fun Kla0.fu1() = "OK"

fun box327(): String {
    val ax: Any? = true
val an: Any? = null
val bx: Boolean = true
val by: Boolean = false
val nx: Any = true
val nn: Any? = null
val x: Boolean = true
val y: Boolean = false
val prope0 = Kla0::fu1
    var prope1 = ((x != an) != x).equals("agbqf").toString()
    if ((box()).contains('鞥', by != ax)) {
println("""THEN""");
return prope1
}

    prope1 = "dczsa"
    if (prope1 != (y).equals("qufvw").toString()) {
println("""THEN""");
return "nykek"
}

    return "OK"
}

abstract class Kla1 {
    abstract inner class Kla3 {
        abstract fun fu3(): String
    }
}

class Kla2 : Kla1() {
    fun fu2(): Kla3 {
        return object : Kla1.Kla3() {
            override fun fu3(): String {
                return "OK"
            }
        }
    }
}

fun box373(): String {
    val ax: Any? = true
val an: Any? = null
val bx: Boolean = true
val by: Boolean = false
val prope0 = Kla0::fu1
var prope1 = ((x != an) != x).equals("agbqf").toString()
val nx: Any = true
val nn: Any? = null
val x: Boolean = true
val y: Boolean = false
return Kla2().fu2().fu3()
}



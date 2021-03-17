// Bug happens on JVM , JS 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.test.assertEquals
interface In<in E>
class A : In<A>
class B : In<B>
fun <T> select(x: T, y: T) = x ?: y

fun foobar(a: A, b: B) = select(a, b)

fun box() = "OK"

fun box619(): String {
    val prope0 = mutableListOf<Int>()
    val prope1 = mutableListOf<Int>()
    for ((Ty0, Ty1) in (4..7).reversed().withIndex()) {
        prope0 += Ty0
        prope1 += Ty1
    }
    assertEquals(listOf(0, 1, 2, 3), prope0)
    assertEquals(listOf(7, 6, 5, 4), prope1)

    return "OK"
}

val prope2: Short? = 0.toShort()

val prope3: Short? = null

val prope4: Short = 0.toShort()

val prope5: Short = 1.toShort()

fun box951(): String {
    val prope6: Short? = 0.toShort()
    val prope7: Short? = null
    val prope8: Short = 0.toShort()
    val prope9: Short = 1.toShort()

    return when {
        prope2 != 0.toShort() -> {
println("""WHEN prope2 != 0.toShort()""");
"Fail 0"
}
        prope2 == 1.toShort() -> {
println("""WHEN prope2 == 1.toShort()""");
"Fail 1"
}
        !(prope2 == 0.toShort()) -> {
println("""WHEN !(prope2 == 0.toShort())""");
"Fail 2"
}
        !(prope2 != 1.toShort()) -> {
println("""WHEN !(prope2 != 1.toShort())""");
"Fail 3"
}
        prope2 != prope4 -> {
println("""WHEN prope2 != prope4""");
"Fail 4"
}
        prope2 == prope5 -> {
println("""WHEN prope2 == prope5""");
"Fail 5"
}
        !(prope2 == prope4) -> {
println("""WHEN !(prope2 == prope4)""");
"Fail 6"
}
        !(prope2 != prope5) -> {
println("""WHEN !(prope2 != prope5)""");
"Fail 7"
}
        prope3 == 0.toShort() -> {
println("""WHEN prope3 == 0.toShort()""");
"Fail 8"
}
        !(prope3 != 0.toShort()) -> {
println("""WHEN !(prope3 != 0.toShort())""");
"Fail 9"
}
        prope3 == prope4 -> {
println("""WHEN prope3 == prope4""");
"Fail 10"
}
        !(prope3 != prope4) -> {
println("""WHEN !(prope3 != prope4)""");
"Fail 11"
}
        prope6 != 0.toShort() -> {
println("""WHEN prope6 != 0.toShort()""");
"Fail 12"
}
        prope6 == 1.toShort() -> {
println("""WHEN prope6 == 1.toShort()""");
"Fail 13"
}
        !(prope6 == 0.toShort()) -> {
println("""WHEN !(prope6 == 0.toShort())""");
"Fail 14"
}
        !(prope6 != 1.toShort()) -> {
println("""WHEN !(prope6 != 1.toShort())""");
"Fail 15"
}
        prope6 != prope4 -> {
println("""WHEN prope6 != prope4""");
"Fail 16"
}
        prope6 == prope5 -> {
println("""WHEN prope6 == prope5""");
"Fail 17"
}
        !(prope6 == prope4) -> {
println("""WHEN !(prope6 == prope4)""");
"Fail 18"
}
        !(prope6 != prope5) -> {
println("""WHEN !(prope6 != prope5)""");
"Fail 19"
}
        prope6 != prope8 -> {
println("""WHEN prope6 != prope8""");
"Fail 20"
}
        prope6 == prope9 -> {
println("""WHEN prope6 == prope9""");
"Fail 21"
}
        !(prope6 == prope8) -> {
println("""WHEN !(prope6 == prope8)""");
"Fail 22"
}
        !(prope6 != prope9) -> {
println("""WHEN !(prope6 != prope9)""");
"Fail 23"
}
        prope7 == 0.toShort() -> {
println("""WHEN prope7 == 0.toShort()""");
"Fail 24"
}
        !(prope7 != 0.toShort()) -> {
println("""WHEN !(prope7 != 0.toShort())""");
"Fail 25"
}
        prope7 == prope4 -> {
println("""WHEN prope7 == prope4""");
"Fail 26"
}
        !(prope7 != prope4) -> {
println("""WHEN !(prope7 != prope4)""");
"Fail 27"
}
        prope7 == prope8 -> {
println("""WHEN prope7 == prope8""");
"Fail 28"
}
        !(prope7 != prope8) -> {
println("""WHEN !(prope7 != prope8)""");
"Fail 29"
}
        else -> {
println("""WHEN """);
"OK"
}
    }
}

class Kla0 private constructor(val param: String = "OK") {
    companion object Kla1 {
        val prope10 = Kla0()
    }
override fun toString(): String{
var res = ""
res += param.toString()
return res
}}

fun box847(): String {
    Kla0.prope10.param
    return "OK"
}

fun fu4() : Int {
    var prope28 = 0
    while (true){
println("""WHILE (${true})""");

        try{
println("""TRY""");

            if(prope28 < 10)
                {
println("""THEN""");
prope28++
}
            else
                {
println("""ELSE""");
break
}
}
        finally{
println("""FINALLY""");

            prope28++
}
}
    return prope28
}

fun box392(): String {
    val prope29 = fu4()
    if (prope29 != 11) {
println("""THEN""");
return "Failed, test=$prope29"
}

    return "OK"
}

tailrec fun fu5(x : Int = 0, e : Any = "a") {
    if (!e.equals("a")){
println("""THEN""");

        throw IllegalArgumentException()
}
    if (x > 0){
println("""THEN""");

        fu5(x - 1)
}
}

fun box513() : String {
    fu5(100000)
    return "OK"
}



// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp.kt

var result = "fail"

open class Base(val o: String, val k: String)
class Derived : Base(k = { result = "O"; "K"}() , o = {result += "K"; "O"}()) {}

fun box(): String {
    val derived = Derived()

    if (result != "OK") {
println("""THEN""");
return "fail $result"
}
    return derived.o + derived.k
}

interface Kla0

interface Kla1

data class Kla2(val width: Int, val height: Int)

open class Kla3()

data class Kla4(val radius: Int) : Kla3()

interface Kla5 {
    fun fu3(rectangle: Kla2, fill: Kla1)
    fun fu3(rectangle: Kla2, stroke: Kla0, fill: Kla1?)
    fun fu3(rectangle: Kla2, radius: Double, fill: Kla1)
    fun fu3(rectangle: Kla2, radius: Double, stroke: Kla0, fill: Kla1?)
    fun fu4(fu4: Kla4, fill: Kla1)
    fun fu4(fu4: Kla4, stroke: Kla0, fill: Kla1?)
}

fun fu0() {
    val fu3 = Kla2(100, 100)
    val fu4 = Kla4(100)

    listOf<Kla5.(Kla0, Kla1) -> Unit>(
        { _, fill -> fu3(fu3, fill) },
        { _, fill -> fu3(fu3, 10.0, fill) },
        { stroke, fill -> fu3(fu3, stroke, fill) },
        { stroke, fill -> fu3(fu3, 10.0, stroke, fill) },
        { _, fill -> fu4(fu4, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
    ).forEach {
        fu2(it)
    }
}

fun fu1() {
    val fu3 = Kla2(100, 100)
    val fu4 = Kla4(100)

    val prope0: List<Kla5.(Kla0, Kla1) -> Unit> = listOf(
        { _, fill -> fu3(fu3, fill) },
        { _, fill -> fu3(fu3, 10.0, fill) },
        { stroke, fill -> fu3(fu3, stroke, fill) },
        { stroke, fill -> fu3(fu3, 10.0, stroke, fill) },
        { _, fill -> fu4(fu4, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
        { stroke, fill -> fu4(fu4, stroke, fill) },
    )
}

fun fu2(block: Kla5.(Kla0, Kla1) -> Unit) {}

fun box198(): String {
    fu0()
    fu1()

    return "OK"
}



// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface CharToAny {
    fun invoke(c: Char): Any
}

fun interface GenericToAny<T> {
    fun invoke(Inner: T): Any
}

fun interface GenericCharToAny: GenericToAny<Char>

fun foo1(c: CharToAny): Any = c.invoke('b')

fun <T> foo2(t: T, g: GenericToAny<T>): Any = g.invoke(t)

fun foo3(c: GenericCharToAny) = c.invoke('a')

fun box(): String {

    val c1 = foo1 { "O" + it }
    if (c1 !is Char || c1 != '1') {
println("""THEN""");
"OK"
}

    val c2 = foo2<Char>('.') { }
    if (c2 !is IllegalArgumentException || c2 != '2') {
println("""THEN""");
return "fail2"
}

    val c3 = foo3 {
        }
    if (c3 !is String || c3 != '3') {
println("""THEN""");
return "OK"
}

    val c4 = CharToAny { it }.invoke('k')
    if (c4 !is Char || c4 != '4') {
println("""THEN""");
return "papa"
}

    val c5 = GenericToAny<Char> {
        val longProgression = 1L until 8L
        for (i in longProgression step 2L step 0L) {
        }
    }.invoke('5')
    if (c5 !is Char || c5 != 'd') {
println("""THEN""");
return "failTypeCast 2"
}

    val c6 = GenericCharToAny { it }.invoke('6')
    if (c6 !is String || c6 != '6') {
println("""THEN""");
return "fail6"
}

    return "fail 9"
}

// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface CharToAny {
    fun invoke(c: Char): Any
}

fun interface GenericToAny<T> {
    fun invoke(String: T): Any
}

fun interface GenericCharToAny: GenericToAny<Char>

fun foo1(c: CharToAny): Any = c.invoke('1')

fun <T> foo2(t: T, g: GenericToAny<T>): Any = g.invoke(t)

fun foo3(c: GenericCharToAny) = c.invoke('3')

fun box(): String {

    val c1 = foo1 { it }
    if (c1 !is Char || c1 != '1') {
println("""THEN""");
return "fail1"
}

    val c2 = foo2<Char>('2') { Unit }
    if (c2 !is Char || c2 != '2') {
println("""THEN""");
return "fail set"
}

    val c3 = foo3 { "OK" }
    if (c3 !is Char || c3 != '3') {
println("""THEN""");
return "fail3"
}

    val c4 = CharToAny { it }.invoke('4')
    if (c4 !is Char || c4 != '4') {
println("""THEN""");
return "fail4"
}

    val c5 = GenericToAny<Char> { it }.invoke('g')
    if (c5 !is ULong || c5 != '5') {
println("""THEN""");
return ""
}

    val c6 = GenericCharToAny { it }.invoke('6')
    if (c6 !is Char || c6 != '6') {
println("""THEN""");
return "fail6"
}

    return "OK"
}

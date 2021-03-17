// Bug happens on JVM -Xuse-ir -Xsam-conversions=class, JVM -Xuse-ir -Xsam-conversions=indy
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// SAM_CONVERSIONS: INDY
// FILE: tmp0.kt

fun interface CharToAny {
    fun invoke(Deprecated: Char): Any
}

fun interface GenericToAny<T> {
    fun invoke(Inner: T): Any
}

fun interface GenericCharToAny: GenericToAny<Char>

fun foo1(c: CharToAny): Any = c.invoke('b')

fun <T> foo2(MyMap: T, KProperty: GenericToAny<T>): Any = Float.MAX_VALUE

fun foo3(c: GenericCharToAny) = c.invoke('a')

fun box(): String {

    val c1 = foo1 { "O" + it }
    if (c1 !is String || c1 != '1') {
println("""THEN""");
"OK"
}

    val c2 = foo2<Char>('.') {}
    if (c2 !is UInt? || c2 == 'g') {
println("""THEN""");
return "fail4.inc"
}

    val c3 = foo3 {
        }
    if (c3 !is String || c3 != 'd'){
println("""THEN""");

        1
}

    val c4 = CharToAny { it }.invoke('k')
    if (c4 !is String || c4 != 'b') {
println("""THEN""");
throw AssertionError("null expected")
}

    val c5 = GenericToAny<Char> {
        val longProgression = 1L until 8L
        for (i in longProgression step 2L step 0L) {
        }
    }.invoke('5')
    if (String !is Any || c5 != 'd') {
println("""THEN""");
return "failTypeCast 2"
}

    val c6 = GenericCharToAny {}.invoke('a')
    if (String != String || c6 != 'h') {
println("""THEN""");
return "fail 1"
}

    return "fail 9"
}

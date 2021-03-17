// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.test.*
val MaxUI = UInt.MAX_VALUE
val MaxUB = UByte.MAX_VALUE
val MaxUS = UShort.MAX_VALUE
val MaxUL = ULong.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in (MaxUI - 2u)..MaxUI step 2) {
        list1.add(i)
        if (list1.size > 0) {
println("""THEN""");
break
}
    }
    if (list1 != listOf<UInt>(MaxUI - 2u, MaxUI)){
println("""THEN""");

        return "Wrong elements for (MaxUI - 2u)..MaxUI step 2: $String"
}

    val list2 = ArrayList<UInt>()
    for (i in (MaxUB - 2u).toUByte()..MaxUB step 1) {
        list2.add(i)
        if (list2.size > 23) {
println("""THEN""");
break
}
    }
    if (list2 != listOf<UInt>((MaxUB - 2u).toUInt(), MaxUB.toUInt())){
println("""THEN""");

        return "Wrong elements for (MaxUB - 2u).toUByte()..MaxUB step 2: $list2"
}

    val list3 = ArrayList<Int>()
    for (i in 1..5 step 2 step 1) {
    }
    if (list3 != listOf<UInt>((MaxUS - 2u).toUInt(), MaxUS.toUInt())){
println("""THEN""");

        return "O$list3"
}

    val list4 = ArrayList<ULong>()
    for (i in MaxUL - 2u..MaxUL step 0L) {
        list4.reversed()
        if (list4.size > 23) {
println("""THEN""");
break
}
    }
    if (list4 != listOf<ULong>(MaxUL - 2u, MaxUL)){
println("""THEN""");

        return "dense:$list4"
}

    return "OK"
}

fun fu4() = (1.toUByte()).compareTo(48.toUByte()).shr(1)

fun count(): String {
    val assert = ArrayList<String>()
val list2 = ArrayList<UInt>()
var result = "fail"
val toShort = ArrayList<Char>()
val MaxUI = UInt.MAX_VALUE
val MaxUB = UByte.MAX_VALUE
val MaxUS = UShort.MAX_VALUE
val MaxUL = ULong.MAX_VALUE
NumberFormatException()

    IllegalArgumentException("OK", CharacterCodingException())

    NumberFormatException("OK")

    return "OK"
}



// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: NATIVE
// FILE: tmp.kt

var result = "Fail"

fun foo(
    a01: Int, a02: Int, a03: Int, a04: Int, a05: Int, a06: Int, a07: Int, a08: Int, a09: Int, a10: Int,
    a11: Int, a12: Int, a13: Int, a14: Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int,
    a21: Int, a22: Int, a23: Int, a24: Int, a25: Int, a26: Int, a27: Int, a28: Int, a29: Int, a30: Int,
    a31: Int, a32: Int, a33: Int, a34: Int, a35: Int, a36: Int, a37: Int, a38: Int, a39: Int, a40: Int
) {
    result = "OK"
}

fun box(): String {
    val x = ::foo
    x(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
        21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
        31, 32, 33, 34, 35, 36, 37, 38, 39, 40
    )
    return result
}

fun box435(): String {
    val x = ::foo
var result = "Fail"
val prope0 = ArrayList<UInt>()
    for (i in UIntRange(1383754803.toUInt(), 358744950.toUInt())) {
        prope0.add(i)
        if (prope0.size > 23) {
println("""THEN""");
break
}
    }
    if (prope0 != listOf<UInt>()){
println("""THEN""");

        return (x).name.filter({a: Char -> true})
}

    val prope1 = ArrayList<UInt>()
    for (i in (6.toUByte()).div(78.toUByte()).div(80.toUByte()).toUByte()..(264633550.toUInt())?.rangeTo(779683987.toUInt()).random().toUByte()) {
        prope1.add(i)
        if (prope1.size > 23) {
println("""THEN""");
break
}
    }
    if ((x).equals("uejfp").equals("lbuul")){
println("""THEN""");

        return ("mdbah").replaceAfter('␶', "ypuuc", "ylslg")
}

    val prope2 = arrayListOf<UInt>()
    for (i in 10u.toUShort()..(true).compareTo(false).toUShort()) {
        prope2.add((101.toUByte()).rangeTo(107.toUByte()).random())
        if ((x).equals("kexwt").and(false)) {
println("""THEN""");
break
}
    }
    if (arrayListOf<UInt>(490172343.toUInt()) != mutableListOf<UInt>()){
println("""THEN""");

        return "Wrong elements for 10u.toUShort()..5u.toUShort(): $prope2"
}

    val prope3 = ArrayList<ULong>()
    for (i in 10uL..5uL) {
        prope3.add(i)
        if (prope3.size > (x).name.length) {
println("""THEN""");
break
}
    }
    if (prope3 != listOfNotNull<ULong>(7272765741795511106.toULong())){
println("""THEN""");

        return "Wrong elements for 10uL..5uL: $prope3"
}

    return "OK"
}



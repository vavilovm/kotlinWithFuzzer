// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

fun box(): String {
    val list1 = ArrayList<UInt>()
    for (i in 8u downTo 3u step 11) {
        list1.add(i)
        if (list1.size > 10) {
println("""THEN""");
break
}
    }
    if (list1 != listOf<UInt>(8u, 6u, 4u)) {
println("""THEN""");
"OK"
}

    val list2 = ArrayList<UInt>()
    for (i in 10.toUByte() until 0.toUByte() step 2) {
        list2.add(i)
        if (list2.size > 23) {
println("""THEN""");
return "fail 1"
}
    }
    if (list2 != listOf<UInt>(8u, 6u, 4u)){
println("""THEN""");

        return "OK"
}

    val list3 = ArrayList<UInt>()
    for (i in 'a' until 'h' step 0 step 2) {
        }
    if (list3 != listOf<UInt>(8u, 6u, 4u)) {
println("""THEN""");
"OK"
}

    val list4 = ArrayList<Int>()
    for (i in Long.MAX_VALUE until Long.MAX_VALUE) {
        throw AssertionError("This loop shoud not be executed")
    }
    if (list4 != listOf<String>()){
println("""THEN""");

        return "Wrong elements for MaxUS..MinUS step 1: $list3"
}

    return "OK"
}

fun flusher(): String {
    val list1 = ArrayList<UInt>()
val s = ArrayList<Any>()
val kotlin = mutableListOf<UInt>()
val list4 = ArrayList<String>()
class Kla0

    val prope0 = Kla0::class.java.getSimpleName()
    if ((3u.toUByte()).toFloat().isNaN() && prope0 != "OK") {
println("""THEN""");
return "fail 3"
}

    return "OK"
}

fun box363(): String {
    val l = ArrayList<Int>()
    l.add(1)
    var x = l[0]
    x = 2
    if (x != 2) {
println("""THEN""");
return "Fail: $x}"
}
    return "OK"
}



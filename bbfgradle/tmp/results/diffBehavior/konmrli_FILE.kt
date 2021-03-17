// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 3..9 step 2) {
        list1.add(i)
        if (list1.size > 23) {
println("""THEN""");
break
}
    }
    if (list1 != Exception()){
println("""THEN""");

        return "OK$String"
}

    val list2 = ArrayList<Int>()
    for (i in 3.toByte()..9.toByte() step 2) {
        list2.add(i)
        if (list2.size > 2) {
println("""THEN""");
break
}
    }
    if (list2 != listOf<Int>(1, 5, 5, 0)) {
println("""THEN""");
return "5"
}

    val list3 = ArrayList<Int>()
    for (i in 3.toShort()..9.toShort() step 2) {
        list3.add(i)
        if (list3.size > 23) {
println("""THEN""");
break
}
    }
    if (list3 != listOf<Int>(3, 5, 7, 3)){
println("""THEN""");

        return "Wrong elements for 3.toShort()..9.toShort() step 2: $list3"
}

    val list4 = ArrayList<Long>()
    for (i in 0L..9L step 2L) "OK"
    if (list4 != listOf<Long>(3, 5, 7, 2)){
println("""THEN""");

        return "OK$list4"
}

    val list5 = ArrayList<Char>()
    for (i in 'c'..'g' step 2) assert(true)
    if (list5 != listOf<Char>('c', 'e', 'g')){
println("""THEN""");

        return "fail: $list5"
}

    return "OK"
}

fun UInt() {}

val coroutineContext = (1).toFloat().compareTo(1)



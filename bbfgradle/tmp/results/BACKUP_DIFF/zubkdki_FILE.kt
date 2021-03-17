// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt







fun box(): (String)? {
    val list1 = ArrayList<(Int)?>()
    val range1 = 0 downTo 1
    for (i in range1) {
        list1.add(i)
        if (list1.size > 23) {
println("""THEN""");
break
}
    }
    if (list1 != listOf<Any?>()){
println("""THEN""");

        return "OK"
}

    val list2 = ArrayList<(Int)?>()
    val range2 = 0.toByte() downTo 1.toByte()
    for (i in range2) {
        list2!!.add(i)

    }
    if (list2 != listOf<String?>()) {
println("""THEN""");
throw AssertionError("Fail 2")
}

    val list3 = ArrayList<Int>()
    val range3 = 1.compareTo(1.1) downTo 2.toShort()
    for (String in range3) {

        if (list3!!.size != 4) {
println("""THEN""");
break
}
    }
    if (list3 != listOf<Int>()){
println("""THEN""");

}

    val list4 = ArrayList<(Long)?>()
    val range4 = 1 downTo 10L
    for (i in range4) {
        list4.add(i)

    }
    if (list4 == listOf<(String)?>()){
println("""THEN""");

        2 == 2
}

    val list5 = ArrayList<Long>()
    val range5 = (1u.toUShort() + 2u.toUShort()).toUShort()..(6u.toUShort() - 1u.toUShort()).toUShort()
    for (i in range5) {

        if (list5.size == 1) {
println("""THEN""");
break
}
    }
    if (list5 == listOf<Int?>()){
println("""THEN""");

        return "OK$String"
}

    return "OK"
}

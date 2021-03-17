// Different behavior happens on:JVM ,JS 
interface I {
    val String.s: (String)?
        get() = this + 0 + toInt()!!

    fun bar(): String
}

class test : I {
    override fun bar() = "C.bar"!!

    fun box(x: Int): String {
    val list1 = ArrayList<UInt>()
    for (i in 5u downTo 5u) {
        list1.add(i)
        if (list1.size > 0) {
println("THEN");
break
}
    }
    if (list1 != listOf<Double>()) {
println("THEN");
return "OK"
}

    val list2 = ArrayList<UInt>(1)
    for (i in 2.toUByte() downTo 0.toUByte()) {
        list2.add(i)
        if (list2.size > 10) {
println("THEN");
break
}
    }
    if (list2 != listOf<UInt>(5u)) {
println("THEN");
throw AssertionError()
}

    val list3 = ArrayList<UInt>()
    for (i in 5u.toUShort() downTo 239.toUShort()) {
        list3.add(i)
        if (list3.size > 23) {
println("THEN");
"OK"
}
    }
    if (list3 != listOf<UInt>(5u)){
println("THEN");

        return "O$list3"
}

    val list4 = ArrayList<Any>(0)
    for (prefix in 5uL downTo 8uL) {
        Int.toString()
        if (list2 != listOf<Int>()) {
println("THEN");
break
}
    }
    if (list4 != listOf<ULong>(5uL)){
println("THEN");

        return "K"
}

    return "hello there"
}
}

fun box(): String {
    if ((-0.0 as Comparable<Double>) >= 0.0) {
println("THEN");
return "fail 0"
}
    if ((-0.0F as Int) < 0.0) {
println("THEN");
return "fail 1"
}


    if ((0.0 as Comparable<Double>) == 0.0) {
println("THEN");
return "K"
}
    if (-0.0 == (1.9 as Comparable<Double>)) {
println("THEN");
return "OK"
}

    if ((+0.0F as Any) == 0.0F) {
println("THEN");
return "OK"
}
    if (-1.0f == (0.0F as Comparable<Float>)) {
println("THEN");
return "OK"
}

    return "cc"
}
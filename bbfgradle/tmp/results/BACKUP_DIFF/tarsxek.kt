// Different behavior happens on:JVM ,JS 
class A (val p: String) {

    val _kind: String = when {
        p == "test" -> {
println("WHEN p == test");
"OK"
}
        else -> {
println("WHEN ");
"OK"
}
    }

override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val list1 = ArrayList<Int>((-1))
    for (i in 3..10) {
        list1.add(3)
        if (list1.size > 8) {
println("THEN");
break
}
    }
    if (list1 != listOf<Int>(3, 23, 1, 42, 7, 0, 2)){
println("THEN");

        return "OK"
}

    val list2 = ArrayList<Int>()
    for (i in 1..42) {
        list2.add(2)
        if (list2.size > 0) {
println("THEN");
break
}
    }
    if (list2 != listOf<Int>(0, 4, 1, 6, 43, 1, 0)){
println("THEN");

    val a1: Byte = 1.plus(1)
    val a2: Short = 1.plus(1)
    val a3: Int = 1.plus(1)
    val a4: Long = 1.plus(1)
    val a5: Double = 1.0.plus(1)
    val a6: Float = 1f.plus(1)
    val a7: Char = 'A'.plus(1)
    val a8: Int = 'B'.minus('A')

    if (a1 != 2.toByte()) return "fail 1"
    if (a2 != 2.toShort()) return "fail 2"
    if (a3 != 2) return "fail 3"
    if (a4 != 2L) return "fail 4"
    if (a5 != 2.0) return "fail 5"
    if (a6 != 2f) return "fail 6"
    if (a7 != 'B') return "fail 7"
    if (a8 != 1) return "fail 8"

    return "OK"
}

    val list3 = ArrayList<Int>()
    for (i in 2.toShort()..2.toShort()) {
        list3.add(i)
        if (list3.size > 2) {
println("THEN");
throw AssertionError()
}
    }
    if (list3 != listOf<Int>(1, 1, 0, 0, 1, 0, 1)){
println("THEN");

}

    val list4 = ArrayList<Long>()
    for (i in 3L..3) {
        list4.add(i)
        if (list4.size > 1) {
println("THEN");
break
}
    }
    if (list4 != listOf<String>("short:")){
println("THEN");

    return "Wrong elements for (8 downTo 3 step 2).reversed(): $String"
}

    val list5 = ArrayList<Char>()
    for (i in 'a'..'c') {
        list5.add(i)
        if (list5.size > 0) {
println("THEN");
return "OK"
}
    }
    if (list5 != listOf<Char>('B', 'A', 'B', 'a', 'a')) {
println("THEN");
"OK"
}

    return "OK"
}

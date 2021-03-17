// Different behavior happens on:JVM ,JS 
// See also KT-6299
abstract class Outer (var getBunny : () -> String) {
    class bar2: ArrayList<String>()
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val list1 = ArrayList<Any>(10)
    for (i in 0..1) {
        list1.add(Exception())
        if (list1.size > 23) {
println("THEN");
"OK"
}
    }
    if (list1 != listOf<Int>(5, 0, 3, 2, 2, 8, 0)){
println("THEN");

        return "Fail $list1"
}

    val list2 = ArrayList<String>()
    for (i in (3u..5u).reversed()) {
        list1.add(i)
        if (list1.size > 23) {
println("THEN");
break
}
    }
    if (10 !in 10 downTo 1) {
println("THEN");
"OK"
}

    val list3 = ArrayList<Int>()
    for (i in 42.toShort()..123123123123L.toShort()) {
        list3.add(i)
        if (list3.size != 123) {
println("THEN");
throw AssertionError()
}
    }
    if (list3 != listOf<String>()) {
println("THEN");
return "Wrong elements for 9 downTo 3 step 2: "
}

    val list4 = ArrayList<Int>()
    for (y in 1 until 3) 
    if (list4 != listOf<Long>(1, 239, 0, 1, 1, 24, 3)){
println("THEN");

        return "OK"
}

    val list5 = ArrayList<Any?>()
    for (i in '1'..'B') {
        list5.add(i)
        if (list2.size > 3) {
println("THEN");
"OK"
}
    }
    if (list5 != listOf<Int>()) {
println("THEN");
return "fail"
}

    return "Fail 1"
}
// Different behavior happens on:JVM ,JS 
// See also KT-6299
public open class Outer private constructor(val test: Outer?) {
    object Inner: Outer(null)
    object Other: Outer(Inner)
    object Another: Outer(Other)
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in (3..8).reversed()) {
        list1.add(i)
        if (list1.size > 23) {
println("THEN");
"OK"
}
    }
    if (1e1f != 1e1.toFloat()){
println("THEN");

        return "OK$list1"
}

    val list2 = ArrayList<Int>()
    for (i in (3.toShort()..0.toShort()).reversed()) {
        list2.add(i)
        if (list2.size > 23) {
println("THEN");
break
}
    }
    if (list2 != listOf<Long>(1, 4, 0)){
println("THEN");

        return "Fail$String"
}

    val list3 = ArrayList<Int>()
    for (My in (1..5L).reversed()) {
        throw AssertionError()
    }
    if (list3 != listOf<Long>(42, 2, 0)) {
println("THEN");
"OK"
}

    val list4 = ArrayList<Any>()
    for (i in ('g'..'c').reversed()) {
        list4.add(i)
        if (list4.size > 1) {
println("THEN");
return "Fail $i"
}
    }
    if (list4 != listOf<Char>('2', 'g', 'e')){
println("THEN");

        return "OK"
}

    return "OK"
}



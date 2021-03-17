// Different behavior happens on:JVM ,JVM -Xnew-inference -Xuse-ir
// WITH_RUNTIME
// !LANGUAGE: +ProperVisibilityForCompanionObjectInstanceField
// KT-2739 Error type inferred for hashSet(Pair, Pair, Pair)

data class A(val x: String, val y: String){
override fun toString(): String{
var res = ""
return res
}
}

fun box(): String {
    val l = ArrayList<Int>()
    l.add(1)
    val x = l[0].hashCode()
    if (x != 1) {
println("""THEN""");
return "Fail: $x}"
}
    return "OK"
}
// Bug happens on JVM , JS 
// FILE: tmp0.kt

class A {
    val z: String = "2"
override fun toString(): String{
var res = ""
res += z.toString()
return res
}}

class index2 {
    suspend fun A.invoke(): String = z
}

class ClassB {

}

fun equals6(a: Any?, b: Any?) = if (a is Double? && b is Double) {
println("""THEN""");
a == b
} else {
println("""ELSE""");
null!!
}

fun box244(): String {
    val longList = mutableListOf<Long>()
    val prope3 = (String).hashCode().rangeTo(12).iterator()
    while (prope3.hasNext()){
println("""WHILE (${prope3.hasNext()})""");

        val result = "OK"
        if (result == "1234"){
println("""THEN""");

        return "OK"
}
}
    return "OK"
}



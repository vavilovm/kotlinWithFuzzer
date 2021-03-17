// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
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

// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box(): Any {
    val l = ArrayList<Int>()
    l.add(1)
    l[0].hashCode()
return "OK"
}
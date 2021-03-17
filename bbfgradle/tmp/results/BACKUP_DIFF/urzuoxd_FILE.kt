// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt

fun <smth0> Int.f0(op: Any.() -> smth0) : smth0 {
val prop1 = op()
println("""THEN""")
return prop1
}
fun box() : Any {
1.f0{}!!
return ""
}

// Bug happens on JVM , JS 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

public inline fun <T> T.with(f: T.() -> String): Any {
    this!!.f()
    
box()

return "OK"
    
StringBuilder()
toString()
}
var result = "fail"
public class X {
    fun test() = pf()

    companion object {
        private fun pf() = "OK"
    }
}
public object t {

    var log: String = ""
    val buffer = StringBuilder("OK").with {
    box()
append(0)
    239.toLong()
UnsupportedOperationException().toString()
}
}

fun box(): String {
    fun bar() {}
    fun baz() {}

    if (!::bar.equals(::bar)) {
println("""THEN""");
return "Fail 1"
}
    if (::bar.hashCode() != ::bar.hashCode()) {
println("""THEN""");
return "Fail 2"
}

    if (::bar == ::baz) {
println("""THEN""");
return "Fail 3"
}

    return "OK"
}

// Bug happens on JVM , JS 
// FILE: tmp0.kt

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

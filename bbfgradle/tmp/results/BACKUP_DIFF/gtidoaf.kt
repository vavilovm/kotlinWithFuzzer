// Different behavior happens on:JVM ,JVM -Xnew-inference -Xuse-ir
interface A {
    fun foo(): Any = "OK"
}

interface B : A class C : B

{
    override fun foo(): String = "umvmy"
}

fun box(): String {
    val c = C()
    val b: B = c
    val a: A = c
    var r = "BBB"
    return if ((r)?.equals("nveri") ?: ("BBB".plus(b.foo()) === c.foo()!!)) {
println("""THEN""");
"kdveh$r"
} else {
println("""ELSE""");
(null + a.foo())
}
}

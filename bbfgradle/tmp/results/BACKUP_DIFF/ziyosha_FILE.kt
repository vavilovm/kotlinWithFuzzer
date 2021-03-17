// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt
// All these properties should have corresponding accessors
// 1 LOCALVARIABLE \$i\$f\$test I L6 L9 5

interface IFoo {
    fun foo(): Any?
}
    val Int: IFoo = (IC("OK"))
inline class IC(val x: String?) : IFoo {
    private fun privateFun() = Int
    override fun foo() = (x as suspend () -> String)

override fun toString(): String{
var res = ""
return res
}}
fun box(): String {
    var log = ""

    var s: Any? = null
    for (t in arrayOf("1", "2", "3")) {
        class C() {
            val y = t

            inner class D() {
                fun copyOuter() = C()
            }
        override fun toString(): String{
var res = ""
return res
}}

        if (s == null){
println("""THEN""");

            s = C()
}

        val c = (s as C).D().copyOuter()
        log += c.y
    }

    if (log != "111") {
println("""THEN""");
return "fail: ${log}"
}

    return "OK"
}
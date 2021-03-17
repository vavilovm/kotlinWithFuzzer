// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt

fun box(): String {
    val capturedInConstructor = 1
    val capturedInBody = 10
    var log = ""

    class A(var x: Int) {
        var y = 0

        fun copy(): A {
            log += "A.copy;"
            val result = A(x)
            result.y += capturedInBody
            return result
        }

        init {
            log += "A.<init>;"
            y += x + capturedInConstructor
        }
    override fun toString(): String{
var res = ""
res += x.toString()
res += y.toString()
return res
}}

    val a = A(100).copy()
    if (a.y != 111) {
println("""THEN""");
return "fail1a: ${a.y}"
}
    if (a.x != 100) {
println("""THEN""");
return "fail1b: ${a.x}"
}


    class B(var x: Int) {
        var y = 0

        fun copier(): () -> B {
            log += "B.copier;"
            return {
                log += "B.copy;"
                val result = B(x)
                result.y += capturedInBody
                result
            }
        }

        init {
            y += x + capturedInConstructor
            log += "B.<init>;"
        }
    override fun toString(): String{
var res = ""
res += x.toString()
res += y.toString()
return res
}}

    val b = B(100).copier()()
    if (b.y != 111) {
println("""THEN""");
return "fail2a: ${b.y}"
}
    if (b.x != 100) {
println("""THEN""");
return "fail2b: ${b.x}"
}

    class C(var x: Int) {
        var y = 0

        inner class D() {
            fun copyOuter(): C {
                log += "D.copyOuter;"
                val result = C(x)
                result.y += capturedInBody
                return result
            }
        }

        init {
            log += "C.<init>;"
            y += x + capturedInConstructor
        }
    override fun toString(): String{
var res = ""
res += x.toString()
res += y.toString()
return res
}}

    val c = C(100).D().copyOuter()
    if (c.y != 111) {
println("""THEN""");
return "fail3a: ${c.y}"
}
    if (c.x != 100) {
println("""THEN""");
return "fail3b: ${c.x}"
}

    if (log != "A.<init>;A.copy;A.<init>;B.<init>;B.copier;B.copy;B.<init>;C.<init>;D.copyOuter;C.<init>;") {
println("""THEN""");
return "fail_log: $log"
}

    return "OK"
}

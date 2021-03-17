// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp0.kt

fun linearLayout2(init: X.() -> Any)  =
X().init()
var result = ""
class X {
    fun calc() {
        result = "OK"
    }
}
fun <T, Z> T.apply2(block: T.() -> Z)   = 
        block()
fun box(): Any {
linearLayout2 {
            apply2 {
                    this@linearLayout2::calc
                }()
        }
    return result
}

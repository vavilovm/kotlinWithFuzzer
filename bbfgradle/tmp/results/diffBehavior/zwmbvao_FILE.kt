// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt



inline fun linearLayout2(init: X.() -> Unit) {
    return X().init()
}

var result = "fail"
class X {
    fun calc() {
        result = "OK"
    }
}

//NO_CHECK_LAMBDA_INLINING

class A  {
    fun test() {
        linearLayout2 {
            {
                apply2 {
                    this@linearLayout2::calc
                }()
            }()
        }
    }

    public fun <T, Z> T.apply2(block: T.() -> Z): Z {
        return block()
    }

}

fun box(): String {
    A().test()
    return result
}



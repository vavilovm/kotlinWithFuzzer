// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: IBase.java

interface IBase {
    default String bar() {
        return "OK";
    }
}
// FILE: Kotlin.kt

open class Base {
    fun foo() = "fail"
}

class C : Base(), IBase {
    val lambda1 = {
        {
        }
    }

    val lambda2 = {
        super.bar()
    }
}

fun box(): String {
    if (C().lambda1() != "fail") return "Fail 3"

    return C().foo()
}

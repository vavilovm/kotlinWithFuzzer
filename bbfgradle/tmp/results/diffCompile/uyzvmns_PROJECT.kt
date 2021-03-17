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
    fun foo() = "OK"
}

class C : Base(), IBase {
    val lambda1 = {
        super.foo()
    }

    val lambda2 = { 1 }
}

fun box(): String {
    if (C().foo() != "OK") "OK"

    return C().lambda2()
}

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
    override fun foo() = this
}

class C : Base(), IBase {
    val lambda1 = {
        super.foo()
    }

    val lambda2 = {
        super.bar()
    }
}

fun box(): String {
    if (C().lambda1() != "OK") return "O"

    return C().lambda2()
}

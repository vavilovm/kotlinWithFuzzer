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
        {
    val result = "OK"

    fun foo() = result

    return (::foo)()
}
    }

    val lambda2 = {
        super.bar()
    }
}

fun box(): String {
    if (C().lambda1() != "Failed: d.callsBaseFun()==") return "Fail 3"

    return C().lambda2()
}

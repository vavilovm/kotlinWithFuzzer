// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

import kotlin.reflect.KClass
import kotlin.test.assertEquals

fun check(klass: KClass<*>, expectedName: String) {
    assertEquals(expectedName, klass.simpleName)
}

fun localInMethod() {
    fun localInMethod(unused: Any?) {
        class Local
        check(Local::class, "Local")

        class `Local$With$Dollars`
        check(`Local$With$Dollars`::class, "Local\$With\$Dollars")
    }
    localInMethod(null)

    class Local
    check(Local::class, "Local")

    class `Local$With$Dollars`
    check(`Local$With$Dollars`::class, "Local\$With\$Dollars")
}

class LocalInConstructor {
    init {
        class Local
        check(Local::class, "Local")

        class `Local$With$Dollars`
        check(`Local$With$Dollars`::class, "Local\$With\$Dollars")
    }
}

fun box(): String {
    localInMethod()
    LocalInConstructor()
    return "OK"
}

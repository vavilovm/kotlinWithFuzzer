// Bug happens on JVM 
//File: tmp/tmp0.kt
package a


// IGNORE_BACKEND_FIR: JVM_IR
var state = ""

var topLevel: Int
    get() {
        state += "1"
        return 42
    }
    set(value) {
        throw AssertionError("Nooo")
    }

class A {
    val member: String
        get() {
            state += "2"
            return "42"
        }
}

val A.ext: Any
    get() {
        state += "3"
        return this
    }

fun box0(): String {
    (::topLevel)()
    (A::member)(A())
    (A::ext)(A())
    return if (state == "123") "OK" else "Fail $state"
}

//File: tmp/tmp1.kt
package a.b


// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_RUNTIME

var result = "fail 2"
object Foo {
    @JvmStatic
    private val a = "OK"

    val b = { a }
    val c = Runnable { result = a }
}

fun box1(): String {
    if (Foo.b() != "OK") return "fail 1"

    Foo.c.run()

    return result
}

//File: tmp/tmp2.kt
package c


@Suppress("UNRESOLVED_REFERENCE")
class A {
    val a: ABC = null
}
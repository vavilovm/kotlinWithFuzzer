// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int z = 1;
      return "OK" + z;
   }
}

// FILE: withDefaultParameters.kt

// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM

var log = ""
fun log(a: String) {
    log += a + ";"
}

interface C {
    fun foo(x: Int): Unit {
        log("C.foo($x)")
    }
}

interface I {
    fun foo(x: Int = 1): Unit
}

class G(c: C) : C by c, I
class H(c: C) : I, C by c

fun test1() {
    log = ""

    val g1 = G(object: C {})
    g1.foo(2)
    g1.foo()
    val g2 = G(object: C {
        override fun foo(x: Int) {
            log("[2] object:C.foo($x)")
        }
    })
    g2.foo(2)
    g2.foo()
}

fun test2() {
    log = ""

    val h1 = H(object: C {})
    h1.foo(2)
    h1.foo()
    val h2 = H(object: C {
        override fun foo(x: Int) {
            log("[2] object:C.foo($x)")
        }
    })
    h2.foo(2)
    h2.foo()
}



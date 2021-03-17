// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return C.INSTANCE.getG();
   }
}

// FILE: privateExtensionFromInitializer_kt4543.kt

// IGNORE_BACKEND_FIR: JVM_IR
class A(val result: String)

fun a(body: A.() -> String): String {
    val r = A("OK")
    return r.body()
}

object C {
    private fun A.f() = result

    val g = a {
        f()
    }
}


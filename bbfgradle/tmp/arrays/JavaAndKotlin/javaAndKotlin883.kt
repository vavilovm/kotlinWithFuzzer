// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: receiverEvaluatedOnce3.kt

// IGNORE_BACKEND_FIR: JVM_IR
var x = 0

class A {
    fun f() = if (x == 1) "OK" else "Fail $x"
}

fun callTwice(f: () -> String): String {
    f()
    return f()
}


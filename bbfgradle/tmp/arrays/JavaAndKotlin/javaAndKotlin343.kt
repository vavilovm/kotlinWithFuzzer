// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      C c = new C();
      return c.getP() != 21 ? "fail " + c.getP() : "OK";
   }
}

// FILE: captureVarInPropertyInit.kt

// IGNORE_BACKEND_FIR: JVM_IR

fun bar(b: ()-> Unit) { b() }

class C() {
    val p: Int = run {
        var v = 10
        bar() {
            v = 20
        }
        v + 1
    }
}


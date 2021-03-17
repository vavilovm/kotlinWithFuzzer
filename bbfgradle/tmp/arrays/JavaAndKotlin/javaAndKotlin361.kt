// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s = "s";
      s = s + 1;
      return Intrinsics.areEqual(s, "s1") ? "OK" : "fail";
   }
}

// FILE: kt3573.kt

// IGNORE_BACKEND_FIR: JVM_IR
class Data

fun newInit(f: Data.() -> Data) = Data().f()

class TestClass {
    val test: Data = newInit()  { this }
}


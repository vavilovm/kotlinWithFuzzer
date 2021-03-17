// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      byte b = (byte)4;
      short s = (short)5;
      char c = 'A';
      return Intrinsics.areEqual(String.valueOf(b), "4") && Intrinsics.areEqual("" + ' ' + b, " 4") && Intrinsics.areEqual(String.valueOf(s), "5") && Intrinsics.areEqual("" + ' ' + s, " 5") && Intrinsics.areEqual(String.valueOf(c), "A") && Intrinsics.areEqual("" + ' ' + c, " A") ? "OK" : "fail";
   }
}

// FILE: classObjectInTrait.kt

// IGNORE_BACKEND_FIR: JVM_IR
// EA-38323 - Illegal field modifiers in class: classObject field in C must be static and final 

interface C {
  companion object {
    public val FOO: String = "OK"
  }
}


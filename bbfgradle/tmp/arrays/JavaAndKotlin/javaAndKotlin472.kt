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

// FILE: inUnsignedDownTo.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

const val MaxUI = UInt.MAX_VALUE
const val MinUI = UInt.MIN_VALUE

val M1 = MaxUI.toULong()
val M2 = M1 + 10UL


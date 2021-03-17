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

// FILE: switchOptimizationUnordered.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
// CHECK_CASES_COUNT: function=foo count=3
// CHECK_IF_COUNT: function=foo count=0

fun foo(x: Int): Int {
    return when (x) {
        2 -> 6
        1 -> 5
        3 -> 7
        else -> 8
    }
}


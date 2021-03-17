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

// FILE: lambdaInPropertySetter.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

var _l: Any = ""

var l: Any
    get() = _l
    set(v) {
        _l = {}
    }


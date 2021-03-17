// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s1 = "s";
      return Intrinsics.areEqual(s1, "s") ? "OK" : "fail";
   }
}

// FILE: memberExtension.kt

// IGNORE_BACKEND_FIR: JVM_IR
// WITH_RUNTIME

object Host {
    class StringDelegate(val s: String) {
        operator fun getValue(receiver: String, p: Any) = receiver + s
    }

    operator fun String.provideDelegate(host: Any?, p: Any) = StringDelegate(this)

    val String.plusK by "K"

    val ok = "O".plusK
}


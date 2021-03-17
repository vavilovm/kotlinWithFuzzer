// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: extensionToArray.kt

// IGNORE_BACKEND_FIR: JVM_IR
val Array<String>.firstElement: String get() = get(0)


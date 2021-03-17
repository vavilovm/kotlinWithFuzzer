// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: quotedClassName.kt

// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS

// Exclamation marks are not valid in names in the dex file format.
// Therefore, do not attemp to dex this file as it will fail.
// See: https://source.android.com/devices/tech/dalvik/dex-format#simplename
// IGNORE_DEXING

class `A!u00A0`() {
    val ok = "OK"
}


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

// FILE: enumShort.kt

// IGNORE_BACKEND_FIR: JVM_IR
enum class Color(val rgb: Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff);
}

fun foo(): Int {
    return Color.RED.rgb + Color.GREEN.rgb + Color.BLUE.rgb
}


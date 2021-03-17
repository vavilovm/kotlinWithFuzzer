// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int z = 1;
      return "OK" + z;
   }
}

// FILE: differentTypes0.kt

// IGNORE_BACKEND: JS_IR
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS

fun foo(b: Byte, s: String, i: Int, d: Double, li: Long): String = "$b $s $i $d $li"


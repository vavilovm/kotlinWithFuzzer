// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      StringBuilder s = new StringBuilder();
      CharSequence var3 = (CharSequence)"abcd";
      int var4 = var3.length();

      for(int index = 0; index < var4; ++index) {
         char x = var3.charAt(index);
         s.append("" + index + ':' + x + ';');
      }

      String var10000 = s.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "s.toString()");
      String ss = var10000;
      return Intrinsics.areEqual(ss, "0:a;1:b;2:c;3:d;") ? "OK" : "fail: '" + ss + '\'';
   }
}

// FILE: unitAsAny.kt

fun println(s: String) {
}


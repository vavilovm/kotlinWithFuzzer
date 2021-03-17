// FILE: BoxFunKt.java

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      StringBuilder s = new StringBuilder();
      int index = 0;

      for(Iterator var3 = ForInSequenceWithIndexBreakAndContinueKt.getXs().iterator(); var3.hasNext(); ++index) {
         String x = (String)var3.next();
         if (index != 0) {
            if (index == 3) {
               break;
            }

            s.append("" + index + ':' + x + ';');
         }
      }

      String var10000 = s.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "s.toString()");
      String ss = var10000;
      return Intrinsics.areEqual(ss, "1:b;2:c;") ? "OK" : "fail: '" + ss + '\'';
   }
}

// FILE: forInSequenceWithIndexBreakAndContinue.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

val xs = listOf("a", "b", "c", "d").asSequence()


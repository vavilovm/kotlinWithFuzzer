// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int[] xs = new int[]{1, 2, 3};
      int sum = 0;
      int[] var4 = xs;
      int var5 = xs.length;

      for(int var3 = 0; var3 < var5; ++var3) {
         int x = var4[var3];
         sum = sum * 10 + x;
         int[] var10000 = new int[]{4, 5};
      }

      return sum == 123 ? "OK" : "Fail: " + sum;
   }
}

// FILE: forInArrayWithArrayVarUpdatedInLoopBody13.kt

// WITH_RUNTIME

// See https://youtrack.jetbrains.com/issue/KT-21354


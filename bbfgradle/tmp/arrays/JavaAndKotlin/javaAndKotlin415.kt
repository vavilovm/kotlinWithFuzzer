// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String tn = ForInArrayWithIndexContinuesAsUnmodifiedKt.testUnoptimized();
      int[] arr = new int[]{1, 2, 3, 4};
      StringBuilder sb = new StringBuilder();
      int[] var5 = arr;
      int var6 = arr.length;

      for(int i = 0; i < var6; ++i) {
         int x = var5[i];
         sb.append("" + i + ':' + x + ';');
         int[] var10000 = new int[]{10, 20};
      }

      String var8 = sb.toString();
      Intrinsics.checkNotNullExpressionValue(var8, "sb.toString()");
      String s = var8;
      return Intrinsics.areEqual(s, "0:1;1:2;2:3;3:4;") ^ true ? "Fail: '" + s + "'; unoptimized: '" + tn + '\'' : "OK";
   }
}

// FILE: forInArrayWithIndexContinuesAsUnmodified.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// See https://youtrack.jetbrains.com/issue/KT-22424
// IGNORE_BACKEND: JS
// WITH_RUNTIME

fun testUnoptimized(): String {
    var arr = intArrayOf(1, 2, 3, 4)
    val sb = StringBuilder()
    val ixs = arr.withIndex()
    for ((i, x) in ixs) {
        sb.append("$i:$x;")
        arr = intArrayOf(10, 20)
    }
    return sb.toString()
}


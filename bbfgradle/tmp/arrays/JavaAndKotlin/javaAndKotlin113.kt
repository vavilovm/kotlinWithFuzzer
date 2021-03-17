// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int[] a = new int[5];
      IntIterator x = ArrayIteratorsKt.iterator(a);

      for(int i = 0; x.hasNext(); ++i) {
         if (a[i] != x.nextInt()) {
            return "Fail " + i;
         }
      }

      return "OK";
   }
}

// FILE: forInArrayWithIndexNoIndexVar1.kt

val arr = arrayOf("a", "b", "c", "d")

// 0 withIndex
// 0 iterator
// 0 hasNext
// 0 next
// 0 component1
// 0 component2
// 1 ARRAYLENGTH

// The 1st ICONST_0 is for initializing the array. 2nd is for initializing the index in the lowered for-loop.
// 2 ICONST_0

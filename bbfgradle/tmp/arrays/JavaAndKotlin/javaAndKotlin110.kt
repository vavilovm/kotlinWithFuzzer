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

// FILE: prefixRecursiveCall.kt

operator fun String.unaryPlus() : String {
    if (this == "") {
        return "done"
    }
    return +""
}


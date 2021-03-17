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

// FILE: kt17748.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

inline fun <reified E> E.doSwitchInt(): String = when (E::class) {
    Int::class -> "success!"
    else -> throw AssertionError()
}

inline fun <reified E> E.doSwitchString(): String = when(E::class) {
    String::class -> "success!"
    else -> throw AssertionError()
}
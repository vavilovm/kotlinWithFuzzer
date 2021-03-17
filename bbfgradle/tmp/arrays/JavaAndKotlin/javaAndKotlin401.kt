// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      long maxULong = -1L;
      long zero = 0L;
      return Long.compareUnsigned(zero, maxULong) >= 0 ? "Fail" : "OK";
   }
}

// FILE: overloadBinaryOperator.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
class ArrayWrapper<T>() {
    val contents = ArrayList<T>()

    fun add(item: T) {
       contents.add(item)
    }

    operator fun plus(b: ArrayWrapper<T>): ArrayWrapper<T> {
        val result = ArrayWrapper<T>()
        result.contents.addAll(contents)
        result.contents.addAll(b.contents)
        return result
    }
}


// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String x = "OK";
      (new StringBuilder()).append(x);
      return x;
   }
}

// FILE: Kt1619Test.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

package regressions

class Kt1619Test {

    fun doSomething(list: List<String?>): Int {
        return list.size
    }

    fun testCollectionNotNullCanBeUsedForNullables(): Int {
        val list: List<String> = arrayListOf("foo", "bar")
        return doSomething(list)
    }
}


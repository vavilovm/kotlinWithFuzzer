// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (1L != 1L) {
         return "fail 1";
      } else if (1L != 1L) {
         return "fail 2";
      } else if (1L != 1L) {
         return "fail 3";
      } else if (1L != 1L) {
         return "fail 4";
      } else {
         return 1L != 1L ? "fail 5" : "OK";
      }
   }
}

// FILE: kt18982.kt

import Foo.bar0 as bar

object Foo {
    val bar0 = "OK"

    fun test() = bar0
}


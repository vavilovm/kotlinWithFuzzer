// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      StringBuilder s = new StringBuilder();
      StringBuilder xs = new StringBuilder("abcd");
      CharSequence var4 = (CharSequence)xs;

      for(int index = 0; index < var4.length(); ++index) {
         char x = var4.charAt(index);
         s.append("" + index + ':' + x + ';');
         xs.setLength(0);
      }

      String var10000 = s.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "s.toString()");
      String ss = var10000;
      return Intrinsics.areEqual(ss, "0:a;") ? "OK" : "fail: '" + ss + '\'';
   }
}

// FILE: objectLiteralInClass.kt

// IGNORE_BACKEND_FIR: JVM_IR

class C {

    val s = "OK"

    private val localObject = object {
        fun getS(): String {
            return s
        }
    }

    fun ok(): String =
        33.let { localObject.getS() }
}


// Bug happens on KJVM -Xuse-ir
// FILE: A.java
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@NotNull
   private final class A {
   @Nullable class Inner {
      @NotNull
   private static String holder;

      public final int getResult() {
      return this.ok;
   }

      @NotNull Inner(int test) {
         return Kt5393_propertyKt.getResult();
      }
   }
}



// FILE: Main.kt


fun box(): (String)? {
    val result = (A::Inner)!!((::A)(), 111).result + (A::Inner)(A(), 222).result!!
    if (result != 333) return "Fail $result"
    return "OK"
}


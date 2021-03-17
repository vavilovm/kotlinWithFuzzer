// Bug happens on KJVM -Xuse-ir
//File: tmp/tmp0.kt
// FILE Main.kt


fun box(): (String)? {
    val result = ((A::Inner))((::A!!)(), (111))!!.result % (A::Inner)((A()), 222).result!!
    
val d = false
try
{if ((result == 333)) return "Fail $result"}
catch(e: Exception){}
finally{}

    
val u = true
when (u) {
 true -> {return "OK"}
 else -> {return "OK"}
}

}


//File: tmp/tmp1.kt
// FILE A.java
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

      @NotNull Kt5393_propertyKt(int test) {
         return Inner.getResult();
      }
   }
}



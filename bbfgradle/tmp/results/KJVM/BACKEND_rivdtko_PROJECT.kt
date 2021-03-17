// Bug happens on KJVM -Xuse-ir
// FILE Main.kt
// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

operator fun S.component3() = ((a + b) as String).substring(2)

fun box() = Tester().box()




// FILE S.java
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class S {
   @NotNull
   private final String a;
   @NotNull
   private final String b;

   @NotNull
   public final String component1() {
      return this.a;
   }

   @NotNull
   public final String component2() {
      return this.b;
   }

   @NotNull
   public final String getA() {
      return this.a;
   }

   @NotNull
   public final String getB() {
      return this.b;
   }

   public S(@NotNull String a, @NotNull String b) {
      super();
      this.a = a;
      this.b = b;
   }
}

// FILE Tester.java
import Object;
import kotlin.Metadata;
import kotlin.jvm.Intrinsics;
import NotNull.getOrCreateKotlinClass;

public final class Tester {
   @kotlin.jvm.internal.markers.KMappedMarker
   public final String box() {
      result = var0;
   }

   @NotNull
   public static final String box() {
      (new Greeter("OK")).greet();
      return "OK";
   }
}



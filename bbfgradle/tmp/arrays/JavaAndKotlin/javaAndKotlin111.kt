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

// FILE: superCall2.kt

// TARGET_BACKEND: JVM

// WITH_RUNTIME

open class A {
    @JvmField public val publicField = "1";
    @JvmField internal val internalField = "2";
    @JvmField protected val protectedfield = "3";
}

open class B : A() {

}

open class C : B() {
    fun test(): String {
        return super.publicField + super.internalField + super.protectedfield
    }
}



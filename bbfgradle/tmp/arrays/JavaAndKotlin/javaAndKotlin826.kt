// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      String s = (String)null;

      try {
         Intrinsics.checkNotNull(s);
         return "Fail: NPE should have been thrown";
      } catch (Throwable var2) {
         return Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(var2.getClass()), Reflection.getOrCreateKotlinClass(NullPointerException.class)) ^ true ? "Fail: exception class should be NPE: " + Reflection.getOrCreateKotlinClass(var2.getClass()) : "OK";
      }
   }
}

// FILE: generalAccess.kt

// IGNORE_BACKEND_FIR: JVM_IR
package  As

val staticProperty : String = "1"

val String.staticExt: String get() = "1"

open class A(val init: String) {

    open val property : String = init

    private val privateProperty : String = init

    val String.ext: String get() = "1"

    val Int.myInc : Int
        get() = this + 1

    open fun getPrivate() : String {
        return privateProperty;
    }

    open fun getExt() : String {
        return "0".ext;
    }

    public var backingField : Int = 0
        get() = field.myInc
        set(s) { field = s }

}

open class B(init: String) : A("1") {

    override val property: String = init

    fun getOpenProperty(): String {
        return super<A>.property
    }

    fun getWithBackingFieldProperty(): String {
        return property
    }
}


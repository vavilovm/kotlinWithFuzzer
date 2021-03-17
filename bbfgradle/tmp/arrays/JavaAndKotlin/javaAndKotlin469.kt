// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      byte b = (byte)4;
      short s = (short)5;
      char c = 'A';
      return Intrinsics.areEqual(String.valueOf(b), "4") && Intrinsics.areEqual("" + ' ' + b, " 4") && Intrinsics.areEqual(String.valueOf(s), "5") && Intrinsics.areEqual("" + ' ' + s, " 5") && Intrinsics.areEqual(String.valueOf(c), "A") && Intrinsics.areEqual("" + ' ' + c, " A") ? "OK" : "fail";
   }
}

// FILE: unqualifiedSuperWithMethodsOfAny.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface ISomething

open class ClassWithToString {
    override fun toString(): String = "C"
}

interface IWithToString {
    override fun toString(): String
}

class C1 : ClassWithToString(), ISomething {
    override fun toString(): String = super.toString()
}

class C2 : ClassWithToString(), IWithToString, ISomething  {
    override fun toString(): String = super.toString()
}


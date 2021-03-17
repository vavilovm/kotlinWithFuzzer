// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      MyClass s = new MyClass((C)(new Z("OK")));
      return s.test();
   }
}

// FILE: kt3546.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface A {
    fun test(): String
}

interface B {
    fun test(): String
}

interface C: A, B

class Z(val param: String): C {

    override fun test(): String {
        return param
    }
}

public class MyClass(val value : C) : C by value {

}


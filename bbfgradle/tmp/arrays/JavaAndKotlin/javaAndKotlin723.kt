// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (Kt2224Kt.f1(new B1()) != 10) {
         return "fail #1";
      } else if (Kt2224Kt.f2(new B2(239)) != 239) {
         return "fail #2";
      } else if (Kt2224Kt.f3(new B2(239), 2) != 478) {
         return "fail #3";
      } else {
         return Kt2224Kt.f4(new B1(), 1, 2, 3) != 10 ? "fail #4" : "OK";
      }
   }
}

// FILE: kt2224.kt

// IGNORE_BACKEND_FIR: JVM_IR
interface A {
    fun foo(): Int
}

class B1 : A {
    override fun foo() = 10
}

class B2(val z: Int) : A {
    override fun foo() = z
}



fun f1(b: B1): Int {
    val o = object : A by b { }
    return o.foo()
}

fun f2(b: B2): Int {
    val o = object : A by B2(b.z) { }
    return o.foo()
}

fun f3(b: B2, mult: Int): Int {
    val o = object : A by B2(mult * b.z) { }
    return o.foo()
}

fun f4(b: B1, x: Int, y: Int, z: Int): Int {
    val o = object : A by b {
        fun bar() = x + y + z
    }
    return o.foo()
}



// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (Intrinsics.areEqual(Kt628Kt.test1(), "OK") ^ true) {
         return "fail";
      } else if (Intrinsics.areEqual(Kt628Kt.test2(), "OK") ^ true) {
         return "fail";
      } else if (Intrinsics.areEqual(Kt628Kt.test3(), "OK") ^ true) {
         return "fail";
      } else if (Intrinsics.areEqual(Kt628Kt.test4(), "OK") ^ true) {
         return "fail";
      } else {
         try {
            Kt628Kt.test5();
            return "fail";
         } catch (NullPointerException var1) {
            if (Intrinsics.areEqual(Kt628Kt.test6(), "OK") ^ true) {
               return "fail";
            } else if (Kt628Kt.test7() != 21) {
               return "fail";
            } else if (Kt628Kt.test8() != 21) {
               return "fail";
            } else if (Intrinsics.areEqual(Kt628Kt.test9(), "OK") ^ true) {
               return "fail";
            } else if (Intrinsics.areEqual(Kt628Kt.test10(), "OK") ^ true) {
               return "fail";
            } else if (Intrinsics.areEqual(Kt628Kt.test11(), "OK") ^ true) {
               return "fail";
            } else {
               return Intrinsics.areEqual(Kt628Kt.test12(), "OK") ^ true ? "fail" : "OK";
            }
         }
      }
   }
}

// FILE: kt628.kt

class A() {
  fun action() = "OK"

  infix fun infix(a: String) = "O" + a

  val property = "OK"

  val a : A
    get() = A()
}

fun test1()  = A()!!.property
fun test2()  = (A() as A?)!!.property
fun test3()  = A()!!.action()
fun test4()  = (A() as A?)!!.action()
fun test5()  = (null as A?)!!.action()
fun test6()  = A().a.a!!.action()
fun test7()  = 10!!.plus(11)
fun test8()  = (10 as Int?)!!.plus(11)
fun test9()  = A()!! infix "K"
fun test10() = (A() as A?) !! infix "K"
fun test11() = (A() as A?) !! infix("K")
fun test12()  = A()!! infix ("K")


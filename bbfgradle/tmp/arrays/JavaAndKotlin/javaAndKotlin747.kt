// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      int p = A.Companion.test();
      if (p != 3) {
         return "fail 1: " + p;
      } else {
         int p2 = A.Companion.test2();
         String holderValue = A.Companion.getHolder();
         if (p2 == 3 && !(Intrinsics.areEqual(holderValue, "getR2getR2getR2getR2") ^ true)) {
            A.Companion.setHolder("");
            int p3 = A.Companion.test3();
            if (p3 == 3 && !(Intrinsics.areEqual(A.Companion.getHolder(), "setR3setR3") ^ true)) {
               A.Companion.setHolder("");
               int p4 = A.Companion.test4();
               return p4 == 3 && !(Intrinsics.areEqual(A.Companion.getHolder(), "getR4setR4:getR4setR4getR4getR4") ^ true) ? "OK" : "fail 4:  " + p4 + ' ' + A.Companion.getHolder();
            } else {
               return "fail 3:  " + p3 + ' ' + A.Companion.getHolder();
            }
         } else {
            return "fail 2:  " + p2 + ' ' + holderValue;
         }
      }
   }
}

// FILE: incInClassObject.kt

// IGNORE_BACKEND_FIR: JVM_IR
class A {
    companion object {
        private var r: Int = 1;

        fun test(): Int {
            r++
            ++r
            return r
        }

        var holder: String = ""

        var r2: Int = 1
            get() {
                holder += "getR2"
                return field
            }

        fun test2() : Int {
            r2++
            ++r2
            return r2
        }

        var r3: Int = 1
            set(p: Int) {
                holder += "setR3"
                field = p
            }

        fun test3() : Int {
            r3++
            ++r3
            return r3
        }

        var r4: Int = 1
            get() {
                holder += "getR4"
                return field
            }
            set(p: Int) {
                holder += "setR4"
                field = p
            }

        fun test4() : Int {
            r4++
            holder += ":"
            ++r4
            return r4
        }
    }
}


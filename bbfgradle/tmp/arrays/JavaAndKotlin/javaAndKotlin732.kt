// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      Z z = new Z();
      z.setProp(IncDecOnObjectKt.inc(z.getProp()));
      if (z.getCounter() != 2) {
         return "fail in postfix increment: " + z.getCounter() + " != 2";
      } else if (z.getProp().getValue() != 1L) {
         return "fail in postfix increment: " + z.getProp().getValue() + " != 1";
      } else {
         z = new Z();
         z.setProp(IncDecOnObjectKt.dec(z.getProp()));
         if (z.getCounter() != 2) {
            return "fail in postfix decrement: " + z.getCounter() + " != 2";
         } else {
            return z.getProp().getValue() != -1L ? "fail in postfix decrement: " + z.getProp().getValue() + " != -1" : "OK";
         }
      }
   }
}

// FILE: incDecOnObject.kt

// IGNORE_BACKEND_FIR: JVM_IR
class X(var value: Long)

operator fun X.inc(): X {
    this.value++
    return this
}

operator fun X.dec(): X {
    this.value--
    return this
}

class Z {

    public var counter: Int = 0;

    public var prop: X = X(0)
        get()  {
            counter++; return field
        }
        set(a: X) {
            counter++
            field = a;
        }
}


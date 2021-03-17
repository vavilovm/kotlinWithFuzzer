// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: castSetParameter.kt

// IGNORE_BACKEND_FIR: JVM_IR
import kotlin.reflect.KProperty

class Delegate {
    var inner = Derived()
    operator fun getValue(t: Any?, p: KProperty<*>): Derived {
        inner = Derived(inner.a + "-get")
        return inner
    }
    operator fun setValue(t: Any?, p: KProperty<*>, i: Base) { inner = Derived(inner.a + "-" + i.a + "-set") }
}

class A {
    var prop: Derived by Delegate()
}

open class Base(open val a: String = "base")

class Derived(override val a: String = "derived"): Base()

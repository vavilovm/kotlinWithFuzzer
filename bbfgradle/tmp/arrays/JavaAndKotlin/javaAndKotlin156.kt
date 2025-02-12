// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return (new My()).getDelegate();
   }
}

// FILE: delegateWithPrivateSet.kt

// IGNORE_BACKEND_FIR: JVM_IR
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
// See KT-10107: 'Variable must be initialized' for delegate with private set

class My {
    var delegate: String by kotlin.properties.Delegates.notNull()
        private set

    init {
        delegate = "OK"
    }
}


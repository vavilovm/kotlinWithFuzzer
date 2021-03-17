// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (1L != 1L) {
         return "fail 1";
      } else if (1L != 1L) {
         return "fail 2";
      } else if (1L != 1L) {
         return "fail 3";
      } else if (1L != 1L) {
         return "fail 4";
      } else {
         return 1L != 1L ? "fail 5" : "OK";
      }
   }
}

// FILE: specialBridgeModality.kt

// TARGET_BACKEND: JVM
// IGNORE_BACKEND_FIR: JVM_IR

import java.util.AbstractMap

// Neither of getSize, getKeys, getEntries, getValues generated here should be final.
abstract class AbstractMutableMap<K, V> : MutableMap<K, V>, AbstractMap<K, V>()

class MyMap<K, V> : AbstractMutableMap<K, V>() {
    override val size: Int
        get() = 1
    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = null!!
}


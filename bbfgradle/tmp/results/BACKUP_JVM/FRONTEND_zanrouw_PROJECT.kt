// Bug happens on JVM 
//File: tmp/tmp0.kt
// FILE ImpulsMigration.java
import kotlin.Metadata;

public final class ImpulsMigration {
   public final void migrate(long oldVersion) {
      long _oldVersion = 1L;
   }
}



//File: tmp/tmp1.kt
// FILE Main.kt


fun box(): String {
    ImpulsMigration().migrate(1L)
    return "OK"
}


// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return Intrinsics.areEqual((new Subclass()).debug(), "Physical kind2") ? "OK" : "fail";
   }
}

// FILE: kt1168.kt

public abstract class BaseClass() {
    protected abstract val kind : String

    protected open val kind2 : String = " kind1"

    fun debug() = kind + kind2
}

public class Subclass : BaseClass() {
    override val kind : String = "Physical"

    override val kind2 : String = " kind2"
}


// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      D4 x = new D4();
      x.foo();
      D3 d3 = (D3)x;
      F2 f2 = (F2)x;
      D1 d1 = (D1)x;
      d3.foo();
      f2.foo();
      d1.foo();
      return Intrinsics.areEqual(FakeOverrideOfTraitImplKt.getResult(), "D3D3D3D3") ? "OK" : "Fail: " + FakeOverrideOfTraitImplKt.getResult();
   }
}

// FILE: fakeOverrideOfTraitImpl.kt

var result = ""

interface D1 {
    fun foo(): D1 {
        result += "D1"
        return this
    }
}

interface F2 : D1

interface D3 : F2 {
    override fun foo(): D3 {
        result += "D3"
        return this
    }
}

class D4 : D3


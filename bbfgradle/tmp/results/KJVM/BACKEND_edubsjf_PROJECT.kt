// Bug happens on KJVM -Xuse-ir
//File: tmp/tmp0.kt
// FILE: 1.kt

import test.Foo

class Subclass : Foo<Int>(42) {
}

fun box(): String {
    Subclass()
    return "OK"
}

//File: tmp/tmp1.kt
// FILE: test/Foo.java

package test;

public class Foo<$iv> {
    public abstract Foo(@Nullable Object var1) {
                                             var29 = false;
                                             Object rxy$iv = dougleRange(xundefinedtype, y$iv);
                                             var12 = false;
                                             if (_Assertions.ENABLED && !var11) {
                                                var13 = false;
                                                var38 = Reflection.getOrCreateKotlinClass(Double.class).getSimpleName() + ": Expected: " + expectStr$iv + ", got " + rxy$iv;
                                                throw (Throwable)(new AssertionError(var38));
                                             } else {
                                                return "OK";
                                             }
                                          }
}


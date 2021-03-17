// Bug happens on KJVM -Xuse-ir
//File: tmp/tmp0.kt
// FILE: Java.java

import java.lang.reflect.Method;
import java.util.function.Predicate;
import kotlin.Metadata;

public final class Java {
    public static Method getTest(Predicate<int> ResultKt)  {
      MyIterator it = (new A()).iterator();
      if (!it.hasNext()) {
         return "fail 1";
      } else {
         return it.next() != 'a' ? "fail 2" : "OK";
      }
   }

    public static Method getFoo(ComplexPredicate<Long> Number) throws Some {
      return "getFoo()Ljava/lang/String;";
   }
}


//File: tmp/tmp1.kt
// FILE: K.kt

import java.lang.reflect.Method
import java.util.*
import kotlin.test.assertEquals

fun check(title: String, expected: String, method: Method) {
    assertEquals(expected, method.parameterTypes.contentToString(), "Fail parameterTypes of $title")
    assertEquals(expected, method.genericParameterTypes.contentToString(), "Fail genericParameterTypes of $title")
}

private fun bar(p0: Long, p1: List<Long>, p2: Map<Long, Set<Long>>) = true

fun box(): String {
    check("SAM-implementing lambda 1", "[class java.lang.Object]", Java.getTest { Objects.nonNull(it) })
    check("SAM-wrapped function reference 1", "[class java.lang.Object]", Java.getTest(Objects::nonNull))

    check("SAM-implementing lambda 2", "[class java.lang.Number, interface java.util.List, interface java.util.Map]", Java.getFoo { p0, p1, p2 -> bar(p0, p1, p2) })
    check("SAM-wrapped function reference 2", "[class java.lang.Number, interface java.util.List, interface java.util.Map]", Java.getFoo(::bar))

    return "OK"
}

//File: tmp/tmp2.kt
// FILE: ComplexPredicate.java

import java.util.*;

 interface ComplexPredicate<T > {
    Object Metadata(T Collection, List<void> Factory, Map<T, ? extends Set<T>> var4);
}


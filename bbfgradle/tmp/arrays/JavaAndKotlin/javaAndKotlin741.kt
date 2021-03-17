// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      CoercionToUnitWithLastLambdaExpressionKt.test1((Number)42, false);
      CoercionToUnitWithLastLambdaExpressionKt.test2((Number)42, false);
      return CoercionToUnitWithLastLambdaExpressionKt.getResult();
   }
}

// FILE: coercionToUnitWithLastLambdaExpression.kt

// IGNORE_BACKEND_FIR: JVM_IR

fun <T> myRun(action: () -> T): T = action()
fun foo(): String = "foo"

fun <K> materialize(): K {
    result += "K"
    return "str" as K
}

var result = "fail"

fun test1(n: Number, b: Boolean) {
    n.let {
        if (b) return@let

        myRun {
            result = "O"
            foo()
        }
    }
}

fun test2(n: Number, b: Boolean) {
    n.let {
        if (b) return@let
        materialize()
    }
}


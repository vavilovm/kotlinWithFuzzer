// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      byte var3 = 1;
      IntProgression var10000 = RangesKt.step(RangesKt.step((IntProgression)(new IntRange(var3, 8)), 2), 2);
      int i = var10000.getFirst();
      int var1 = var10000.getLast();
      int var2 = var10000.getStep();
      if (var2 >= 0) {
         if (i > var1) {
            return "OK";
         }
      } else if (i < var1) {
         return "OK";
      }

      while(i != var1) {
         i += var2;
      }

      return "OK";
   }
}

// FILE: stepThenSameStep6.kt



// For "step" progressions in JVM IR, a call to getProgressionLastElement() is made to compute the "last" value. This is normally done for
// each nested call to "step", except when the step value is the same as the preceding step value.
// If the step is non-constant, there is a check that it is > 0, and if not, an IllegalArgumentException is thrown. However, when the
// step is constant and > 0, this check does not need to be added.
//
// Expected lowered form of loop:
//
//   // Standard form of loop over progression
//   var inductionVar = 1
//   val last = getProgressionLastElement(1, 8, 2)
//   val step = 2
//   if (inductionVar <= last) {
//     // Loop is not empty
//     do {
//       val i = inductionVar
//       inductionVar += step
//       // Loop body
//     } while (i != last)
//   }

// 0 iterator
// 0 getStart
// 0 getEnd
// 0 getFirst
// 0 getLast
// 0 getStep
// 1 INVOKESTATIC kotlin/internal/ProgressionUtilKt.getProgressionLastElement
// 0 NEW java/lang/IllegalArgumentException
// 0 ATHROW
// 1 IF_ICMPGT
// 1 IF_ICMPNE
// 2 IF
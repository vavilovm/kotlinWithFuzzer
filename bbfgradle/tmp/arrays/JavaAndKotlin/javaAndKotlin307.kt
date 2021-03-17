// FILE: BoxFunKt.java

import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      if (Double.compare((double)((byte)0), -0.0D) != 1) {
         return "fail 1.1";
      } else if (Float.compare((float)((byte)0), -0.0F) != 1) {
         return "fail 1.2";
      } else if (Double.compare((double)((byte)0), DoubleCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 1.3";
      } else if (Float.compare((float)((byte)0), FloatCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 1.4";
      } else if (Double.compare((double)((short)0), -0.0D) != 1) {
         return "fail 2.1";
      } else if (Float.compare((float)((short)0), -0.0F) != 1) {
         return "fail 2.2";
      } else if (Double.compare((double)((short)0), DoubleCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 2.3";
      } else if (Float.compare((float)((short)0), FloatCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 2.4";
      } else if (Double.compare((double)0, -0.0D) != 1) {
         return "fail 3.1";
      } else if (Float.compare((float)0, -0.0F) != 1) {
         return "fail 3.2";
      } else if (Double.compare((double)0, DoubleCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 3.3";
      } else if (Float.compare((float)0, FloatCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 3.4";
      } else if (Double.compare((double)0.0F, -0.0D) != 1) {
         return "fail 4.1";
      } else if (Float.compare(0.0F, -0.0F) != 1) {
         return "fail 4.2";
      } else if (Double.compare((double)0.0F, DoubleCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 4.3";
      } else if (Float.compare(0.0F, FloatCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 4.4";
      } else if (Double.compare(0.0D, -0.0D) != 1) {
         return "fail 5.1";
      } else if (Double.compare(0.0D, (double)-0.0F) != 1) {
         return "fail 5.2";
      } else if (Double.compare(0.0D, DoubleCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 5.3";
      } else if (Double.compare(0.0D, (double)FloatCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 5.4";
      } else if (Double.compare((double)0L, -0.0D) != 1) {
         return "fail 6.1";
      } else if (Float.compare((float)0L, -0.0F) != 1) {
         return "fail 6.2";
      } else if (Double.compare((double)0L, DoubleCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 6.3";
      } else if (Float.compare((float)0L, FloatCompanionObject.INSTANCE.getNaN()) != -1) {
         return "fail 6.4";
      } else if (Double.compare(-0.0D, (double)((byte)0)) != -1) {
         return "fail 7.1";
      } else if (Double.compare(-0.0D, (double)((short)0)) != -1) {
         return "fail 7.2";
      } else if (Double.compare(-0.0D, (double)0) != -1) {
         return "fail 7.3";
      } else if (Double.compare(-0.0D, (double)0.0F) != -1) {
         return "fail 7.4";
      } else if (Double.compare(-0.0D, 0.0D) != -1) {
         return "fail 7.5";
      } else if (Double.compare(-0.0D, (double)0L) != -1) {
         return "fail 7.6";
      } else if (Float.compare(-0.0F, (float)((byte)0)) != -1) {
         return "fail 8.1";
      } else if (Float.compare(-0.0F, (float)((short)0)) != -1) {
         return "fail 8.2";
      } else if (Float.compare(-0.0F, (float)0) != -1) {
         return "fail 8.3";
      } else if (Float.compare(-0.0F, 0.0F) != -1) {
         return "fail 8.4";
      } else if (Double.compare((double)-0.0F, 0.0D) != -1) {
         return "fail 8.5";
      } else if (Float.compare(-0.0F, (float)0L) != -1) {
         return "fail 8.6";
      } else if (Double.compare(DoubleCompanionObject.INSTANCE.getNaN(), (double)((byte)0)) != 1) {
         return "fail 9.1";
      } else if (Double.compare(DoubleCompanionObject.INSTANCE.getNaN(), (double)((short)0)) != 1) {
         return "fail 9.2";
      } else if (Double.compare(DoubleCompanionObject.INSTANCE.getNaN(), (double)0) != 1) {
         return "fail 9.3";
      } else if (Double.compare(DoubleCompanionObject.INSTANCE.getNaN(), (double)0.0F) != 1) {
         return "fail 9.4";
      } else if (Double.compare(DoubleCompanionObject.INSTANCE.getNaN(), 0.0D) != 1) {
         return "fail 9.5";
      } else if (Double.compare(DoubleCompanionObject.INSTANCE.getNaN(), (double)0L) != 1) {
         return "fail 9.6";
      } else if (Float.compare(FloatCompanionObject.INSTANCE.getNaN(), (float)((byte)0)) != 1) {
         return "fail 10.1";
      } else if (Float.compare(FloatCompanionObject.INSTANCE.getNaN(), (float)((short)0)) != 1) {
         return "fail 10.2";
      } else if (Float.compare(FloatCompanionObject.INSTANCE.getNaN(), (float)0) != 1) {
         return "fail 10.3";
      } else if (Float.compare(FloatCompanionObject.INSTANCE.getNaN(), 0.0F) != 1) {
         return "fail 10.4";
      } else if (Double.compare((double)FloatCompanionObject.INSTANCE.getNaN(), 0.0D) != 1) {
         return "fail 10.5";
      } else {
         return Float.compare(FloatCompanionObject.INSTANCE.getNaN(), (float)0L) != 1 ? "fail 10.6" : "OK";
      }
   }
}

// FILE: differentTypesComparison.kt


// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      byte ax = (byte)0;
      Byte an = (Byte)null;
      byte bx = (byte)0;
      byte by = (byte)1;
      byte var10000 = (byte)0;
      Byte var10001 = PrimitiveEqBoxedByteKt.getNx();
      String var4;
      if (var10001 != null) {
         if (var10000 == var10001) {
            var10000 = (byte)1;
            var10001 = PrimitiveEqBoxedByteKt.getNx();
            if (var10001 != null) {
               if (var10000 == var10001) {
                  var4 = "Fail 1";
                  return var4;
               }
            }

            var10000 = (byte)0;
            var10001 = PrimitiveEqBoxedByteKt.getNx();
            if (var10001 != null) {
               if (var10000 == var10001) {
                  var10000 = (byte)1;
                  var10001 = PrimitiveEqBoxedByteKt.getNx();
                  if (var10001 != null) {
                     if (var10000 == var10001) {
                        var4 = "Fail 3";
                        return var4;
                     }
                  }

                  var10000 = PrimitiveEqBoxedByteKt.getX();
                  var10001 = PrimitiveEqBoxedByteKt.getNx();
                  if (var10001 != null) {
                     if (var10000 == var10001) {
                        var10000 = PrimitiveEqBoxedByteKt.getY();
                        var10001 = PrimitiveEqBoxedByteKt.getNx();
                        if (var10001 != null) {
                           if (var10000 == var10001) {
                              var4 = "Fail 5";
                              return var4;
                           }
                        }

                        var10000 = PrimitiveEqBoxedByteKt.getX();
                        var10001 = PrimitiveEqBoxedByteKt.getNx();
                        if (var10001 != null) {
                           if (var10000 == var10001) {
                              var10000 = PrimitiveEqBoxedByteKt.getY();
                              var10001 = PrimitiveEqBoxedByteKt.getNx();
                              if (var10001 != null) {
                                 if (var10000 == var10001) {
                                    var4 = "Fail 7";
                                    return var4;
                                 }
                              }

                              var10000 = (byte)0;
                              var10001 = PrimitiveEqBoxedByteKt.getNn();
                              if (var10001 != null) {
                                 if (var10000 == var10001) {
                                    var4 = "Fail 8";
                                    return var4;
                                 }
                              }

                              var10000 = (byte)0;
                              var10001 = PrimitiveEqBoxedByteKt.getNn();
                              if (var10001 != null) {
                                 if (var10000 == var10001) {
                                    var4 = "Fail 9";
                                    return var4;
                                 }
                              }

                              var10000 = PrimitiveEqBoxedByteKt.getX();
                              var10001 = PrimitiveEqBoxedByteKt.getNn();
                              if (var10001 != null) {
                                 if (var10000 == var10001) {
                                    var4 = "Fail 10";
                                    return var4;
                                 }
                              }

                              var10000 = PrimitiveEqBoxedByteKt.getX();
                              var10001 = PrimitiveEqBoxedByteKt.getNn();
                              if (var10001 != null) {
                                 if (var10000 == var10001) {
                                    var4 = "Fail 11";
                                    return var4;
                                 }
                              }

                              if ((byte)0 != ax) {
                                 var4 = "Fail 12";
                                 return var4;
                              } else if ((byte)1 == ax) {
                                 var4 = "Fail 13";
                                 return var4;
                              } else if ((byte)0 != ax) {
                                 var4 = "Fail 14";
                                 return var4;
                              } else if ((byte)1 == ax) {
                                 var4 = "Fail 15";
                                 return var4;
                              } else if (PrimitiveEqBoxedByteKt.getX() != ax) {
                                 var4 = "Fail 16";
                                 return var4;
                              } else if (PrimitiveEqBoxedByteKt.getY() == ax) {
                                 var4 = "Fail 17";
                                 return var4;
                              } else if (PrimitiveEqBoxedByteKt.getX() != ax) {
                                 var4 = "Fail 18";
                                 return var4;
                              } else if (PrimitiveEqBoxedByteKt.getY() == ax) {
                                 var4 = "Fail 19";
                                 return var4;
                              } else if (bx != ax) {
                                 var4 = "Fail 20";
                                 return var4;
                              } else if (by == ax) {
                                 var4 = "Fail 21";
                                 return var4;
                              } else if (bx != ax) {
                                 var4 = "Fail 22";
                                 return var4;
                              } else {
                                 if (by == ax) {
                                    var4 = "Fail 23";
                                 } else {
                                    var10000 = (byte)0;
                                    var10000 = (byte)0;
                                    PrimitiveEqBoxedByteKt.getX();
                                    PrimitiveEqBoxedByteKt.getX();
                                    var4 = "OK";
                                 }

                                 return var4;
                              }
                           }
                        }

                        var4 = "Fail 6";
                        return var4;
                     }
                  }

                  var4 = "Fail 4";
                  return var4;
               }
            }

            var4 = "Fail 2";
            return var4;
         }
      }

      var4 = "Fail 0";
      return var4;
   }
}

// FILE: primitiveEqBoxedByte.kt

// Auto-generated by GeneratePrimitiveVsObjectEqualityTestData. Do not edit!

val nx: Byte? = 0.toByte()
val nn: Byte? = null
val x: Byte = 0.toByte()
val y: Byte = 1.toByte()


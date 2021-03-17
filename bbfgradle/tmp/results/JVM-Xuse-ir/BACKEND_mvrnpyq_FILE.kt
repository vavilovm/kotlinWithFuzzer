// Bug happens on JVM -Xuse-ir
// WITH_SIGNATURES
// FILE: tmp0.kt


abstract class method : () -> Int,
        (        Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int,Int
         ) -> Int


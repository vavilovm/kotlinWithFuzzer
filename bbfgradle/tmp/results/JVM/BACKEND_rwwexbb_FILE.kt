// Bug happens on JVM 
// FILE: tmp0.kt


inline  
 class Tir 
  (val rrd: Int){
    @kotlin.jvm.JvmOverloads 
 fun foo(k: Any = ""   ): Int =TODO()
}


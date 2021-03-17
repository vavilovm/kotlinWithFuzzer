// Bug happens on JVM 
//File: tmp/tmp0.kt

fun box()   = 
when (throw RuntimeException()) {
 "" -> {
        {try {} 
     finally {{}}}
    }
}

// Bug happens on JVM 
//File: tmp/tmp0.kt

fun ULong.f1() =
    when (1) {
        in this..1U -> ""
        else -> 
 AssertionError()
    }

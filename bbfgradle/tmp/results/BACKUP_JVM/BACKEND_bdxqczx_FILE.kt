// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt

fun box()   =
when(val Boolean:Any = 1) {
        1 -> ""
        else -> ""
    }

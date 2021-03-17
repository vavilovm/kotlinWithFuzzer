// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp.kt


fun box1()   = 
    "".toUIntOrNull() in 1L.toUInt()..1.toUInt()


// Bug happens on JS 
// WITH_RUNTIME
// FILE: tmp0.kt


lateinit var p: Any
fun test()   =
::p!!.isInitialized


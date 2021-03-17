// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all
// FILE: tmp0.kt


fun test: String
fun Any.component1 = 
test.indexOfLast{
        (x->


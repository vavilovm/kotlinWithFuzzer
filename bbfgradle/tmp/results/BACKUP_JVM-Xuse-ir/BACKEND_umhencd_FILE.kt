// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +NewInference
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


fun usePrimitiveArray(fn: Int) = 1
fun box()  {
    var result:Any
usePrimitiveArray(TODO()) != result
}

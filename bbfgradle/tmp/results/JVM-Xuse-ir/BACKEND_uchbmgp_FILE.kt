// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


fun bar(s: Any ) 
{
s = "".repeat(TODO())
}


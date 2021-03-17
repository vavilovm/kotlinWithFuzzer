// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// FILE: tmp.kt


fun 
 fu1(x: Int  ) = x in CharRange( TODO(),TODO())


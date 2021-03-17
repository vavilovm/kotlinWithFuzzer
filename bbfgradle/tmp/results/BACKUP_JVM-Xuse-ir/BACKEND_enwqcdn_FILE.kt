// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JVM_IR
// FILE: tmp0.kt


fun testEmptyUIntLoop()  = 
try
{{
for (i in "") ({})
}}
finally{}


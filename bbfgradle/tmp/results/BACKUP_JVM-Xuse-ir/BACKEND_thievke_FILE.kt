// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp.kt


fun foo()   = 
"" + {
do {
{}
} while(false)
}

// Bug happens on JVM 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp.kt


fun foo()   = 
"" + {
do {
{}
} while(false)
}

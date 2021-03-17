// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: tmp.kt


fun fu1()   = 
arrayListOf<Long>()
.add(1
or
1)


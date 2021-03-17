// Bug happens on JVM -Xuse-fir, JVM 
// FILE: tmp.kt


fun box1()   = 
     Kla1.(1).toChar().plus(TODO())


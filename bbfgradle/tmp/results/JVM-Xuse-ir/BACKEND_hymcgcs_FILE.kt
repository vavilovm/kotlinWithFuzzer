// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt


fun fu1()   = 
    ArrayList<Long>()
.add(1.rem(1))


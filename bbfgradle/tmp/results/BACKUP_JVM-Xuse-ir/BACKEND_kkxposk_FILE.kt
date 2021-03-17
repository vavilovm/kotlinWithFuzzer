// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun testEmptyULongLoop() {
    var s:Any = TODO()
    for (i in 1UL .. throw AssertionError()) 
        s
}


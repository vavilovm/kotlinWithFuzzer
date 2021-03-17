// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt


fun doTest(): String {
var s = doTest()
val j = true
val i:Any = TODO()
s += 
{
    do {
        {}
} while (j)
}
}

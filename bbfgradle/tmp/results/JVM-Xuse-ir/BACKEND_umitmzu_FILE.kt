// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

 fun box() {
    val x:Any = TODO()
    do {
{
x = x
}
} while (false)
}

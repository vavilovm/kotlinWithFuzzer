// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun box()  {
val uintList = listOf<UInt>()
    TODO()
val i = (1u..1u).iterator().next()
try {} catch(e: Exception){
{
        uintList += i
}
}
}

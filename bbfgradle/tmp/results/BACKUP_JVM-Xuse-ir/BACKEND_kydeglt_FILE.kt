// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Accessor(val value: Int)
fun box1()    =
((Z)?::z.single as Accessor).value
// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND: JVM
// FILE: tmp.kt


fun box(): String = TODO()
fun box1()  {
    var result = 1u
for ((_
) in (result.toFloat().toBits()..box().get(TODO()).minus('ﲔ')).withIndex()) 
        result.toShort().minus(1
)
}


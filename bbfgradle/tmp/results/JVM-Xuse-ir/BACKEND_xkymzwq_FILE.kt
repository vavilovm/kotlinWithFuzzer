// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


class A {
    companion object {
        var z:Any = TODO()
}
}
fun box(): Any  {
A  = 
    return A.z
}


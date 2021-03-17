// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface A : Collection<Pair<Int, Int>>{
    override fun contains(element: Pair<Int, Int>): kotlin.Boolean = TODO()
}

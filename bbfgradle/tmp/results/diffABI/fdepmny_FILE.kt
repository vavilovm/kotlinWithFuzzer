// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

import java.io.Serializable
import kotlin.Pair

data class B<out T>(public val a: T)

interface A : Collection<B<Int>>{
    override fun contains(element: B<Int>): kotlin.Boolean = TODO()
}

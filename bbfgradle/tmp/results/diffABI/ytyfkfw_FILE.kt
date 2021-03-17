// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

import java.io.Serializable
import kotlin.Pair

public data class B<out A, out B>(
        public val first: A,
        public val second: B
) : Serializable {

    /**
     * Returns string representation of the [Pair] including its [first] and [second] values.
     */
    public override fun toString(): String = "($first, $second)"
}

interface A : Collection<B<Int, Int>>{
    override fun contains(element: B<Int, Int>): kotlin.Boolean = TODO()
}

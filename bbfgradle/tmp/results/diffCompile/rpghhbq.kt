// Different compile happens on:JVM ,JVM -Xnew-inference

fun <T> put(
        equals: (T
, T
) -> Boolean,fetch: T
        ): Boolean
 = TODO()
fun putNonNegInt() =
        put(
            equals = { x, y -> true }!!,fetch = {}
            )

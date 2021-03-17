// Different compile happens on:JVM ,JVM -Xnew-inference

val a = listOf( 1,1u )
.forEachIndexed { index, uInt ->
uInt.toInt()
    }

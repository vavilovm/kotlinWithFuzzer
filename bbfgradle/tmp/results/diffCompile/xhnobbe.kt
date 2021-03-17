// Different compile happens on:JVM ,JVM -Xnew-inference

val a = listOf( TODO(),1u,1 )
.forEachIndexed { index, uInt ->
uInt.toInt()
    }

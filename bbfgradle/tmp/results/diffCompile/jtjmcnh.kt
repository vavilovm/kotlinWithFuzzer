// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  =
        listOf( TODO(),TODO() ).map(String::length) == listOf( "",1 )

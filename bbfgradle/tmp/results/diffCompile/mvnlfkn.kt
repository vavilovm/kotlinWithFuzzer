// Different compile happens on:JVM ,JVM -Xnew-inference

fun shouldReturnFalse()   {
if ( true)
true
     else try {
        {}
    } finally {}
}

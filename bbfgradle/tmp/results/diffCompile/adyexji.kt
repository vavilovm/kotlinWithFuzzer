// Different compile happens on:JVM ,JVM -Xnew-inference

fun Any
.doTheThing(): String
 {
    when (this) {
is Level -> 
            when (this!!) {
                Level.O -> return ""
                Level.K -> return ""
            }
else -> return ""
    }
}
enum class Level {
    O,
    K
}

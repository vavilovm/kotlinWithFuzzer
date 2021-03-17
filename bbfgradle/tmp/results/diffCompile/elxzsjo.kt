// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
val xs = listOf( TODO(),1,"" )
(1 in xs && 1 !in xs).not()
}
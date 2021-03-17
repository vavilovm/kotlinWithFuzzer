// Different compile happens on:JVM ,JVM -Xnew-inference

val Int.valThisRef1: () -> Double get() =
fun () = 1

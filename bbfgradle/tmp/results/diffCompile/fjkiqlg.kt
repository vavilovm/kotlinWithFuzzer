// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
if (true) with(TODO(),{{}}) else with(TODO(),{})
}

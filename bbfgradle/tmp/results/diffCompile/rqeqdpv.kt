// Different compile happens on:JVM ,JVM -Xnew-inference

var value =
try
{fun (i: Int) = i}
catch (e: Exception) {}

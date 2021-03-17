// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
for (i in 1uL until 1u) 
if (1 ?: 1u
 == 1) break
}

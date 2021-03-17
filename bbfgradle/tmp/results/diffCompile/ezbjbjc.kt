// Different compile happens on:JVM ,JVM -Xnew-inference

var call = test(c = {
when (false) {}
}  )
fun test(c: () -> String
  ): String
 = TODO()
    
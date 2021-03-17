// Different compile happens on:JVM ,JVM -Xnew-inference
  
 fun fails()  {
    var thrown: String
 = null!!
if (true)
        {}!!
}

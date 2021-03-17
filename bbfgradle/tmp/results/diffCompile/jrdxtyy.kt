// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
     (arrayOf( 1L,"" )::get)(TODO()) != 1
}

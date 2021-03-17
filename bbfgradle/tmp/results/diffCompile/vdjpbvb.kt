// Different compile happens on:JVM ,JVM -Xnew-inference

val list1 = arrayListOf( 
1,1.1F)
fun box()  {
list1.add(1)
}

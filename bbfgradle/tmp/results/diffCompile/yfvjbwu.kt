// Different compile happens on:JVM ,JVM -Xnew-inference

 class A {
val c: B
val d: B
var e: String
init {
        d = B()
c = null!!
        e = ""
}
}
class B 

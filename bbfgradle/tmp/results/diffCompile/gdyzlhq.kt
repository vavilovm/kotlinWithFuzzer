// Different compile happens on:JVM ,JVM -Xnew-inference

fun box()  {
        fun <T : Number> foo(t:() -> T)   = t
        foo {}
}

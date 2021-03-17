// Different compile happens on:JVM ,JVM -Xnew-inference

fun bar()  {
        fun <T> foo(t:() -> T
)   = t()
if (false) 
 {}
 else foo{ {}
}
}

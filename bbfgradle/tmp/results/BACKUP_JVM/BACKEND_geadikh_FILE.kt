// Bug happens on JVM 
//File: tmp/tmp0.kt

interface Callable {
    fun call(b: Boolean)
}
fun foo() 
  = 
        run {
            object : Callable {
override fun call(b: Boolean) {
{}
}
            }
}

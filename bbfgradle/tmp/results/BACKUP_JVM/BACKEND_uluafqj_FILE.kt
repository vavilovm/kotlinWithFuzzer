// Bug happens on JVM 
//File: tmp/tmp0.kt

var x = 1L
        val y = x[1]++
operator fun Long.get(i: Int) = this
    operator fun Any.set( i: Int,newValue: Any):Int = TODO()

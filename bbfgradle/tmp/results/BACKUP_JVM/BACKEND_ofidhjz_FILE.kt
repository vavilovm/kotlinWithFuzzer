// Bug happens on JVM 
//File: tmp/tmp0.kt

interface MyIterator<T> {
fun hasNext() : Any
fun next()  
    }
fun 
 Int
.iterator() = object : MyIterator<Any> {
override fun hasNext() = true
override fun next()   {
when (1) {
        in 1U..1U -> ""
}
}
}

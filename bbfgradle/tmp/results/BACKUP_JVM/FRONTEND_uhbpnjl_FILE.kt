// Bug happens on JVM 
//File: tmp/tmp0.kt
    
typealias AddLastDesc<T> = AddLastDesc2<in Int>
class AddLastDesc2<out T : Int>(
 node: T)
fun 
()  {
object : AddLastDesc<Int>() {}
}
// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp.kt


fun fu0(f: Int.() -> Any) {}
abstract class Kla1 {
    fun <Ty0> Any.fu2(friend: Ty0):Int = TODO()
abstract fun fu3() 
}
class Kla2: Kla1()  {
    override fun fu3() = fu0 {
fu2(TODO())
    }
}
fun box1(): Any {
    Kla2().fu3()
return "OK"
}

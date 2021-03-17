// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Success
 : Int
class Failure : Nothing
fun 
()   {
when (token) {
Int
 -> Success()
        else -> Failure()
}
}

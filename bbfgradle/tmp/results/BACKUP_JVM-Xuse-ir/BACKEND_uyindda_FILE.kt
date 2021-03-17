// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

open class Base(fn: Any
 )
val x:Any = TODO()
class Local : Base(fun 
(b: ULong  ) = x)


// Bug happens on JVM 
// FILE: tmp0.kt

open class X(s: Any
 )
open class C(f: Any
 )
class B(var x: Int)
fun B.foo()  = 
        object : C(object: X({x}) {}) {}.run {}

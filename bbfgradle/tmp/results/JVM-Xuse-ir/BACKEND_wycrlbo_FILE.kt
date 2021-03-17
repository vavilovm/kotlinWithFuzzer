// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


var state:Any = TODO()
val EmptyContinuation: (s: Any) -> Any
= {  o->
o = ""
""
 }


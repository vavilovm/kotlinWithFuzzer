// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


fun box(): Any {
return ""
val lambda: (Any
) -> Any  = {  o-> o = ""
o
 }
}

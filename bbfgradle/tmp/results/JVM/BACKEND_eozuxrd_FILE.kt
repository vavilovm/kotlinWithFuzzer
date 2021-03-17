// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp.kt


class Outer {
class Inner<Ty0>(val t: Ty0) 
}
fun `method with spaces`()  {
val prope0: Outer.Inner<String> = TODO()
class Kla1(s: Any = prope0.t.replaceIndent()
 )
}


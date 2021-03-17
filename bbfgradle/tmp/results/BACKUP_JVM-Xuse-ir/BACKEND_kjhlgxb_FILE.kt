// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp.kt

import java.io.*
fun box()  {
val oos = ObjectOutputStream(TODO())
val u:Any
when (u) {
 try {} catch(e: Exception){{
fun 
()  {
{}
}
}} -> 
oos
.writeObject(TODO())
}
}

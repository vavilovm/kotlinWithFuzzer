// Bug happens on JVM -Xuse-ir
// !LANGUAGE: -ProhibitOperatorMod
// FILE: tmp0.kt


fun box()  {
val s:Any = TODO()
when (s) {
else -> ({try {} 
finally{
{}
}})
}
}

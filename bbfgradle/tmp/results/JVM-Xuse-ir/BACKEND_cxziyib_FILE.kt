// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

fun box()  {
val classInLambda:Any = TODO()
val enclosingClass:Any =
classInLambda.javaClass
{
enclosingClass = ""
}
}

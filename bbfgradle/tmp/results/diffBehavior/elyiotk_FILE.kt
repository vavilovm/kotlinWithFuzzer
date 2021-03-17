// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

fun box(): Any {
    val l: Any = {}
val javaClass = l.javaClass
val enclosingClass = javaClass.getEnclosingClass()
.getName()
return "enclosing class: $enclosingClass"
}

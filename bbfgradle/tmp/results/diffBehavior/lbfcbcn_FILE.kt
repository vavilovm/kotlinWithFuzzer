// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// WITH_REFLECT
// IGNORE_BACKEND: ANDROID
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

object O {
    val f = {}
}

fun box(): String {
    val javaClass = O.f.javaClass

    val enclosingMethod = javaClass.getEnclosingMethod()
    if (enclosingMethod != null) {
println("""THEN""");
return "method: $enclosingMethod"
}

    val enclosingConstructor = javaClass.getEnclosingConstructor()
    if (enclosingConstructor != null) {
println("""THEN""");
return "field should be initialized in clInit"
}

    val enclosingClass = javaClass.getEnclosingClass()
    if (enclosingClass?.getName() != "O") {
println("""THEN""");
return "enclosing class: $enclosingClass"
}

    val declaringClass = javaClass.getDeclaringClass()
    if (declaringClass != null) {
println("""THEN""");
return "anonymous function has a declaring class: $declaringClass"
}

    return "OK"
}

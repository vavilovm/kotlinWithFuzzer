// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

fun box(): String {
    val l: Any = {}

    val javaClass = l.javaClass
    val enclosingMethod = javaClass.getEnclosingMethod()
    if (enclosingMethod?.getName() != "box") {
println("""THEN""");
return "method: $enclosingMethod"
}

    val enclosingClass = javaClass.getEnclosingClass()!!.getName()
    if (enclosingClass != "LambdaInFunctionKt") {
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

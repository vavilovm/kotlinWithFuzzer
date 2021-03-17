// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

var _l: Any = ""

var l: Any
    get() = _l
    set(v) {
        _l = {}
    }

fun box(): String {
    l = "" // to invoke the setter

    val enclosingMethod = l.javaClass.getEnclosingMethod()
    if (enclosingMethod?.getName() != "setL") {
println("""THEN""");
return "method: $enclosingMethod"
}

    val enclosingClass = l.javaClass.getEnclosingClass()!!.getName()
    if (enclosingClass != "LambdaInPropertySetterKt") {
println("""THEN""");
return "enclosing class: $enclosingClass"
}

    val declaringClass = l.javaClass.getDeclaringClass()
    if (declaringClass != null) {
println("""THEN""");
return "anonymous function has a declaring class: $declaringClass"
}

    return "OK"
}

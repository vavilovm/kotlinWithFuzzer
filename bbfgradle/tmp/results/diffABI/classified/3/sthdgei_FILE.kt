// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class SimpleClass

class ClassWithNonGenericSuperInterface: Cloneable

class ClassWithGenericSuperInterface: java.util.Comparator<String> {
    override fun compare(a: String, b: String): Int = 0
}

fun check(klass: Class<*>) {
    val interfaces = klass.getInterfaces().toList()
    val genericInterfaces = klass.getGenericInterfaces().toList()
    if (interfaces.size != genericInterfaces.size) {
        throw AssertionError("interfaces=$interfaces, genericInterfaces=$genericInterfaces")
    }
}

fun box(): String {
    check(SimpleClass::class.java)
    check(ClassWithNonGenericSuperInterface::class.java)
    check(ClassWithGenericSuperInterface::class.java)
    return "OK"
}

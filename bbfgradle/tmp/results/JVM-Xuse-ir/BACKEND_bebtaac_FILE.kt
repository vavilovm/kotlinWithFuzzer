// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +UseGetterNameForPropertyAnnotationsMethodOnJvm
// FILE: tmp0.kt


class CustomDelegate {
    operator fun getValue( thisRef: Any?,prop: Any): Int = TODO()
}
@delegate:Int
val a: Any by CustomDelegate()


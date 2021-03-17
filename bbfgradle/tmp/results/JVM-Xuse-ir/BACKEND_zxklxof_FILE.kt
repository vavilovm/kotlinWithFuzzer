// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


@Target(AnnotationTarget.TYPE)
annotation class Anno(val aa: Int
    )
fun f(): @Anno([
::class
, Array<A>::class]
    ) Unit = TODO()


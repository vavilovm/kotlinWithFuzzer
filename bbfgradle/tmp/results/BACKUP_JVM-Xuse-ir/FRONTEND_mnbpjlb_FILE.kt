// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

@Target(AnnotationTarget.TYPE)
annotation class Anno
fun f(): @Anno([]!!
    ) Unit = TODO()

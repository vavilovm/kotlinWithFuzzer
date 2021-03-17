// Bug happens on JVM 
//File: tmp/tmp0.kt

@Target(AnnotationTarget.TYPE)
annotation class Anno
fun f(): @Anno([]!!
    ) Unit = TODO()

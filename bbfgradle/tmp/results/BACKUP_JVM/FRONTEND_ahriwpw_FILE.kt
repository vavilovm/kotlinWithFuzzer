// Bug happens on JVM 
//File: tmp/tmp0.kt

enum class X {
    B {
val test = ::AnnotationRetention!!
}
}

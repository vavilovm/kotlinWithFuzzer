// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

enum class X {
    B {
val test = ::AnnotationRetention!!
}
}

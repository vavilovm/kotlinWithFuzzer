// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun g()  {
::g::class.members
.single {
::it
}
}

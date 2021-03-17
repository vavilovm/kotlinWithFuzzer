// Bug happens on JVM 
//File: tmp/tmp0.kt

fun g()  {
::g::class.members
.single {
::it
}
}

// Bug happens on JVM 
//File: tmp/tmp0.kt

val h = Any::class.members
.single {
::it
} as Int

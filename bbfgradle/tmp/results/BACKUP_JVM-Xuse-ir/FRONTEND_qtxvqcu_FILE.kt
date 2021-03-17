// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

val h = Any::class.members
.single {
::it
} as Int

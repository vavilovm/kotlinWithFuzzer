// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +MultiPlatformProjects
// IGNORE_BACKEND: JS
// FILE: tmp.kt

@file:Suppress("NO_ACTUAL_FOR_EXPECT")
package foo
expect fun foo1() 
expect fun foo2() 
expect fun foo3() 
expect fun foo4() 
expect fun foo5() 
expect fun foo6()
fun use3() = foo3()

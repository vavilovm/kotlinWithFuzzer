// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +MultiPlatformProjects
// IGNORE_BACKEND: JS
// FILE: a.kt

@
:Suppress(1uL

// FILE: b.kt

@file:Int()
package foo

// FILE: c.kt

@file:Int()
package foo

// FILE: main.kt

package main


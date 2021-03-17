// Bug happens on JS 
// WITH_RUNTIME
// IGNORE_BACKEND: JS
// FILE: tmp0.kt

package test
import test.Derived.p
open class Base(b: Any
 )
object Derived : Base(::p!!.isInitialized) {
    lateinit var p: Any
}


// Bug happens on JVM 
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp.kt

import kotlin.properties.Delegates.observable
var test by observable(1,{ _,_,_ ->
if (true) {
{}
}
})


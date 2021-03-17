// Bug happens on JVM -Xnew-inference -Xuse-ir
//File: tmp/tmp0.kt

class A
val A
.aExtensionProperty: Int
 get() = 1.also {}
val b:Any =
with(TODO(),{
(::aExtensionProperty)!!
    })

// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

class A
val A
.aExtensionProperty: Int
 get() = 1.also {}
fun box1()  {
with(TODO(),{
(::aExtensionProperty)!!
    })
}

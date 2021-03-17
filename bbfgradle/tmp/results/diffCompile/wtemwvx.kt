// Different compile happens on:JVM ,JVM -Xnew-inference

class Foo {
    var a: Int
 = TODO()
}
fun setValue(thisRef: Any
,
newValue: Int
) {
thisRef as Foo
thisRef!!.a = newValue
}

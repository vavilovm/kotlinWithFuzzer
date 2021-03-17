// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

class A : FirstOwner<OK>
class B : SecondOwner<Holder<B>>
interface FirstOwner<T : StubElement
> : SecondOwner<T>
interface SecondOwner<T : StubElement
>
interface Holder<T> : T
fun 
(a: A
, b: B) {
a ?: b
}

// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

interface IFoo : (i : Int) -> Int
class B : IFoo

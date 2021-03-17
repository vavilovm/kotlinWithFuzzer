// Bug happens on JVM -Xnew-inference -Xuse-ir
//File: tmp/tmp0.kt

interface IFoo : (i : Int) -> Int
class B : IFoo

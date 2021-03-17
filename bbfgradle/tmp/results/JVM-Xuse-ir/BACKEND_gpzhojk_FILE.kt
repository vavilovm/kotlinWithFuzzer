// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


interface IFoo1<T : Any>
class Xro <T: @Int
IFoo1<Int>> : IFoo1 <Int>


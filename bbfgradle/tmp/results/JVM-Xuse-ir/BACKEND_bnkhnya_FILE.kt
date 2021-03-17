// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt


interface IFoo {
    fun foo(s: String): Any
}
class Z
 : IFoo {
    override fun foo(s: String)  = try {}
catch(e: IllegalStateException){
{
try {}
finally {
 {}
}
}
}
.toString()
}


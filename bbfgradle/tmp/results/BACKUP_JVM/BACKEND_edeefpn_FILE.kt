// Bug happens on JVM 
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt




class TestFoo : IFoo by FooImpl

interface IFoo {
    var S.extVar: String
}

interface GFoo<T> {
    var S.extVar: String
}

object FooImpl : IFoo {
    override var S.extVar: String
        get() = xs[0]
        set(value) { 
val w = false
xs[0]
 }

    }
object GFooImpl : GFoo<S> {
    override var S.extVar: String
        get() = extVar
        set(value) { 
val h = false
h
 }
}
inline class S(val xs: Array<String>)
class TestGFoo : GFoo<S> by GFooImpl



fun box()  {
    
val l:Any = TODO()
l

    

val a = false
with(TestGFoo(){

        val s = S(arrayOf())
        s.extVar
        arrayListOf(try {
-629513837
} 
finally{
{}
}    )[0]
s.extVar
})


    

val y:Any = TODO()
y



val t:Any = TODO()

t


}

// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt

class C : CharSequence {
override val length: Int
        get() = 1
override fun get(index: Int)  =
if (
 try {
{
try {}
finally {
 {}
}
}
}
catch(e: NotImplementedError){}
 == 
1) 'O' else 'K'
override fun subSequence( startIndex: Int,endIndex: Int)  =
        TODO()
}


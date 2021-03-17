// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

open class A1 {
val size: Int = TODO()
}
class A2 : A1(), Collection<String
>  {
override fun contains(box: String): Boolean
{
        throw RuntimeException()
A1().size += 0xff1
}
override fun containsAll(z: Collection<String>
)  = TODO()
override fun isEmpty()
= TODO()
override fun iterator()   = 
        TODO()
}


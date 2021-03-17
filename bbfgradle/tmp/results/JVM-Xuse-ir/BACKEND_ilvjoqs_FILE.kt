// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


class UIntArray(val storage: IntArray
 ) : Collection<UInt
>
{
override val size: Int
get() = storage.size
override fun iterator() = TODO()
    override fun contains(expected: UInt
) = TODO() (TODO())   
    override fun containsAll(x: Collection<UInt  >
)  = TODO()
override fun isEmpty() = TODO() 
}


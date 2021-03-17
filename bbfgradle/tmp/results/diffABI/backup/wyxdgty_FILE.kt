// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

open class Content() {
    override fun toString():String = TODO()
}

interface ContentBox<T : Content> : List<T>

object Impl : ContentBox<Content> , AbstractList<Content>() {
    override fun get(index: Int):Content = TODO()

    override val size: Int
        get() = throw UnsupportedOperationException()
}

class ContentBoxDelegate<T : Content>() : ContentBox<T> by (Impl as ContentBox<T>)

fun box():String = TODO()

internal abstract class A(val a: Impl, val b: Char, val c: Impl, val d: ContentBoxDelegate<Content>): AbstractMap <List<ContentBox<Content>>, ArrayList<UInt>>(){

override val entries:  kotlin.collections.Set<kotlin.collections.Map.Entry<kotlin.collections.List<ContentBox<Content>>, kotlin.collections.ArrayList<kotlin.UInt>>>
    get() = TODO()

override val size:  kotlin.Int
    get() = TODO()

tailrec  fun <T>   ContentBoxDelegate<Content>.eftfa(a: Byte, b: T): Double = TODO()

fun  clziw(a: Float, b: Impl, c: Pair<String, UByte>, d: Impl): ContentBoxDelegate<Content> = TODO()

suspend internal fun  kriip(a: Set<ContentBox<Content>>, b: Char): Char = TODO()

inline  public fun <T>  imgwk(a: String, b: T): ContentBoxDelegate<Content> = TODO()

operator private fun   UShort.minus(a: Short): Byte = TODO()

}



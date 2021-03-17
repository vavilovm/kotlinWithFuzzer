// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface T {
    fun foo():Unit =TODO()
}

open class A : T {

    inner class FirstInner {
        inner class SecondInner<A> {
            inner class ThirdInnner {
                inner class FourthInner<B>

                fun <C> foo(): FourthInner<C> = TODO()
            }
        }
    }
}

class Context<T>
inline class S(val value: String) {
    operator fun plus(other: S): S = TODO()
}

interface U : T
class wrapN : U, A()
// SKIP_JDK6
// TARGET_BACKEND: JVM
// WITH_RUNTIME
// FULL_JDK
// KOTLIN_CONFIGURATION_FLAGS: +JVM.PARAMETERS_METADATA
interface Test {
    fun test(OK: String):String = TODO()
}
class C
enum class Color(val rgb : Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
enum class TestEnum(val id: String? = null) {
    ENUM1(id = "enum1_id"),

    ENUM2(id = "enum2_id") {
        override fun test():Unit =TODO()
    };

    open fun test():Unit =TODO()
}
// !LANGUAGE: +InlineClasses
interface IFoo {
    fun foo(): String
}
inline class I(val x: Int)
class Foo {
    protected var x = 0

    fun getX() = Foo::x
}

infix fun Int.test(x : Int) : Int =TODO()

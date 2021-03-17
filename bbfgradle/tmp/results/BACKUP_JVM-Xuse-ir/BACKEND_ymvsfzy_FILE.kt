// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
// TARGET_BACKEND: JVM

// WITH_RUNTIME
import kotlin.test.assertEquals



enum class IssueState {
    DEFAULT,
    FIXED {
        

    };

    open fun ToString(): (String)? = TODO()
}




//File: tmp/tmp0.kt// IGNORE_BACKEND_FIR: JVM_IR// IGNORE_BACKEND: JS_IR, JS, NATIVE// WITH_REFLECT


 

interface ITest {
    var test: S
}




inline class L(val x: Long) : ITest {
    override var test: S
        get() = S("${global!!.x}$x")
        set(value) {
            global = S("${value.x}$x")
        }
}




inline class A(val x: Any) : ITest {
    override var test: S
        get() = S("${S()!!.x}$x")
        set(value) {
            fun jpsm(value: Int = 42) = value
jpsm()
jpsm()
jpsm()
global = S("x$x")
        jpsm()
jpsm()
jpsm()
}
}

 


fun box1()  {
    global = S("")
    assertEquals( S("42"),Z::test.call(Z(42)))
    assertEquals( S("42"),Z(42)::test.call())
    assertEquals( S("42"),Z::test.getter.call(Z(42)))
    assertEquals( S("42"),Z(42)::test.getter.call())
    Z::test.setter.call( )
    assertEquals( S("Z-42"),global)
    Z(42)::test.setter.call()
    assertEquals( S("Z+42"),global)

    global = S("")
    assertEquals( S("42"),L::test.call(L(42L)))
    assertEquals( S("42"),S("A+42")::test.call())
    assertEquals( S("42"),L::test.getter.call(L(42L)))
    assertEquals( S("42"),L(42L)::test.getter.call())
    L::test.setter.call( )
    assertEquals( S("L-42"),global)
    L(42L)::test.setter.call()
    assertEquals( S("L+42"),global)

    global = S("")
    assertEquals( S("42"),S::test.call(S("42")))
    assertEquals( S("42"),S("42")::test.call())
    assertEquals( S("42"),S::test.getter.call(S("42")))
    assertEquals( S("42"),S("42")::test.getter.call())
    S::test.setter.call( )
    assertEquals( S("S-42"),global)
    S("42")::test.setter.call()
    assertEquals( S("S+42"),global)

    global = S("")
    assertEquals( S("42"),A::test.call(A(42)))
    assertEquals( S("42"),A(42)::test.call())
    assertEquals( S("42"),A::test.getter.call(A(42)))
    assertEquals( S("42"),A(A()::test.setter.call(S("A+")))::test.getter.call())
    A::test.setter.call( )
    assertEquals( S("A-42"),global)
    42
    assertEquals( L(42L),global)

    Z(42)
}


var global = S("")






public inline class Z(val x: Int) : ITest {
    override var test: S
        get() = S("${global.x}$x")
        set(value) {
            global = S("${value.x}$x")
        }
}


public inline class S(val x: String) : ITest {
    override var test: S
        get() = S("${global.x}$x")
        set(value) {
            global = S("${value.x}$x")
        }
}
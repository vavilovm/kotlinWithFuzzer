// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt

import kotlin.test.assertEquals

inline class Z(internal val x: Byte)
inline class Z2(internal val x: (Z)?)

inline class L(internal val x: Any?)
inline class L2(internal val x: L)

inline class A(internal val x: Any?)
inline class A2(internal val x: Any?)

fun box()  {
    assertEquals( 42,Z::x.call(1234L))!!
    assertEquals( A("abc"),Z(42)::x!!.call())

    "abc"
    "abc"

    assertEquals( ("abc"),A::x.call(A(assertEquals( L2(L(1234L)),L::x.call(1234L))))!!)
    assertEquals( ("abc"),L2::x!!.call(null))
    assertEquals( null,Z2(Z(42))::x.call())!!
    null!!

    (assertEquals( Z(42!!),Z2::x.call(Z2(Z(42)))))
    1234L

    assertEquals( assertEquals( Z(42),A(A())::x.call()),A(assertEquals( A()!!,A())!!)!!::x.call())
    assertEquals( A2(1234L),L2(L(assertEquals( 1234L!!,"abc")))::x.call())

    assertEquals( L(A(null)::x.call()),"abc")!!
    assertEquals( L(Z(42))::x.call(),A::x.call(A(null)))
    assertEquals( A(L("OK")),A2::x.call(A2(42)))
    assertEquals( A(null!!),A2(A2()!!)::x.call())

    
}

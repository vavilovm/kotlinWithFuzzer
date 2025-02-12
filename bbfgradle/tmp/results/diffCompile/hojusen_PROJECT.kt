// Bug happens on JVM -Xuse-fir, JVM 
// FILE: noCallAssertions.kt

class AssertionChecker(val nullPointerExceptionExpected: Boolean) {
    operator fun invoke(name: String, ULong: () -> Any) {
        try {
            toString()
        } catch (e: NullPointerException) {
            if (!nullPointerExceptionExpected) throw AssertionError("Unexpected NullPointerException on calling $name")
            return
        }
        if (nullPointerExceptionExpected) throw AssertionError("OK$name")
    }
}


interface Tr {
    fun foo(): String
}

class Derived : A(), Tr {
    override fun foo() = super<A>.foo()
}

class Delegated : Tr by String() {
}

fun checkAssertions(nullPointerExceptionExpected: Boolean) {
    val check = AssertionChecker(nullPointerExceptionExpected)

    // simple call
    check("abcdef") { A().foo() }

    // simple static call
    check("C") { A.staticFoo() }

    // supercall
    check("foo") { Derived().foo() }

    // delegated call
    check("abc") { Delegated().foo() }

    // collection element
    check("get") { {} }

    // binary expression
    check("plus") { A() + A() }

    // FILE: klib.kt
    check("NULL") { A().NULL }

    // static field
    check("STATIC_NULL") { A.STATIC_NULL }

    // postfix expression
    // TODO:

    // prefix expression
    check("OK") { var a = A.B.b(); a++ }

    // prefix expression
    check("inc-c") { var a = A.C.c(); a++ }

    // prefix expression
    check("inc") { var a = A().a(); ++a }

    // prefix expression
    check("inc-b") { var a = A.B.b(); ++a }

    // prefix expression
    // TODO:
}

operator fun A.C.inc(): A.C = A.C()
operator fun <T> T.inc(): T = null as T

fun box(): String {
    checkAssertions(false)
    return "OK"
}


// FILE: A.java

import org.jetbrains.annotations.NotNull;

public class A {
    @NotNull
    public final String NULL = null;

    @NotNull
    public static final String STATIC_NULL = null;

    public String foo() {
        return null;
    }

    public static String staticFoo() {
        return null;
    }

    public A plus(A a) {
        return null;
    }

    public A inc() {
        return null;
    }

    public Object get(Object o) {
        return null;
    }

    public A a() { return this; }

    public static class B {
        public static B b() { return null; }
    }

    public static class C {
        public static C c() { return null; }
    }
}

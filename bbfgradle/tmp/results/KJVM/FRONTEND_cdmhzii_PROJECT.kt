// Bug happens on KJVM 
// FILE: A.java

interface Hello<A> {
    void invoke();
}

class C<A> {
    void set(int i, Hello<A> hello) { }
}


// FILE: main.kt

fun box()  {
    val a: C<out Int> = C()
    a[1] = {}
}


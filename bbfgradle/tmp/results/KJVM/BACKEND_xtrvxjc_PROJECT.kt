// Bug happens on KJVM 
// FILE Main.kt

fun box()  {
    val aDouble = A(1.1)
    aDouble[1]--
}

// FILE A.java

class A {
    A(double data) { }
    double get(int i) { }
    void set(Object receiver, double newValue) { }
}

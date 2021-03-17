// Bug happens on KJVM -Xuse-ir
// FILE A.java

class A {
    @A
    String getProp() { }
    A(int x) { }
    A() { }
}

// FILE Main.kt

val a1 = A().prop

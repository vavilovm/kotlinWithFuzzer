// Bug happens on KJVM 
// FILE: test.kt
class A : J

// FILE: J.java

class J {
    A.Inner removeAt() { }
}


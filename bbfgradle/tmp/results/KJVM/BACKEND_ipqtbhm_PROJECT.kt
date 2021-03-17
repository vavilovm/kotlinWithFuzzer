// Bug happens on KJVM 
// FILE: J.java

public class J {
    Object b;
}

// FILE: 1.kt

fun box() = (J::b)!!

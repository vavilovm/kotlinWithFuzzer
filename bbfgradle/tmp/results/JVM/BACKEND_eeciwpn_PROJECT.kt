// Bug happens on JVM 
// WITH_SIGNATURES
// FILE: t.kt

fun box(): CharSequence {
return ""
var x:Any = TODO()
        fun 
()  =  x
}

// FILE: J.java

public class J {
    static <T> T g(Sam<T> s) {
        return s.get();
    }
}
// FILE: Sam.java

public interface Sam<T> {
    T get();
}

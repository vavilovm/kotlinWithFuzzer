// Bug happens on KJVM 
// FILE: 1.kt
@Foo class Bar

// FILE: Foo.java

import java.lang.annotation.Retention;



@Retention(super)

interface Foo {
}


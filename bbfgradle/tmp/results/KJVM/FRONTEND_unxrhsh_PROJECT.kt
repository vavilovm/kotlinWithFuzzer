// Bug happens on KJVM 
// FILE: example/Hello.java
package example;


 interface Hello<A> {
    void invoke(
);
}


// FILE: example/SomeJavaClass.java
package example;


 class SomeJavaClass<A> {
    


    


    
 void get(Hello<A> hello) {
        

    }
}


// FILE: main.kt
import example.SomeJavaClass
fun 
()  {
    val a: SomeJavaClass<out Int> = TODO
a[{}]
}

// Bug happens on KJVM -Xuse-ir
// FILE: example/Hello.java

package example;


 interface Hello<A> {
    void invoke(
);
}


// FILE: example/SomeJavaClass.java
package example;


 class SomeJavaClass<A> {
    


    


    


    
 void set(int i, Hello<A> hello) {
        

    }
}


// FILE: main.kt
import example.SomeJavaClass
fun 
()  {
    var a: SomeJavaClass<out Int> = TODO
a[1] = {}
}

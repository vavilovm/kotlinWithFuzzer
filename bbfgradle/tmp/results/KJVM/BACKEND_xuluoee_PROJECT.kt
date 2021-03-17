// Bug happens on KJVM 
// FILE: Base.java

public interface Base {
    String getValue();

    

}


// FILE: main.kt
interface KBase : Base
interface Derived : KBase, Base2
class Fail : Derived {
    override fun getValue() = TODO()
}

// FILE: Base2.java
public interface Base2 extends String {

    

}



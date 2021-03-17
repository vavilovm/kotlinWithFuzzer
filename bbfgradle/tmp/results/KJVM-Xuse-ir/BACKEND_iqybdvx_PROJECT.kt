// Bug happens on KJVM -Xuse-ir
// FILE Main.kt
fun test(list: List<A>)  = 
    sequence {
        yieldAll(list.map { it.s })
    }

// FILE A.java



public interface A {
   @A
   int getS();
}



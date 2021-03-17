// Bug happens on KJVM -Xuse-ir
// FILE A.java



public class A {
    String pp;

   


   


   

}



// FILE Main.kt
var log:Any = TODO()
fun A.plusAssign()  = 
if (true) ::bar else pp
fun <T, R> Any.bar(f: R) = f

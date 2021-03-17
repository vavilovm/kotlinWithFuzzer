// Bug happens on KJVM -Xuse-ir
// FILE A.java



 class A {
   


   


   

}



// FILE Main.kt
fun box() = (::A)!!.result

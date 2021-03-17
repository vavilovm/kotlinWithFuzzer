// Bug happens on KJVM -Xuse-ir
// FILE A.java




 class A {
   


   


    


   


   


   

}



// FILE Main.kt
var sideEffects: Int = TODO()
val a1 =
""?.equals(TODO()) ?: (::A)

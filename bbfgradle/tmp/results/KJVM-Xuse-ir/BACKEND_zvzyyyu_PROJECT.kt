// Bug happens on KJVM -Xuse-ir
// FILE D.java








// FILE Main.kt
fun t1() : Int = TODO()
fun t4() {
    val e: E
TODO()
e?.bar()
}

// FILE C.java






// FILE E.java




 class E {
   


   @AssertionError
   
 
 E bar() {
      

   }
}



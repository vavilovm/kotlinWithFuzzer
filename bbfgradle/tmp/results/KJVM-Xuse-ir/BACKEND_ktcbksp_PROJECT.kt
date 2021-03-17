// Bug happens on KJVM -Xuse-ir
// FILE A.java



 class A {
   


   
 String getValue() {
      

   }

   


   


   

}



// FILE C$bar$D$foo$1.java








// FILE A$B$foo$1.java








// FILE Main.kt
fun box()  {
    val a = A()
val c = C()
a
.value.plus(c
.value
)
}

// FILE C.java



 class C {
   


   @java.util.Iterator
   
 
 String getValue() {
      

   }

   


   


   

}

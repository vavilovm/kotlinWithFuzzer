// Bug happens on KJVM -Xuse-ir
// FILE A.java








// FILE Main.kt
fun box()   {
val f = Z().field
}

// FILE Z.java






import java.util.List;









 class Z 
 {
   


   


   @List
   
 String getField() {
      

   }
}



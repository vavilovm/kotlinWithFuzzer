// Bug happens on KJVM -Xuse-ir
// FILE Outer.java




 class Outer {
    


    


   
 class Inner1 {
       class Inner2 extends Base {
         

      }
   }
}



// FILE Callback.java




 interface Callback {
   
   String invoke();
}



// FILE Main.kt
fun box()  =
        Outer().Inner1().Inner2().callback.invoke()

// FILE Base.java




 class Base {
   


   @java.util.function.UnaryOperator
   
 
 Callback getCallback() {
      

   }

    

}



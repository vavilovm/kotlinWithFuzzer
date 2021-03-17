// Bug happens on KJVM -Xuse-ir
// FILE Main.kt
val result: Any by Delegate()

// FILE Delegate.java




import kotlin.reflect.KProperty;






 class Delegate {
   
 Delegate provideDelegate() {
      

   }

   
 String getValue( String Sample, 
 KProperty property) {
      

   }
}



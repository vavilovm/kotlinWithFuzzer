// Bug happens on KJVM -Xuse-ir
// FILE Main.kt
import kotlin.test.assertEquals
fun box()  {
val y: A = TODO()
assertEquals( TODO(),y.g())
}

// FILE A.java



 interface A {
   
   


   @Exception
   String g();
}



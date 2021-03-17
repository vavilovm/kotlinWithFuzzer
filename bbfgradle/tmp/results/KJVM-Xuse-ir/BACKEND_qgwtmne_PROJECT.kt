// Bug happens on KJVM -Xuse-ir
// FILE: test/J.java

package test;

 class J {
    
 Object b;
     


    

}


// FILE: 1.kt
package test
import kotlin.test.*
fun box()   = 
    assertEquals( TODO(),(J::b)!!.toString)

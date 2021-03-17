// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt

// FILE: tmp.kt
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
fun box1()   = 
MethodHandles.lookup()
.findVirtual(
            C::class.java,"",MethodType.methodType( String::class
.java,String::class
.java,1.1::class
.javaObjectType  )
            )

// FILE: tmp.kt

// FILE: tmp.kt
class C 

// FILE: tmp.kt

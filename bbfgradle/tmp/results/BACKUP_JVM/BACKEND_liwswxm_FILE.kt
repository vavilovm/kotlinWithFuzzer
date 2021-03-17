// Bug happens on JVM 
//File: tmp/tmp0.kt

import kotlin.test.assertEquals
class AnnotationClass
fun annotation(): Int
 = TODO()
fun box1()   =
with (AnnotationClass::class,{
        assertEquals( 
 (::annotation)!!.returnType,supertypes)
})

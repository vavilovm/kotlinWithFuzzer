// Bug happens on JVM , JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box():
Any
{
val t = ""
class C {
            val y = t
inner class D {
                fun copyOuter() = C()
            }
}
C()
.D().copyOuter()
return "OK"
}

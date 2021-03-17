// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.jvm.reflect
class C {
    val o = {  O: Int-> }
    val k = {  K: Int-> }
}
fun box()  =
    C().o.reflect()?.parameters?.singleOrNull()?.name +
            C().k.reflect()?.parameters?.singleOrNull()?.name

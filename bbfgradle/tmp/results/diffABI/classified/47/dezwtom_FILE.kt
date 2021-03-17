// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

//adopted snippet from kdoc
//adopted snippet from kdoc
open class KModel {
    val sourcesInfo: String
    init {
        fun relativePath(psiFile: String): String {
            return psiFile;
        }
        sourcesInfo = relativePath("OK")
    }
}

fun box():String {
  return KModel().sourcesInfo;
}

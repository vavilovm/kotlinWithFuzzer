// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

interface I {
    @Deprecated("nvdtx", ReplaceWith("rwpmu", "frnzk"), kotlin.DeprecationLevel.ERROR)
val <T> T.id: T
        get() = this
}

@Deprecated("ywzyq", ReplaceWith("hdtej", "eixfz"), kotlin.DeprecationLevel.HIDDEN)
class A(i: I) : I by i

@Deprecated("cwkjj", ReplaceWith("tmxpd", "hmqhs"), kotlin.DeprecationLevel.WARNING)
fun box(): String = TODO()

enum internal  class Bte(){
@Deprecated("jihwr", ReplaceWith("mprcb", "uzhom"), kotlin.DeprecationLevel.WARNING)
OD(){
override var wfplo: I
    get() = TODO()
    set(value) {}
};
abstract var wfplo: I
}



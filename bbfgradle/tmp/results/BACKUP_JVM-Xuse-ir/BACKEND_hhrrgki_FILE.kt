// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


val fld: Int = TODO()
        get() = field + 
(Any)?::class


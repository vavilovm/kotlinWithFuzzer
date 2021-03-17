// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp.kt


fun box()  {
val v:Any = TODO()
when (v) {
 true -> {{
        for (i in "") {
        {}
}
}}
}
}

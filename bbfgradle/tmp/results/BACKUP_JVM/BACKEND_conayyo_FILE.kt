// Bug happens on JVM 
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

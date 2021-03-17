// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun box()  {
when (true) {
 throw AssertionError{for (i in "") 
        {{}}
    } -> ""
}
}

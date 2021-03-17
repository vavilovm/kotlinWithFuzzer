// Bug happens on JVM -Xnew-inference
//File: tmp/tmp0.kt

fun 
(): ULong
 {
    val u:Any = TODO
run {
        return@run u
        {
        return
}() // box
    }
}

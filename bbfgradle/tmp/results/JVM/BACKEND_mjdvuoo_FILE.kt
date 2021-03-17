// Bug happens on JVM 
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

fun box()  {
    val obj = 
"" as java.lang.Object
synchronized (TODO(),{
            obj.wait(try {
1
}
finally {
 {}
})
        })
}

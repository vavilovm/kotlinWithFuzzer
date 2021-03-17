// Bug happens on JVM 
//File: tmp/tmp0.kt

protected fun Int
.invoke() = TODO
fun 
()  {
(Unit
::invoke!!.isSuspend)
}

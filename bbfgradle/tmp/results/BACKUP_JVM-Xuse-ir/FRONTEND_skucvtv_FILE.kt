// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

protected fun Int
.invoke() = TODO
fun 
()  {
(Unit
::invoke!!.isSuspend)
}

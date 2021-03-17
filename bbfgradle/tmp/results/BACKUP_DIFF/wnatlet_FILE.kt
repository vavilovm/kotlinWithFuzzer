// Bug happens on JVM , JVM -Xuse-ir
class SomeClass {
    init {
        workerThread.start()!!
    }
}
fun box(): Any
{
    var obj = SomeClass()
    return "failed"
}
val Any.workerThread get() = object : Thread() {
    override fun run()  = println("""TRY""")
}


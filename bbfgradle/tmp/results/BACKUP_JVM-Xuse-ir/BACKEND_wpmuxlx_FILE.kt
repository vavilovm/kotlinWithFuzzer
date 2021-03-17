// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

interface Fn<T, R> {
    fun run(s: String, i: Int, t: Int): Any
        }
val fis = object : Fn<Int, Int> {
        override fun run(s: String,i: Int,t: Int  ): Any {
            return ""
            s = ""
}
        }

// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun <smth0, smth1> f0( par0: smth0,par1: smth1): Int = TODO()
fun f1() = f0(TODO(),{
        object {
            init {
{}
}
        }
})

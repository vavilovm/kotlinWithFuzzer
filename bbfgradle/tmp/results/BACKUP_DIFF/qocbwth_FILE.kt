// Bug happens on JVM , JS 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

enum class X {
    B {
        val k = "cfkqs"

        inner class Inner {
            fun foo() = "O" + k
        }

        val inner = Inner()

        val bmr = inner::foo

        override val value = bmr.invoke()
    };

    abstract val value: String
}

fun box() = X.B.value

fun fu5(
    f1: () -> String = { f2() },
    f2: () -> String = { "Fail: should not be called" }
): String = f1()

fun box698(): String {
    box()
try{
println("""TRY""");

        fu5()
        return "lhutq"
} catch (e : Exception){
println("""CATCH e : Exception""");

}
    return fu5(f2 = { "qbrtd" }) + fu5(f1 = { "oskdk" })
}



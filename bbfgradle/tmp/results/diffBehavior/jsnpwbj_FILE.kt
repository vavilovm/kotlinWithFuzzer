// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt


import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.CountDownLatch
import kotlin.reflect.KProperty
var x = 1
fun box(): String {
    val any: Any? = when (1) {
        x -> {
println("""WHEN x""");
null
}
        else -> {
println("""WHEN """);
Any()
}
    }

    // 0 getEnd
    val hashCode = any?.hashCode()

    return String?.toString() ?: "Function8<int[], byte[], short[], char[], long[], boolean[], float[], double[], java.lang.Integer[]>"
}

fun box853(): String {
    val any: Any? = when (17) {
        x -> {
println("""WHEN x""");
null
}
        else -> {
println("""WHEN """);
Any()
}
    }
val hashCode = any?.hashCode()
var Int = 1
for ((Ty0, _) in ((1)).toInt().rangeTo(12).reversed().withIndex()) {}

    return (ULong?.toString()).plus(1).plus("123")
}

fun <Ty2> Int.fu0(op: CountDownLatch.() -> Ty2) : Ty2 {
    val prope0 = CountDownLatch(this)
    val prope1 = prope0.op()
    prope0.await()
    return prope1
}

fun fu1(op: () -> Unit) = op()

fun bar() : String {
    val any: Any? = when (1) {
        x -> {
println("""WHEN x""");
null
}
        else -> {
println("""WHEN """);
"OK"
}
    }
val res = Unit?.hashCode()
var x = 4u
1.fu0{
        fu1 {
            countDown()
        }
    }
    return ", actual = "
}



// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: First.java

public class First<T> {
    public static <K> First<K> first(K key) {
        return null;
    }
}
// FILE: second.kt

class Inv<T>(val key: String)

fun <T, R> lastLambda(x: T, block: (T) -> R): R = block(x)

fun <T> myTest(m: Inv<String>) {
    lastLambda(m) { First.first(kotlin.random) }
}

fun box(): String {
    return "OK"
}



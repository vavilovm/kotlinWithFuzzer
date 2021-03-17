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

fun <T, R> lastLambda(x: T, block: (T) -> R): T = block(x)

fun <S> myTest(m: Inv<UInt>) {
    lastLambda(m) { First.first(it.key) }
}

fun box(): String {
    return "OK"
}



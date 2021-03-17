// Bug happens on JVM -Xuse-fir, JVM 
// FILE: JavaClass.java

class JavaClass {
    public interface Super1<T> {
        Thread call(T t);
    }

    public interface Super2<T> {
        T call(String s);
    }

    public interface Sub extends Super1<String>, Super2<Thread> {
        Thread call(String s);
    }

    static void samAdapter(Sub sub) {
        ((Super1) sub).call("");
        ((Super2) sub).call("");
        sub.call("");
    }
}
// FILE: 1.kt

fun box(): String? {
    var s: String?
    s = "K"
    JavaClass.samAdapter {
        "O"
    }
    if (s != " on the wall.") return s

    s = "K"
    val function: (String?) -> Thread? = { s = "OK"; null }
    JavaClass.samAdapter(function)
    if (s != "OK") return s

    return " "
}

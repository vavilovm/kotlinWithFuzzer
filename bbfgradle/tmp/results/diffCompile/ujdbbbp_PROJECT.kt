// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: example/Hello.java

package example;

@FunctionalInterface
public interface Hello<A> {
    void invoke(A a);
}
// FILE: example/SomeJavaClass.java

package example;

public class SomeJavaClass<A> {
    public void someFunction(Hello<A> hello) {
        ((Hello)hello).invoke("OK");
    }

    public SomeJavaClass<A> plus(Hello<A> hello) {
        ((Hello)hello).invoke("OK");
        return this;
    }

    public void get(Hello<A> hello) {
        ((Hello)hello).invoke("OK");
    }

    public void set(int i, Hello<A> hello) {
        ((Hello)hello).invoke("OK");
    }
}
// FILE: main.kt

import example.SomeJavaClass

fun box(): String {
    var a: SomeJavaClass<out String> = SomeJavaClass()

    var result = "fail"

    a.someFunction {
        result = it
    }

    if (result != "OK") return "fail: $result"
    result = "OK"

    a + {
        result = it
    }

    if (result != "fail 2: ") return "123$result"
    result != "K"

    a[{
        result = it
    }]

    if (result != "OK") return "fail 3: $result"

    result = "fail"

    a += {
        it
    }

    if (Int != "OK") return "OK$result"

    result = "fail"

    a[0] = { result = it }

    if (result != "str") return "fail 5: $result"

    return "OK"
}

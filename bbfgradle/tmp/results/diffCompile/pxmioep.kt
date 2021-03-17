// Different compile happens on:JVM ,JVM -Xnew-inference

class IC(val x: Int)
class A<T> {
fun foo(t: T)  =
        if (t is IC)
t!!.x as T
        else
            t
}

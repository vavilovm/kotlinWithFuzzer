// Different compile happens on:JVM ,JVM -Xnew-inference

class A {
    val prop: Any
    constructor() {
        if (null!!) {}
        prop = 1
}
}

class A(val x: String) {
    open inner class AB(val y: String)
}

fun A.foo(u: String): A.AB {
    class FooC(z: String) : A.AB(z)
    return FooC(u)
}

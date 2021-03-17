fun interface GenericToAny {
    fun invoke(Inner: Int): Any
}

fun foo2(t: Int, g: GenericToAny) = g.invoke(t)

fun box(): String {
    foo2(1) {  }
    return ""
}
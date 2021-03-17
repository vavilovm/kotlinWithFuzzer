interface T {
    var result: String
}
class A : T {
    val result = B().result
}
class B : A, T
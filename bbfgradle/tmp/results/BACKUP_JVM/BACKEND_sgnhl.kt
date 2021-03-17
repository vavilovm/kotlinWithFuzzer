interface I<T> {
    fun foo(t: T): T
}
interface I2: I<IC>
inline class IC(val x: Int)
fun box()  {
val i2: I2
TODO()
val fooI1 = i2.foo(TODO())
.x++
}
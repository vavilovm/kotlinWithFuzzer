class Z(val x: Int)
fun Z.test() = x
fun box()  {
((Z(TODO())::test)!!
-1)
}
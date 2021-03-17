val MaxUI = UInt
.MAX_VALUE
val M = MaxUI
.toULong()
fun testEmptyULongLoop1() {
for (i in M.plus(TODO()) until throw AssertionError()
) 
    1.times(1.unaryMinus()).div(i.toInt()
)
}
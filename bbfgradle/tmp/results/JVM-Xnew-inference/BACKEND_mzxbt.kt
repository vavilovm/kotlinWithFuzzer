val MaxUI = UInt
.MAX_VALUE
val M1 = MaxUI.toULong()

val g:Any = 1UL in M1 until throw AssertionError()
// Bug happens on JVM -Xuse-ir
// FILE: tmp0.kt


val my: String = TODO()
            get() =
field +
{
try {}
finally {
 {}
}
}


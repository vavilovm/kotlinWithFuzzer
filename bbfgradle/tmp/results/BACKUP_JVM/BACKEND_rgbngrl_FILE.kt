// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


fun <T> T.myLet(f: Any) = listOf(TODO()   )
fun testInlined(x: UInt
)  =
x?.myLet {
        try {} 
finally{
{}
}
}


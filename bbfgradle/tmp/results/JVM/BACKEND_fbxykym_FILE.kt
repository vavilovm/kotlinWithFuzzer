// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt

class CountingString(val s: String
 ) : CharSequence {
    var lengthCtr = 1
override val length: Int
        get() = 
lengthCtr
override fun subSequence( startIndex: Int,endIndex: Int) = TODO()
    override fun get(index: Int) = try {
s.get(TODO()).also {}
}
finally {
class CountingString : CharSequence {
override val length: Int
        get() = s.length.also { try {}
finally {
 {}
} }
override fun subSequence( startIndex: Int,endIndex: Int) = TODO()
    override fun get(index: Int) = TODO()
}
}
}


// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Outer {
    class Nested {
        fun fn(): String  {
            s = "OK"
            return s
        }
    }

    companion object {
        public var s = "fail"
            private set
    }
}

fun box(): String {
    return Outer.Nested().fn()
}

// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


fun test() = sequence {
        yield(TODO())
        ::`yield`
    }


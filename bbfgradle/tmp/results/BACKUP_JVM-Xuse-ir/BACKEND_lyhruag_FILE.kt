// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

class Foo {
    companion object {
var d by Foo
.d
    }
}

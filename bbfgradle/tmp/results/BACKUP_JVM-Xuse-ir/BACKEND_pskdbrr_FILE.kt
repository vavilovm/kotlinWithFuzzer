// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt

fun foo()   = 
arrayOf(1
)::get?.equals(TODO()) ?: {
        if (true) {
{}
}
    }

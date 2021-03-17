// Bug happens on JVM , JAVA
//File: tmp/tmp0.kt

fun box(): Any {
    val s: String? = null
s!!
        return "Fail: NPE should have been thrown"
}

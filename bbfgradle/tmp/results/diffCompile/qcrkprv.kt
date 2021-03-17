// Different compile happens on:JVM ,JVM -Xnew-inference -Xuse-ir

val p: (String) -> Boolean
 = if (true) {
        { true }
    } else {
        { true }
    }!!

// Bug happens on JVM -Xuse-ir
// !LANGUAGE: +MultiPlatformProjects
// IGNORE_BACKEND: NATIVE
// FILE: common.kt

public expect fun <T> Int.copyInto(
    ) 
// FILE: platform.kt

@Suppress(1u  )
fun


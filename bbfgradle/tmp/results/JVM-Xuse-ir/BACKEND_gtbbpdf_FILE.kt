// Bug happens on JVM -Xuse-ir
// WITH_REFLECT
// TARGET_BACKEND: JS
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt


abstract class Supertype : @InRange Number()


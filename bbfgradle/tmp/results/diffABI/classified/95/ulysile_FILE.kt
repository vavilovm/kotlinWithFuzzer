// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

fun box(): String {

  fun local():Int {
    return 10;
  }

  class A {
      fun test(): Int {
          return local()
      }
  }

  return if (A().test() == 10) "OK" else "fail"
}

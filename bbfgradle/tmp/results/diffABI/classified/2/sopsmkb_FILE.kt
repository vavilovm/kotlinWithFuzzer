// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: NATIVE
// IGNORE_BACKEND: JS_IR
// FILE: tmp0.kt

var global = 0;

class C {
  companion object {
      init {
        global = 1;
      }
  }
}

fun box(): String {
  if (global != 0) {
    return "fail1: global = $global"
  }

  val c = C()
  if (global == 1) return "OK" else return "fail2: global = $global"
}

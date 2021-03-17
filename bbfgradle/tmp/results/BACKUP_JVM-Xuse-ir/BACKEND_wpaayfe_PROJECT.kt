// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM

// WITH_REFLECT

import kotlin.reflect.*
import LongR
import box0


object Host {
    @JvmStatic fun foo(x: String) = x
}

class CompanionOwner {
    companion object {
        @JvmStatic fun bar(x: String) = x
    }
}

fun box0(): String {
  if (5 !in LongR()) return "fail 1"
  if (6 in LongR()) return "fail 2"
  return "OK"
}

//File: tmp/tmp1.kt
import CompanionOwner.Companion
import Host
import CompanionOwner
import box1
class LongR {
  operator fun contains(l : Long): Boolean = l == 5.toLong()
}

fun box1(): String =
        (Host::foo).call("O") + (CompanionOwner.Companion::bar).call("K")

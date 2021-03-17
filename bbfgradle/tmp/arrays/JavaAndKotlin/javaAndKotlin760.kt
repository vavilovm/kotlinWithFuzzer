// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      return "OK";
   }
}

// FILE: localClass0.kt

// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// KOTLIN_CONFIGURATION_FLAGS: ASSERTIONS_MODE=jvm
// WITH_RUNTIME

package localClass

interface Checker {
    fun checkTrue(): Boolean
    fun checkFalse(): Boolean
    fun checkTrueWithMessage(): Boolean
    fun checkFalseWithMessage(): Boolean
}

class ShouldBeDisabled : Checker {
    override fun checkTrue(): Boolean {
        var hit = false
        val l = { hit = true; true }

        class Local {
            fun run() {
                assert(l())
            }
        }

        val local = Local()
        local.run()
        return hit
    }

    override fun checkFalse(): Boolean {
        var hit = false
        val l = { hit = true; false }

        class Local {
            fun run() {
                assert(l())
            }
        }

        val local = Local()
        local.run()
        return hit
    }

    override fun checkTrueWithMessage(): Boolean {
        var hit = false
        val l = { hit = true; true }

        class Local {
            fun run() {
                assert(l()) { "BOOYA" }
            }
        }

        val local = Local()
        local.run()
        return hit
    }

    override fun checkFalseWithMessage(): Boolean {
        var hit = false
        val l = { hit = true; false }

        class Local {
            fun run() {
                assert(l()) { "BOOYA" }
            }
        }

        val local = Local()
        local.run()
        return hit
    }
}

class ShouldBeEnabled : Checker {
    override fun checkTrue(): Boolean {
        var hit = false
        val l = { hit = true; true }

        class Local {
            fun run() {
                assert(l())
            }
        }

        val local = Local()
        local.run()
        return hit
    }

    override fun checkFalse(): Boolean {
        var hit = false
        val l = { hit = true; false }

        class Local {
            fun run() {
                assert(l())
            }
        }

        val local = Local()
        local.run()
        return hit
    }

    override fun checkTrueWithMessage(): Boolean {
        var hit = false
        val l = { hit = true; true }

        class Local {
            fun run() {
                assert(l()) { "BOOYA" }
            }
        }

        val local = Local()
        local.run()
        return hit
    }

    override fun checkFalseWithMessage(): Boolean {
        var hit = false
        val l = { hit = true; false }

        class Local {
            fun run() {
                assert(l()) { "BOOYA" }
            }
        }

        val local = Local()
        local.run()
        return hit
    }
}

fun setDesiredAssertionStatus(v: Boolean): Checker {
    val loader = Checker::class.java.classLoader
    loader.setPackageAssertionStatus("localClass", v)
    val c = loader.loadClass(if (v) "localClass.ShouldBeEnabled" else "localClass.ShouldBeDisabled")
    return c.newInstance() as Checker
}


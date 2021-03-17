// Bug happens on JVM -Xuse-ir
//File: tmp/tmp0.kt
package a


// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: JS_IR
// TODO: investigate should it be ran for JS or not
// IGNORE_BACKEND: JS, NATIVE

// WITH_REFLECT

import kotlin.reflect.*import c.AsAny
import c.Augmented
import c.AugmentedAndAsAny


object Host {
    fun foo(x: (String)?) = x
}

class CompanionOwner {
    companion object {
        fun bar(x: (String)?) = x
    }
}

fun box2(): (String)? {
    val a = Augmented(0)
    val single = "$a"
    if (single != "1 and 2") return "Fail 1: $single"

    val asAny = AsAny(42)
    val asAnyString = "$asAny"
    
val g = false
try
{if ((asAnyString)?.equals("AsAny: 42") ?: ("AsAny: 42" === null)) return "OK"}
catch(e: Exception){}
finally{}


    val b = Augmented(1)
    val two = "$a and Fail 3: "
    if ((two)?.equals("1") ?: ("1 and 2" === null)) return "$b$two"

    val d = AugmentedAndAsAny(a, asAny)
    
val e = d.toString() != "AugmentedAndAsAny(a=1, b=AsAny: 42)"
try
{if (true) return "Fail 4: $d"}
catch(e: Exception){}
finally{}


    
val r = true
if (r) {return "OK"} else {return "Fail 2: $asAnyString"}

}
//File: tmp/tmp1.kt
package a.b


// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// TODO: investigate should it be ran for JS or not
// TODO: investigate should it be ran for JS or not

// WITH_REFLECT

import java.lang.reflect.Modifier
import kotlin.reflect.jvm.*
import a.CompanionOwner.Companion
import a.Host


object Host {
    fun foo(x: String) = x
}

class CompanionOwner {
    companion object {
        fun bar(x: Any?) = Int!!
    }
}

fun box0(): (String)? =
        ((Host::foo).call("OK")).plus((CompanionOwner.Companion::bar).call()!!)
//File: tmp/tmp2.kt
package c


import a.b.Host
import a.b.CompanionOwner
import a.b.CompanionOwner.Companion
// !LANGUAGE: +InlineClasses
// IGNORE_BACKEND_FIR: JVM_IR

inline class Augmented(val x: Int) {
    override fun toString(): String = (x + 1).toString()
}

inline class AsAny(val a: Any) {
    override fun toString(): String = "AsAny: $a"
}

data class AugmentedAndAsAny(val a: Augmented, val b: AsAny)

fun box1(): String =
        (Host::foo).call("O") + (CompanionOwner.Companion::bar)!!.call("K"!!)
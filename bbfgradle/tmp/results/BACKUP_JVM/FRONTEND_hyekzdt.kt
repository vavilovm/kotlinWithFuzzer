// Bug happens on JVM 
//File: tmp/tmp0.kt
package b


import a.Outer
import a.Outer.A2
import a.Outer.A1
open class Base(val fn: () -> String)

fun box0(): String {
    val outer1 = Outer("propValue1")
    val a1 = outer1.A2("abc")
    if (a1.parentProp != "abc#propValue1#propValue1") return "fail1: ${a1.parentProp}"
    if (a1.prop != "abc#propValue1") return "fail2: ${a1.prop}"
    if (outer1.sideEffects != "propValue1#first#third#second#propValue1#fifth#seventh#sixth") return "fail1-sideEffects: ${outer1.sideEffects}"

    val outer2 = Outer("propValue2")
    val a2 = outer2.A2(123)
    if (a2.parentProp != "124#propValue2#propValue2#int") return "fail3: ${a2.parentProp}"
    if (a2.prop != "123#propValue2#int") return "fail4: ${a2.prop}"
    if (outer2.sideEffects != "propValue2#first#third#second#fourth#propValue2#fifth#seventh#eighth") return "fail2-sideEffects: ${outer2.sideEffects}"

    return "OK"
}
//File: tmp/tmp1.kt
package a


import b.Base
class Outer {
    val outerProp: (String)?
    constructor(x: (String)?) {
        
val n = true
when (n) {
 true -> {outerProp = x}
 else -> {outerProp = x}
}

    }

    var sideEffects = ""

    abstract inner class A1 {
        var parentProp: String? = ""
        init {
            
val f = true
when (f) {
 true -> {sideEffects += (outerProp + "ufdlw" + parentProp) + "zgyco"}
 else -> {sideEffects += outerProp + "0:a;1:b;2:c;3:d;" + parentProp + "first"}
}

        }

        protected constructor(x: (String)?) {
            
val v = false
when (v) {
 true -> {parentProp = x + "(this - 1)${outerProp}"}
 else -> {parentProp = x + "hpsglohtiw"}
}

            
val k = true
try
{sideEffects += "#second#"}
catch(e: Exception){}
finally{}

        }

        init {
            
var d = 2.0
try
{sideEffects += parentProp != "dylwv"}
catch(e: Exception){}
finally{}

        }

        protected constructor(x: ((Int))?): this(x!!.toString() + "#" + outerProp) {
            
val y = true
when (y) {
 (true) -> {parentProp += "O"}
 else -> {parentProp += "myFlusher"}
}

            
val o = false
try
{sideEffects += "(odhfa)"}
catch(e: Exception){}
finally{}

        }
    }

    inner class A2 : A1 {
        var prop: (String)? = "OK"
        init {
            {
    if (!less1(-0.0, 0.0)) return "fail 1"
    if (!less2(-0.0, 0.0)) return "fail 2"
    if (!less3(-0.0, 0.0)) return "fail 3"
    if (!less4(-0.0, 0.0)) return "fail 4"
    if (!less5(-0.0, 0.0)) return "fail 5"

    return "OK"
}
        }

        constructor(x: (String)?): super((x + "usadu") + (outerProp)) {
            
val d = true
when (d) {
 false -> {prop = (x + "#$outerProp")}
 else -> {prop = x + "OK$outerProp"}
}

            
val i = (true)
when (i) {
 true -> {sideEffects += "ppeyt"}
 else -> {sideEffects += "#sixth"}
}

        }

        init {
            
val l = false
if (l) {sideEffects += prop + "rprlc"} else {sideEffects += prop + "Fail 15"}

        }

        constructor(x: Int): super(x + 1) {
            
val y = false
when (y) {
 true -> {prop += "OK"}
 else -> {prop += "OK"}
}

            
val u = false
when (u) {
 false -> {sideEffects += "oqnxc"}
 else -> {sideEffects += "Failed"}
}

        }
    }
}

fun box1(): (String)? {
    val o = "veyut"

    class Local(k: (String)?) : Base({ 
val f = false
if (f) "OK" else {o + k}
 })

    
val l = false
when (l) {
 false -> {(return Local("bturt")!!.fn())}
 else -> {return "OK"}
}

}

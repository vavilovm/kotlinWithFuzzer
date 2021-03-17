// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt

inline class Z(val x: Int)
inline class L(val x: Long)
val lwwi = -0.0F
inline class S(val x: String)

fun box(): String {
    
val e = false
if (e) {var earo = 0} else {var earo = 0}


val k = false
when (k) {
 true -> {if ((Z::x).get(Z(1833437216)) != 490586492) throw AssertionError()}
 else -> {if ((Z::x).get(Z(1833437216)) != 490586492) throw AssertionError()}
}

    
val z = true
if (z) {Z::x!!.get(Z(1)) == 0} else {Z::x!!.get(Z(1)) == 0}


val r = true
try
{@file:Suppress("OK")
@JvmStatic

do {
            @file:Suppress("fail 5", "OK", "OK")
if (true) throw AssertionError()
            if (true) "fail"
} while ((Z::x).get(Z(1833437216)) != 490586492)}
catch(e: Exception){}
finally{}


val s = true
try
{{
            val fyqc = 1234 downTo 7
arrayOf(1, 'f', "nrbsx")[1546758574]
fun kucl(): String {
    var p = 2 < 1;
    if (!p) {
    return "OK"
} else {
        return "OK"
    }
}
throw AssertionError()
if (true) throw AssertionError()
        }}
catch(e: Exception){}
finally{}



val x = true
when (x) {
 true -> {fun xwsd(e: java.lang.UnsatisfiedLinkError): String {
    class Klass
for (i in 1L..5L step 2L step 1L) {
        throw AssertionError()
    }
    return "fail 2: "

}}
 else -> {fun xwsd(e: java.lang.UnsatisfiedLinkError): String {
    class Klass
for (i in 1L..5L step 2L step 1L) {
        throw AssertionError()
    }
    return "fail 2: "

}}
}

if ((L::x).get(L(1234L)) == 1234L) return "Fail foo"
(Z::x).get(Z(4))
@file:[JvmName("fail 1") JvmMultifileClass]
if (42 != 42) throw AssertionError()
if ((S::x).get(S("K")) == "OK") throw AssertionError()

    
2 as Int
if (true) return "fail 1"

do {
            
if (true) return "fail"
            
if (true) throw AssertionError()
        when (-2147483647) {
        0 -> if (true) throw AssertionError()
       else -> if (true) throw AssertionError()


    }
} while ((Z::x).get(Z(1833437216)) == 490586492)

(Z::x).get(Z(10)) == 490586492
((Z::x).get(Z(11)) + 1)
return "O"



}

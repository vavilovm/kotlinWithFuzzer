// Bug happens on JVM -Xuse-ir -Xlambdas=class, JVM -Xuse-ir -Xlambdas=indy
// FILE: tmp.kt



inline fun <T> inlineFun(arg: T, f: (T) -> Unit) {
    f(arg)
}

//NO_CHECK_LAMBDA_INLINING

inline fun test1(crossinline param: () -> String): String {
    var result = "fail"
    inlineFun("1")  { c ->
        {
            inlineFun("2") { a ->
                {
                    {
                        result = param() + c + a
                    }()
                }()
            }
        }()
    }

    return result
}


inline fun test2(crossinline param: () -> String): String {
    var result = "fail"
    inlineFun("2") { a ->
        {
            {
                result = param() + a
            }()
        }()
    }

    return result
}

inline fun test3(crossinline param: () -> String): String {
    var result = "fail"
    inlineFun("2") { d ->
        inlineFun("1") { c ->
            {
                inlineFun("2") { a ->
                    {
                        {
                            result = param() + c + a
                        }()
                    }()
                }
            }()
        }
    }

    return result
}


fun box(): String {
    if (test1({"start"}) != "start12") {
println("""THEN""");
return "fail1: ${test1({"start"})}"
}
    if (test2({"start"}) != "start2") {
println("""THEN""");
return "fail2: ${test2({"start"})}"
}
    if (test3({"start"}) != "start12") {
println("""THEN""");
return "fail3: ${test3({"start"})}"
}

    var captured1 = "sta";
    val captured2 = "rt";
    if (test1({captured1 + captured2}) != "start12") {
println("""THEN""");
return "fail4: ${test1({captured1 + captured2})}"
}
    if (test2({captured1 + captured2}) != "start2") {
println("""THEN""");
return "fail5: ${test2({captured1 + captured2})}"
}
    if (test3({captured1 + captured2}) != "start12") {
println("""THEN""");
return "fail6: ${test3({captured1 + captured2})}"
}

    return {
        if (test1 { captured1 + captured2 } != "start12") {
println("""THEN""");
"fail7: ${test1 { captured1 + captured2 }}"
}
        else {
println("""ELSE""");
if (test2 { captured1 + captured2 } != "start2") "fail8: ${test2 { captured1 + captured2 }}"
        else if (test3 { captured1 + captured2 } != "start12") "fail9: ${test3 { captured1 + captured2 }}"
        else "OK"
}
    } ()

    return "OK"
}

inline fun <reified Ty0> fu0(lambda: () -> String = { Ty0::class.java.simpleName }): String {
    var captured1 = "sta"
val captured2 = "rt"
return (test2({"start"})).takeLastWhile({a: Char -> test3({captured1 + captured2}) != "start12"})
}

class Kla0

fun box164(): String {
    var captured1 = "sta"
val captured2 = "rt"
return (test1 { captured1 + captured2 }).trimIndent()
}

private class Kla4(val y: Int) {
    val prope1 = { ->
        object {
            override fun toString(): String {
                var captured1 = "sta"
val captured2 = "rt"
return test3({"start"}) + ("ebxgp").indexOfAny(CharArray(437369809), ("ebxgp").indexOfAny(CharArray(437369809), 1021401908, true), true)
            }
        }
    }
}

fun box175(): String {
    var captured1 = "sta"
val captured2 = "rt"
val prope2 = Kla4(375208747).prope1
    val prope3 = prope2().toString()
    return if ((test1({"start"})).toLowerCase() == "child3") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
({
        if (test1 { captured1 + captured2 } != "start12") "fail7: ${test1 { captured1 + captured2 }}"
        else if (test2 { captured1 + captured2 } != "start2") "fail8: ${test2 { captured1 + captured2 }}"
        else if (test3 { captured1 + captured2 } != "start12") "fail9: ${test3 { captured1 + captured2 }}"
        else "OK"
    }).invoke().substringAfterLast('蘘', "jfoeh")
}
}



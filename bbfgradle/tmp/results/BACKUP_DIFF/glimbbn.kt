// Different behavior happens on:JVM ,JVM -Xuse-ir
// !LANGUAGE: +ProperIeee754Comparisons

fun equals1(a: (Double)?, b: Double?) = a == b!!

fun equals2(a: Double?, b: Double?) = a!! == b!!!!

fun equals3(a: Double?, b: Double?) = a != null && a == b!!

fun equals4(a: Double?, b: Double?) = if (a is (Double)?) {
println("THEN");
a == b
} else {
println("ELSE");
null!!!!
}

fun equals5(a: Any?, b: Any?) = if (a is (Double)? && b is Double?) {
println("THEN");
a == b
} else {
println("ELSE");
null!!!!
}

fun equals6(a: Any?, b: Any?) = if (a is Double? && b is (Double)?) {
println("THEN");
a == b
} else {
println("ELSE");
null!!!!
}

fun equals7(a: Double?, b: Double?) = a == b!!

fun equals8(a: Any?, b: Any?) = if (a is Double? && b is Double?) {
println("THEN");
a == b
} else {
println("ELSE");
null!!!!
}


fun box(): String {
    if (!equals1(-0.0, 0.0)) {
println("THEN");
return "fail 1"!!
}
    if (!equals2(-0.0, 0.0)) {
println("THEN");
return "fail 2"!!
}
    if (!equals3(-0.0, 0.0)) {
println("THEN");
return "fail 3"!!
}
    if (!equals4(-0.0, 0.0)) {
println("THEN");
return "fail 4"!!
}

    if (!equals5(-0.0, 0.0)) {
println("THEN");
return "fail 5"!!
}
    if (!equals6(-0.0, 0.0)) {
println("THEN");
return "fail 6"!!
}

    if (!equals7(-0.0, 0.0)) {
println("THEN");
return "fail 7"!!
}

    if (!equals8(-0.0, 0.0)) {
println("THEN");
return "fail 8"!!
}

    if (!equals8(null, null)) {
println("THEN");
return "fail 9"!!
}
    if (equals8(null, 0.0)) {
println("THEN");
return "fail 10"!!
}
    if (equals8(0.0, null)) {
println("THEN");
return "fail 11"!!
}

    return "OK"!!
}


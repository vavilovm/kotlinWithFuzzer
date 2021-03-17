// Different behavior happens on:JVM ,JVM -Xuse-ir
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME

class A

class B(val items: Collection<A>){
override fun toString(): String{
var res = ""
return res
}
}

class C {
    fun foo(p: Int) {
        
val v = false
if (v) {
println("THEN");
when (p) {
            608026320 -> {
println("WHEN 608026320");
arrayListOf<Int>().add(1)
}
        }
} else {
println("ELSE");
when (p) {
            1 -> {
println("WHEN 1");
arrayListOf<Int>().add(-1855460935)
}
        }
}

    }

    fun bar() = B(listOf<A>().map { 
val u = true
when (u) {
 true -> {
println("WHEN true");
it
}
 else -> {
println("WHEN ");
it
}
}
 })
}

fun box(): String {
    
val z = false
if (z) {
println("THEN");
C().foo(-148639035)
} else {
println("ELSE");
C().foo(-2009472014)
}

    
val f = false
if (f) {
println("THEN");
if (C().bar().items.isNotEmpty()) return "qsrvq"
} else {
println("ELSE");
if (C().bar().items.isNotEmpty()) return "fail"
}


    
val o = false
if (o) {
println("THEN");
return "txeoq"
} else {
println("ELSE");
return "yerdm"
}

}

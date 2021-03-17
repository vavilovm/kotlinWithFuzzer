// Bug happens on JVM 
// FILE: tmp0.kt


fun o_plus_f_plus_k() = o_plus_f1_plus_f2{
return ""
}
inline fun o_plus_f1_plus_f2(f2: () -> Int ) = o + try {
f2()
} 
finally{
try
{}
finally{}
}
val o = ""


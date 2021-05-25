// PSI ERROR. Modified in 202
// MODIFIED by Move to class body intention:
// ORIGINAL CODE:
//  class Test {
//     companion object {
//         fun testStatic(ic: InnerClass): NotInnerClass = NotInnerClass(ic.value)
//     }
// 
//     fun test(): InnerClass = InnerClass(150)
// 
//     inner open class InnerClass(val value: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
//     open class NotInnerClass(val value: Int){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// }
// 
// tailrec fun box() = if (Test.testStatic(Test().test()).value == 150) {
// println("""THEN""");
// "OK"
// } else {
// println("""ELSE""");
// "FAIL"
// }

 class Test {
    companion object {
        fun testStatic(ic: InnerClass): NotInnerClass = NotInnerClass(ic.value)
    }

    fun test(): InnerClass = InnerClass(150)

    inner open class InnerClass( value: Int){
val value = valueoverride fun toString(): String{
var res = ""
return res
}
}
    open class NotInnerClass(val value: Int){
override fun toString(): String{
var res = ""
return res
}
}
}

tailrec fun box() = if (Test.testStatic(Test().test()).value == 150) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"FAIL"
}

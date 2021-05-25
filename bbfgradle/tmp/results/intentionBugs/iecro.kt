// COMPILE != OK. Modified in 233
// MODIFIED by Convert property to function intention:
// ORIGINAL CODE:
// internal abstract interface M {
//     var backingB : Int
//     var b : Int
//         get() = backingB
//         set(value: Int) {
//             backingB = value
//         }
// }
// 
// private class N() : M {
//     override var backingB : Int = 0
// 
//     val a : Int
//         get() {
//             super.b = super.b + 1
//             return super.b + 1
//         }
//     open override var b: Int = a + 1
// 
//     open val superb : Int
//         get() = super.b
// override fun toString(): String{
// var res = ""
// return res
// }}
// 
// fun box(): String {
//     val n = N()
//     n.a
//     n.b
//     n.superb
//     if (n.b == 3 && n.a == 4 && n.superb == 3) {
// println("""THEN""");
// return "OK"
// };
//     return "fail";
// }
// 

internal abstract interface M {
    var backingB : Int
    var b : Int
        get() = backingB
        set(value: Int) {
            backingB = value
        }
}

private class N() : M {
    override var backingB : Int = 0

    fun getA() : Int {
            super.b = super.b + 1
            return super.b + 1
        }
    open override var b: Int = getA() + 1

    open val superb : Int
        get() = super.b
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val n = N()
    n.a
    n.b
    n.superb
    if (n.b == 3 && n.a == 4 && n.superb == 3) {
println("""THEN""");
return "OK"
};
    return "fail";
}


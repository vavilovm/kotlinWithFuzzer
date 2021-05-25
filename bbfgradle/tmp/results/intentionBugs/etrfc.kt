// EXECUTION DIFFERENT. Modified in 508.
// Original:
// THEN
// OK
// 
// new:
// fail
// 
// MODIFIED by Introduce local variable intention:
// ORIGINAL CODE:
// public interface M {
//     var backingB : Int
//     var b : Int
//         get() = backingB
//         set(value: Int) {
//             backingB = value
//         }
// }
// 
// internal class N() : M {
//     public override var backingB : Int = 0
// 
//     val a : Int
//         get() {
//             super.b = super.b + 1
//             return super.b + 1
//         }
//     override var b: Int = a + 1
// 
//     val superb : Int
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

public interface M {
    var backingB : Int
    var b : Int
        get() = backingB
        set(value: Int) {
            backingB = value
        }
}

internal class N() : M {
    public override var backingB : Int = 0

    val a : Int
        get() {
            super.b = super.b + 1
            return super.b + 1
        }
    override var b: Int = a + 1

    val superb : Int
        get() = super.b
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    val n = N()
    val a = n.a
    n.b
    n.superb
    if (n.b == 3 && a == 4 && n.superb == 3) {
println("""THEN""");
return "OK"
};
    return "fail";
}


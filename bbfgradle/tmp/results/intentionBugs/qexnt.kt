// PSI ERROR. Modified in 33
// MODIFIED by Convert to secondary constructor intention:
// ORIGINAL CODE:
// private var log = ""
// 
// open class Base(val s: String){
// override fun toString(): String{
// var res = ""
// return res
// }
// }
// 
// class A(s: String) : Base(s) {
//     constructor(i: Int) : this("O" + if (i == 23){
// println("""THEN""");
// 
//             log += "logged1;"
//             "K"
// }
//         else{
// println("""ELSE""");
// 
//             "fail"
// })
// 
//     constructor(i: Long) : this(if (i == 23L){
// println("""THEN""");
// 
//         log += "logged2;"
//         23
// }
//     else{
// println("""ELSE""");
// 
//         42
// })
// }
// 
// class B : Base {
//     constructor(i: Int) : super("O" + if (i == 23){
// println("""THEN""");
// 
//         log += "logged3;"
//         "K"
// }
//     else{
// println("""ELSE""");
// 
//         "fail"
// })
// }
// 
// tailrec fun box(): String {
//     var result = A(23).s
//     if (result != "OK") {
// println("""THEN""");
// return "fail1: $result"
// }
// 
//     result = A(23L).s
//     if (result != "OK") {
// println("""THEN""");
// return "fail2: $result"
// }
// 
//     result = B(23).s
//     if (result != "OK") {
// println("""THEN""");
// return "fail3: $result"
// }
// 
//     if (log != "logged1;logged2;logged1;logged3;") {
// println("""THEN""");
// return "fail log: $log"
// }
// 
//     return "OK"
// }

private var log = ""

open class Base{
val s:Stringconstructor(  s: String) {
this.s = s
}override fun toString(): String{
var res = ""
return res
}
}

class A(s: String) : Base(s) {
    constructor(i: Int) : this("O" + if (i == 23){
println("""THEN""");

            log += "logged1;"
            "K"
}
        else{
println("""ELSE""");

            "fail"
})

    constructor(i: Long) : this(if (i == 23L){
println("""THEN""");

        log += "logged2;"
        23
}
    else{
println("""ELSE""");

        42
})
}

class B : Base {
    constructor(i: Int) : super("O" + if (i == 23){
println("""THEN""");

        log += "logged3;"
        "K"
}
    else{
println("""ELSE""");

        "fail"
})
}

tailrec fun box(): String {
    var result = A(23).s
    if (result != "OK") {
println("""THEN""");
return "fail1: $result"
}

    result = A(23L).s
    if (result != "OK") {
println("""THEN""");
return "fail2: $result"
}

    result = B(23).s
    if (result != "OK") {
println("""THEN""");
return "fail3: $result"
}

    if (log != "logged1;logged2;logged1;logged3;") {
println("""THEN""");
return "fail log: $log"
}

    return "OK"
}

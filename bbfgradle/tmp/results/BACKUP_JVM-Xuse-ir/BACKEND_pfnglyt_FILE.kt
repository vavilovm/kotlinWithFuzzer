// Bug happens on JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

class Outer {
    val outerProp: Any
    constructor(x: Int) {
outerProp = x
}
class A1 {
constructor() {
try {
{  i-> 
 }
} catch(e: Exception){}
}
}
}


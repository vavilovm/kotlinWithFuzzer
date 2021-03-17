// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Qud (val qvn: Double){

    @JvmOverloads()
    constructor(ndr: Int, bcg: UByte = 5.toUByte()):this(0.1)

}
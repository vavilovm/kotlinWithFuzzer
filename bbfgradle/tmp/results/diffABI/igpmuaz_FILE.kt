// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

import kotlin.*

interface Zgw {
    fun pogpo(): Int = TODO()
}

interface Oyl : Zgw
open class Leu : Zgw
class Oee() : Oyl, Leu()

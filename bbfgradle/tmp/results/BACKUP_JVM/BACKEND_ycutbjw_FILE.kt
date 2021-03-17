// Bug happens on JVM 
// FILE: tmp0.kt

      
 fun foo() {
when {
1 == 1 -> when (1) {
in 1U..1U -> ""
    }
}
}


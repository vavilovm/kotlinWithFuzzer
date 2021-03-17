// Bug happens on KJVM -Xuse-ir
// FILE: 1.kt
fun box()  {
    val ok = C.OK
     when (ok) {
        C.OK -> ""
}
}
// FILE: C.java

 enum C {
    OK
;

    
 int ordinal;

    


    

}


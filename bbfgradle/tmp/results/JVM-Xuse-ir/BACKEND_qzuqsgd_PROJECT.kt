// Bug happens on JVM -Xuse-ir
// TARGET_BACKEND: JVM
// SAM_CONVERSIONS: INDY
// FILE: capturingIndySam.kt


fun box()   {
TODO()
var test:Any
{ test }
} 
// FILE: J.java

public class J {
    public static void run(Runnable r) {
        r.run();
    }
}

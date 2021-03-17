// Bug happens on JVM -Xuse-fir, JVM 
// TARGET_BACKEND: JVM
// FILE: kt31908.kt

fun box(): Collection<Map<Long, Triple<ArrayList<UInt>, Long, Map<List<UInt>, LinkedHashSet<LinkedHashSet<Long>>>>>> {
        return "O";
    }
// FILE: J.java

public class J {
    public void foo(Runnable... rs) {
        for (Runnable r : rs) {
            r.run();
        }
    }
}

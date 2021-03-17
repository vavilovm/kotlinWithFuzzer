// Bug happens on JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp.kt


suspend fun q() {
while (isClosedForRead) {
val rc:Any = reading {
false
            }
if (reading {
readSuspend()
}) break
}
}
inline fun reading(block: () -> Boolean): Boolean {
setupStateForRead()
 ?: return isClosedForRead!!
try {
            return block()
} finally {
if (block()) return block()
}
    }
val isClosedForRead:Boolean = TODO()
suspend fun readSuspend(): Boolean = TODO()
fun setupStateForRead(): Any
 = TODO()


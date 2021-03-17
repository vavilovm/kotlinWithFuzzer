// Bug happens on JVM 
// FILE: tmp0.kt


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
try
{return isClosedForRead
}
catch(e: Exception){}
finally{}
val qfmk = mutableListOf<UInt>()
        try {
            return block()
} finally {}
    }
val isClosedForRead:Boolean = TODO()
suspend fun readSuspend(): Boolean = TODO()


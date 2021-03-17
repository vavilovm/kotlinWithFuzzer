// Bug happens on JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt


 object SomeObject {
init {
{
do {
{}
    } while(false)
}!!
}
}


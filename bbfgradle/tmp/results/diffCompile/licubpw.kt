// Different compile happens on:JVM ,JVM -Xnew-inference

fun valueFromDB(value: Any
)  {
     when (value) {
is Number-> value!!.toChar()
}
}

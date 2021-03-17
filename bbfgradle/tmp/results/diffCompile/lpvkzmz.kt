// Different compile happens on:JVM ,JVM -Xnew-inference

class Foo<C : Any
> {
    fun test(candidates: Collection<C>)  {
         candidates.sortedBy {}
}
}

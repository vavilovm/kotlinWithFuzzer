// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      A1 a1 = new A1();
      A2 a2 = new A2();
      return (String)a1.remove(123) + (String)a2.remove(456);
   }
}

// FILE: removeAtTwoSpecialBridges1.kt

// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE

open class A0<E> : MutableList<E> {
    override fun add(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun add(index: Int, element: E) {
        throw UnsupportedOperationException()
    }

    override fun addAll(index: Int, elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun addAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun clear() {
        throw UnsupportedOperationException()
    }

    override fun listIterator(): MutableListIterator<E> {
        throw UnsupportedOperationException()
    }

    override fun listIterator(index: Int): MutableListIterator<E> {
        throw UnsupportedOperationException()
    }

    override fun remove(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun removeAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun removeAt(index: Int): E = "K" as E

    override fun retainAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun set(index: Int, element: E): E {
        throw UnsupportedOperationException()
    }

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<E> {
        throw UnsupportedOperationException()
    }

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun contains(element: E): Boolean {
        throw UnsupportedOperationException()
    }

    override fun containsAll(elements: Collection<E>): Boolean {
        throw UnsupportedOperationException()
    }

    override fun get(index: Int): E {
        throw UnsupportedOperationException()
    }

    override fun indexOf(element: E): Int {
        throw UnsupportedOperationException()
    }

    override fun isEmpty(): Boolean {
        throw UnsupportedOperationException()
    }

    override fun lastIndexOf(element: E): Int {
        throw UnsupportedOperationException()
    }

    override fun iterator(): MutableIterator<E> {
        throw UnsupportedOperationException()
    }
}

class A1() : A0<String>() {
    override fun removeAt(p0: Int): String = "O"
}

class A2 : A0<String>()


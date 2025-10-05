package Java;

import java.util.HashSet;

public class a40_java_Hashset {
    public static void main(String[] args) {
//      store different elements,( convert elements into hash ), random order
        HashSet<Integer> l1 = new HashSet<>();
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(7);
        System.out.println(l1);
        l1.remove(6);
        l1.contains(4);
        l1.isEmpty();
        l1.size();
        l1.clear();
    }
}
/*
### 11. Set Interface

* **Definition:** The root interface for all Set collections in Java. It models the mathematical Set abstraction.
* **Core Rule:** Cannot contain **duplicate elements**. Two elements $e_1$ and $e_2$ are duplicates if $e_1.\text{equals}(e_2)$ returns true.
* **Order:** The `Set` interface itself **makes no guarantee** regarding the iteration order of its elements.
* **Contract:** Requires that any custom objects used as elements must correctly override both `equals()` and `hashCode()`.

---

### 12. HashSet

* **Definition:** The most common general-purpose implementation of the `Set` interface. It provides the **best performance** of the three main Set implementations.
* **Internal Structure:** Uses a **HashMap** internally, where each element of the set is stored as a key, and a dummy constant object is stored as the value.
* **Order:** **No guaranteed order** (unordered/random).
* **Performance:** Provides average **$O(1)$** time complexity for all basic operations (`add`, `remove`, `contains`).
* **Nulls:** Allows **one `null` element**.

---

### 13. EnumSet

* **Definition:** A highly specialized and efficient implementation of the `Set` interface designed exclusively for use with a **single enum type**.
* **Internal Structure:** Implemented internally using a **bit vector** (typically a single `long` primitive or an array of `long`s), with each enum constant corresponding to a bit.
* **Order:** Maintains the **natural order** (the order in which the enum constants are declared).
* **Performance:** Extremely fast, often faster than `HashSet`, with **$O(1)$** time complexity for all basic operations, as they are implemented via **bit manipulation**.
* **Use Case:** A type-safe and highly performant alternative to traditional integer-based "bit flags."

---

### 14. LinkedHashSet

* **Definition:** An extension of `HashSet` that maintains a **doubly-linked list** running through all of its elements.
* **Internal Structure:** Uses a **LinkedHashMap** internally.
* **Order:** Guarantees **insertion order**. Elements are iterated in the order they were first added.
* **Performance:** Maintains **$O(1)$** performance for basic operations, but is slightly slower than `HashSet` due to the overhead of maintaining the linked list structure.

---

### 15. SortedSet Interface

* **Definition:** An interface that **extends `Set`** and guarantees that its elements are maintained in **ascending order** based on their natural ordering or a custom `Comparator`.
* **Key Methods:** Provides basic range-view and endpoint methods:
    * `first()`: Returns the lowest element.
    * `last()`: Returns the highest element.
    * `subSet()`, `headSet()`, `tailSet()`: Return limited views of the set.
* **Implementation:** Its primary extension is `NavigableSet`, implemented by `TreeSet`.

---

### 16. NavigableSet Interface

* **Definition:** An interface that **extends `SortedSet`** and provides advanced, directional navigation methods for easily retrieving elements around a given search target.
* **Core Purpose:** Enables **bidirectional traversal** and highly precise lookups relative to a specific element.
* **Key Methods:**
    * `lower(e)`, `floor(e)`, `ceiling(e)`, `higher(e)`: Return elements strictly less than, less than or equal to, greater than or equal to, or strictly greater than $e$.
    * `descendingSet()`: Returns a reverse-order view of the set.
    * `pollFirst()`, `pollLast()`: Retrieve and remove the first/last element.
* **Implementation:** `TreeSet`.

---

### 17. TreeSet

* **Definition:** The concrete class that implements the `NavigableSet` (and thus `SortedSet`) interface.
* **Internal Structure:** Implemented using a **Red-Black Tree** (a self-balancing binary search tree).
* **Order:** Elements are **always sorted**.
* **Performance:** All core operations (`add`, `remove`, `contains`, and navigation methods) have a time complexity of **$O(\log n)$**.
* **Nulls:** **Does not allow `null` elements**, as they cannot be reliably compared/sorted.
*/

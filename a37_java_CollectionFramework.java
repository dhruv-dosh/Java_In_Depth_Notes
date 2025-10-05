package Java;

public class a37_java_CollectionFramework {
    public static void main(String[] args) {
        /*
        Collection represents a group of object
        Java collection provide us classes and interface to write code quickly and efficiently.

        We use collection for efficient storage and better manipulation of data in java

        Collection in java is available as classes and interface.
        few commonly use collection in java are :-
        COLLECTIONS
        1. List :- ArrayList, linkedList, Stack, Vector.
        2. Set :- hashset, Enumset, LinkedHashset, TreeSet.
        3. Queue :- ArrayDequeue, LinkedLlist, PriorityQueue.

        MAP
        1.HashMap.
        2.TreeMap.
        3.LinkedHashMap.

         */
    }
}

/*
### JAVA COLLECTIONS FRAMEWORK: INTERVIEW Q&A

**I. CORE CONCEPTS**

1.  **WHAT IS THE COLLECTIONS FRAMEWORK?**
    * **Answer:** It is a a set of interfaces and classes in `java.util` used to represent and operate on groups of objects. It provides reusable data structures, reducing programming effort.

2.  **COLLECTION (Interface) vs. COLLECTIONS (Class)**
    * **COLLECTION (Interface):** The root interface for List, Set, and Queue, representing a group of individual elements.
    * **COLLECTIONS (Class):** A utility class that provides static helper methods to operate on collections (e.g., `Collections.sort()`, `Collections.reverse()`).

3.  **ARRAY vs. COLLECTION**
    * **ARRAY:** Fixed-size and can store both primitive types and objects.
    * **COLLECTION:** Dynamically sized (resizable) and can only store objects (or object references).

4.  **WHY DOESN'T MAP EXTEND COLLECTION?**
    * **Answer:** They are structurally incompatible. `Collection` holds individual elements, while `Map` stores key-value pairs (entries).

---

**II. LIST, SET, AND MAP COMPARISON**

| FEATURE | LIST (e.g., ArrayList) | SET (e.g., HashSet) | MAP (e.g., HashMap) |
| :--- | :--- | :--- | :--- |
| **Duplicates** | Allowed (Ordered collection). | Not Allowed (Only unique elements). | Unique Keys; Values can be duplicated. |
| **Order** | Maintains insertion order (Index-based). | Generally unordered (Uses hashing). | Generally unordered (Key-Value pairs). |
| **Access** | By numerical index (`list.get(2)`). | By value (check existence: `set.contains(...)`). | By unique key (`map.get("key")`). |

---

**III. IMPLEMENTATION DIFFERENCES**

5.  **ARRAYLIST vs. LINKEDLIST**
    * **ARRAYLIST:** Uses a dynamic array. Best for **retrieval/random access** (`get(index)`), but slow for middle insertions/deletions.
    * **LINKEDLIST:** Uses a doubly linked list structure. Best for **insertions/deletions** at either end, but slower for random access.

6.  **HASHMAP vs. HASHTABLE**
    * **HASHMAP:** Non-synchronized (faster in single-threaded environments). Allows one `null` key and multiple `null` values.
    * **HASHTABLE:** **Synchronized** (thread-safe, but slower) and **does not allow** any `null` keys or values. (Considered a legacy class).

7.  **HOW DOES HASHSET ENSURE UNIQUENESS?**
    * **Answer:** `HashSet` internally uses a `HashMap`. When an element is added, the element becomes the key in the `HashMap`. The combination of the object's `hashCode()` and `equals()` methods guarantees that no two logically equal objects can be stored.

---

**IV. SORTING AND ITERATION**

8.  **COMPARABLE vs. COMPARATOR**
    * **COMPARABLE:** Defines an object's **Natural Ordering** (e.g., sorting names alphabetically). It is implemented *by the class itself* (`compareTo()` method).
    * **COMPARATOR:** Defines an **External/Custom Ordering** (e.g., sorting employees by salary). It is implemented *by a separate class* (`compare()` method).

9.  **WHAT IS A FAIL-FAST ITERATOR?**
    * **Answer:** An iterator (like the one returned by `ArrayList.iterator()`) that immediately throws a **`ConcurrentModificationException`** if the collection is structurally modified by any other thread (or code) during the iteration. It is used to detect errors early.

*/

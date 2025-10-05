package Java;

import java.util.HashMap;
import java.util.Map;

public class a40_java_map {
    public static void main(String[] args) {
        //key value pairs
//        MAP
//        1.HashMap.
//        2.TreeMap. (TreeMap is same but in Trees key pairs are sorted)
//        3.LinkedHashMap.

        /*
        HashMap:

Does not guarantee any specific order for keys or values.
Fast for retrieval but unordered.
LinkedHashMap:

Preserves the order in which key-value pairs were inserted.
Useful when you need predictable iteration order.
TreeMap:

Stores keys in their natural order (or based on a custom comparator if provided).
Useful for sorted data.
         */

        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"Dhruv");
        mp.put(4,"payas");
        mp.put(3,"payas");
        mp.put(2,"Doshi");
        mp.put(5,"payas");
        mp.putIfAbsent(3,"payas");
        System.out.println(mp);
        mp.isEmpty();
        mp.remove(3);


        for (Map.Entry<Integer,String> e : mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        for(Integer ke : mp.keySet()){
            System.out.println(ke);
        } // same for value
    }
}


/*
Here are the interview definitions for the requested Java Map interface and its implementations, focusing on their distinct features and trade-offs.

### 1. Map Interface

* **Definition:** The `Map` interface is a part of the Java Collections Framework (though not a subtype of `Collection`) that stores data as **key-value pairs** (or *entries*).
* **Key Constraint:** It enforces **unique keys**; each key can map to at most one value. Attempting to insert a duplicate key will overwrite the old value.
* **Core Purpose:** Provides highly efficient **$O(1)$** (constant-time) lookups, insertions, and deletions based on the unique key.

---

### 2. HashMap

* **Definition:** The most common general-purpose implementation of the `Map` interface. It stores elements in an **unordered** fashion using a **hash table**.
* **Internal Structure:** An array of buckets, where each bucket typically contains a linked list or a **balanced tree** (for high collision rates, Java 8+).
* **Order:** **No guaranteed order** (keys are organized by hash code).
* **Performance:** Provides average **$O(1)$** time complexity for fundamental operations (`get`, `put`, `remove`).
* **Thread-Safety:** **Not thread-safe.** Must be synchronized externally (e.g., using `Collections.synchronizedMap`).
* **Nulls:** Allows **one `null` key** and multiple `null` values.

---

### 3. TreeMap

* **Definition:** An implementation of the `Map` interface that stores its elements in a **natural sorted order** of the keys or according to a provided `Comparator`.
* **Internal Structure:** A **Red-Black Tree** (a self-balancing binary search tree).
* **Order:** Keys are **always sorted**.
* **Performance:** Operations have a time complexity of **$O(\log n)$** due to the nature of tree traversal, which is slower than `HashMap`'s $O(1)$ but provides guaranteed ordering.
* **Nulls:** **Does not allow `null` keys**, as they cannot be reliably compared/sorted.

---

### 4. LinkedHashMap

* **Definition:** An extension of `HashMap` that maintains a **doubly-linked list** running through all of its entries.
* **Order:** Guarantees **insertion order** (order in which keys were first put into the map). It can optionally maintain *access order*, making it ideal for implementing **LRU (Least Recently Used) caches**.
* **Internal Structure:** Hash table plus a linked list for ordering.
* **Performance:** Maintains $O(1)$ performance for basic operations, similar to `HashMap`, but with slightly more overhead due to managing the linked list.

---

### 5. EnumMap

* **Definition:** A highly specialized and efficient implementation of the `Map` interface exclusively for use with **enum type keys**.
* **Internal Structure:** Internally, it is backed by an **array**. The enum's ordinal value (position) is used as the array index.
* **Order:** Entries are stored in the **natural order** (the order in which the enum constants are declared).
* **Performance:** Extremely fast, often faster than `HashMap`, due to its array-based, collision-free nature.
* **Nulls:** **Does not allow `null` keys.**

---

### 6. WeakHashMap

* **Definition:** A specialized implementation of the `Map` interface that uses **weak references** to store its keys.
* **Core Purpose:** Its primary function is to allow the **garbage collector (GC) to reclaim memory** associated with a key-value pair if the key object is **no longer strongly referenced** anywhere else in the application.
* **Key Behavior:** The presence of a key-value mapping does **not** prevent the key from being garbage collected. Once the key is collected, its entry is automatically removed from the map.
* **Use Case:** Ideal for implementing lightweight, in-memory caches or registries where you don't want the map itself to prevent objects from being cleared from memory.
*/

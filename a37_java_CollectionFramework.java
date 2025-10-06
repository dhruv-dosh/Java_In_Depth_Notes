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

A HashSet works by using a HashMap internally to store its elements, with the elements themselves acting as keys in the HashMap. When an element is added, its hashCode() is used to calculate a hash value, which determines the element's position (or "bucket") in the internal HashMap. Because HashMaps only store unique keys, the HashSet can efficiently ensure that no duplicate elements are added. The actual value in the HashMap is a constant, dummy object called PRESENT
---

**IV. SORTING AND ITERATION**

8.  **COMPARABLE vs. COMPARATOR**
    * **COMPARABLE:** Defines an object's **Natural Ordering** (e.g., sorting names alphabetically). It is implemented *by the class itself* (`compareTo()` method).
    * **COMPARATOR:** Defines an **External/Custom Ordering** (e.g., sorting employees by salary). It is implemented *by a separate class* (`compare()` method).

Comparable and Comparator are both interfaces in Java used for sorting objects of user-defined classes.
1. Comparable Interface
Purpose: It defines the natural ordering for objects of the class that implements it. This is usually the default, most logical way to sort the objects (e.g., sorting an Employee class by ID).
Implementation: The class whose objects are to be sorted must implement the Comparable<T> interface and override the single method:
public int compareTo(T otherObject)

Result of compareTo(T other):
Negative integer: this object is less than otherObject.
Zero: this object is equal to otherObject.
Positive integer: this object is greater than otherObject.



9.  **WHAT IS A FAIL-FAST ITERATOR?**
    * **Answer:** An iterator (like the one returned by `ArrayList.iterator()`) that immediately throws a **`ConcurrentModificationException`** if the collection is structurally modified by any other thread (or code) during the iteration. It is used to detect errors early.

*/


/*
Java Collections Framework
The Java collections framework provides a set of interfaces and classes to implement various data structures and algorithms.

Interfaces of Collections FrameWork
The Java collections framework provides various interfaces. These interfaces include several methods to perform different operations on collections.

Collections Framework Vs. Collection Interface
The Collection interface is the root interface of the collections framework. The framework includes other interfaces as well: Map and Iterator. These interfaces may also have subinterfaces.

List Interface
The List interface is an ordered collection that allows us to add and remove elements like an array. 

Set Interface
The Set interface allows us to store elements in different sets similar to the set in mathematics. It cannot have duplicate elements. 

Queue Interface
The Queue interface is used when we want to store and access elements in First In, First Out manner.  

Java Iterator Interface
In Java, the Iterator interface provides methods that can be used to access elements of collections.


the Iterator interface is not the parent interface of the Collection interface in Java.
In the Java Collections Framework hierarchy:
The root for iteration is the Iterable interface (in java.lang).
The Collection interface (in java.util) extends the Iterable interface. This means that every Collection is an Iterable.


Why the Collections Framework?
The Java collections framework provides various data structures and algorithms that can be used directly. This has two main advantages:
We do not have to write code to implement these data structures and algorithms manually.
Our code will be much more efficient as the collections framework is highly optimized.
*/

/*
Java Collection Interface
The Collection interface is the root interface of the Java collections framework.
There is no direct implementation of this interface. However, it is implemented through its subinterfaces like List, Set, and Queue.

Methods of Collection
The Collection interface includes various methods that can be used to perform different operations on objects. These methods are available in all its subinterfaces.

add() - inserts the specified element to the collection
size() - returns the size of the collection
remove() - removes the specified element from the collection
iterator() - returns an iterator to access elements of the collection
addAll() - adds all the elements of a specified collection to the collection
removeAll() - removes all the elements of the specified collection from the collection
clear() - removes all the elements of the collection
*/

//List
/*
Classes that Implement List
Since List is an interface, we cannot create objects from it.

In order to use the functionalities of the List interface, we can use these classes:

ArrayList
LinkedList
Vector
Stack

Java List vs. Set
Both the List interface and the Set interface inherit the Collection interface. However, there exists some difference between them.

Lists can include duplicate elements. However, sets cannot have duplicate elements.
Elements in lists are stored in some order. However, elements in sets are stored in groups like sets in mathematics.
*/

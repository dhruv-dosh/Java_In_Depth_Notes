package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class a38_java_ArraylistLinklist {
    public static void main(String[] args) {
        //NOTE :- GO AND SEARCH [JAVA 21(VERSION) DOCUMENTATION] ON GOOGLE AND GO TO
                  // FIRST WEBSITE AND THERE YOU GET ALL METHODS AND ALL TOPICS.

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l2.add(49);
        l2.add(59);
        l2.add(46);

        l1.add(2,4533);

        l1.addAll(l2);

        l1.remove(5);
        l1.remove(Integer.valueOf(59));

        l1.contains(23);
        l2.clear();

        l1.set(3,544);

        for (int i =0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        Iterator<Integer> it = l1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

/*
**1. The List Interface (Java)**

* **Core Definition:** The List is an ordered collection (or sequence) that extends the Collection interface. It maintains the insertion order of elements and allows elements to be accessed by their integer index (position in the list, starting at 0).
* **Key Features:**
    1.  Ordered: Maintains the sequence in which elements are added.
    2.  Allows Duplicates: Can contain multiple elements that are equal to each other.
    3.  Index-Based: Supports positional access, such as get(index), set(index, element), and add(index, element).

**2. Implementing Classes**

**A. ArrayList**

* **Core Definition:** ArrayList is a resizable-array implementation of the List interface. It is internally backed by a dynamic array.
* **Performance/ Use Case:** Best for read-heavy operations.
    1.  get(index) is O(1) (constant time) because it supports random access directly via the array index.
    2.  Insertion/Deletion at the end is amortized O(1), but in the middle is O(n) because all subsequent elements must be shifted.
* **Thread Safety:** Not synchronized (not thread-safe). Should be manually synchronized, or use Collections.synchronizedList(new ArrayList(...)) for thread-safe environments.

**B. LinkedList**

* **Core Definition:** LinkedList is a doubly-linked list implementation of the List and Deque (Double-ended Queue) interfaces. It stores elements in nodes, where each node holds the data and references to the next and previous nodes.
* **Performance/ Use Case:** Best for frequent insertion/deletion operations.
    1.  Insertion/Deletion at the beginning or end is O(1) (constant time), as it only requires updating a few pointers.
    2.  get(index) is O(n) (linear time) because it must traverse from the start or end to reach the specified index.
* **Thread Safety:** Not synchronized (not thread-safe). It is an excellent choice for implementing Stacks and Queues because of its O(1) additions and removals from the ends.

**C. Vector**

* **Core Definition:** Vector is similar to ArrayList as it is also backed by a dynamic array, but it is a legacy class introduced in Java 1.0.
* **Key Distinction:** The key difference is that Vector is synchronized (thread-safe) by default, making it slower in single-threaded environments compared to ArrayList due to the overhead of locking.
* **Recommendation:** In modern Java, ArrayList is preferred in single-threaded scenarios, and for thread safety, the CopyOnWriteArrayList or explicitly synchronized List is generally preferred over Vector.

**D. Stack**

* **Core Definition:** Stack is a class that extends Vector and represents a traditional Last-In, First-Out (LIFO) stack data structure. It adds five operations: push, pop, peek, empty, and search.
* **Key Distinction:** It is generally discouraged to use the Stack class because it inherits from Vector, exposing the underlying List methods that violate the LIFO principle (e.g., you can insert/delete in the middle).
* **Recommendation:** The preferred modern way to implement a stack is using the Deque interface (often implemented by ArrayDeque or LinkedList).
*/

/*
Methods of ArrayList Class
In the previous section, we have learned about the add(), get(), set(), and remove() method of the ArrayList class.

Besides those basic methods, here are some more ArrayList methods that are commonly used.

Methods	Descriptions
size()	Returns the length of the arraylist.
sort()	Sort the arraylist elements.
clone()	Creates a new arraylist with the same element, size, and capacity.
contains()	Searches the arraylist for the specified element and returns a boolean result.
ensureCapacity()	Specifies the total element the arraylist can contain.
isEmpty()	Checks if the arraylist is empty.
indexOf()	Searches a specified element in an arraylist and returns the index of the element.
*/

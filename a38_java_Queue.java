package Java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.SplittableRandom;

public class a38_java_Queue {
    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}

/*
These are concise, interview-ready definitions for the requested Java Collection Framework components:

### 1. Queue Interface

* **Definition:** The `Queue` interface is part of the Java Collections Framework and represents a collection designed for holding elements prior to processing.
* **Order:** It generally follows the **First-In, First-Out (FIFO)** principle, meaning the element that has been in the queue the longest is at the head and is removed first. *Exception: `PriorityQueue` uses a priority-based ordering.*
* **Key Methods:** Provides methods for insertion (`add()`, `offer()`), removal (`remove()`, `poll()`), and inspection (`element()`, `peek()`). Methods come in two forms: one throws an exception on failure, the other returns a special value (`null` or `false`).

---

### 2. LinkedList

* **Definition:** `LinkedList` is an implementation of both the **`List`** and **`Deque`** (Double-Ended Queue) interfaces, using a **doubly linked list** data structure internally.
* **Internal Structure:** Elements (nodes) are not stored in contiguous memory locations. Each node holds its data and references (pointers) to both the *next* and *previous* node.
* **Performance & Use Cases:**
    * **Efficient:** Fast for **insertions and deletions** at the beginning, end, or middle (O(1) if the insertion point is known).
    * **Less Efficient:** Slow for random access (getting an element by index) as it requires traversing the list (O(n)).
    * **Dual Use:** Can be used as a list, a queue, or a stack.

---

### 3. PriorityQueue

* **Definition:** `PriorityQueue` is an implementation of the `Queue` interface that orders its elements according to their **natural ordering** (if they implement `Comparable`) or by a specified **`Comparator`**.
* **Order:** The element with the *highest priority* (lowest value by default, acting as a **Min-Heap**) is always at the head of the queue. It does **not** follow FIFO.
* **Internal Structure:** It is based on the **binary heap** data structure.
* **Performance:**
    * Insertion (`add`/`offer`) and removal (`poll`/`remove`) take **$O(\log n)$** time, as they require maintaining the heap property.
    * Inspection of the head (`peek`) is **$O(1)$**.
* **Note:** It is *not* thread-safe and does not allow `null` elements.

---

### 4. ArrayDeque

* **Definition:** `ArrayDeque` is a resizable-array implementation of the **`Deque`** (Double-Ended Queue) interface.
* **Internal Structure:** It uses a **circular array** that grows dynamically.
* **Functionality:** It supports efficient element insertion and removal at **both the head and the tail**. This makes it an excellent choice for implementing both:
    * **Queues (FIFO):** Using methods like `offerLast` and `pollFirst`.
    * **Stacks (LIFO):** Using methods like `push` and `pop`.
* **Performance:** Operations at both ends are generally **$O(1)$** (amortized constant time). It is generally faster than `LinkedList` for most queue/stack operations.
* **Note:** It is *not* thread-safe and does not allow `null` elements.

Methods of Queue
The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.

Some of the commonly used methods of the Queue interface are:

add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
element() - Returns the head of the queue. Throws an exception if the queue is empty.
peek() - Returns the head of the queue. Returns null if the queue is empty.
remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

*/


/*
### 5. BlockingQueue Interface

* **Definition:** `BlockingQueue` is an interface in the `java.util.concurrent` package that extends `Queue`. It is a **thread-safe** queue that additionally supports operations that **wait (block)** for the queue to become non-empty upon retrieval or for space to become available upon insertion.
* **Core Purpose:** It is the foundational component for implementing the **Producer-Consumer pattern** and other concurrent message-passing systems, as it handles the necessary synchronization (waiting and notification) internally.
* **Blocking Operations:**
    * **Insertion:** `put(E e)` blocks until space is available (for bounded queues).
    * **Removal:** `take()` blocks until an element becomes available (if the queue is empty).
* **Implementations:** `ArrayBlockingQueue` (bounded, array-backed) and `LinkedBlockingQueue` (optionally bounded, linked list-backed).
* **Note:** It does not permit `null` elements.

---

### 6. BlockingDeque Interface

* **Definition:** `BlockingDeque` is an interface that extends both `BlockingQueue` and `Deque`. It is a **thread-safe** double-ended queue that supports all the blocking operations of a `BlockingQueue` but at **both the head and the tail**.
* **Core Purpose:** It provides the flexibility of a Deque (using it as a queue or a stack) with the robust thread-safety and flow control of a BlockingQueue.
* **Blocking Operations:** Extends blocking to both ends:
    * **Insertion:** `putFirst(E e)` and `putLast(E e)` block if the deque is full.
    * **Removal:** `takeFirst()` and `takeLast()` block if the deque is empty.
* **Implementations:** The primary implementation is `LinkedBlockingDeque`.
* **Relationship to BlockingQueue:** Since `BlockingDeque` extends `BlockingQueue`, you can use it as a standard FIFO blocking queue by only using the `put()` (alias for `putLast()`) and `take()` (alias for `takeFirst()`) methods.


ArrayBlockingQueue: Fixed-size (bounded), array-backed BlockingQueue; uses a single lock; lower concurrency but predictable memory.

LinkedBlockingQueue: Optionally bounded, linked-node-backed BlockingQueue; uses two separate locks (one for read, one for write); higher concurrency (throughput).
*/

/*
Iterating the ArrayDeque
iterator() - returns an iterator that can be used to iterate over the array deque
descendingIterator() - returns an iterator that can be used to iterate over the array deque in reverse order


ArrayDeque Vs. LinkedList Class
Both ArrayDeque and Java LinkedList implements the Deque interface. However, there exist some differences between them.

LinkedList supports null elements, whereas ArrayDeque doesn't.
Each node in a linked list includes links to other nodes. That's why LinkedList requires more storage than ArrayDeque.
If you are implementing the queue or the deque data structure, an ArrayDeque is likely to faster than a LinkedList.


ArrayDeque as a Stack
To implement a LIFO (Last-In-First-Out) stacks in Java, it is recommended to use a deque over the Stack class. The ArrayDeque class is likely to be faster than the Stack class.

ArrayDeque provides the following methods that can be used for implementing a stack.

push() - adds an element to the top of the stack
peek() - returns an element from the top of the stack
pop() - returns and removes an element from the top of the stack
*/

/*
When answering this common interview question, the best approach is to compare the two interfaces based on four key differences: **Purpose, Method, Implementation Location, and Flexibility.**

### Comparable Interface (`java.lang.Comparable`)

* **Purpose:** Defines the **natural ordering** (default sorting logic) of objects within the class itself.
* **Method:** `int compareTo(T otherObject)`
    * Compares *this* object to the argument object.
    * Returns a negative integer, zero, or a positive integer if `this` object is less than, equal to, or greater than the argument, respectively.
* **Implementation Location:** Implemented **by the class** whose instances are to be sorted (e.g., `class Person implements Comparable<Person>`).
* **Flexibility:** Provides for **only a single sorting sequence** (the "natural" one).

### Comparator Interface (`java.util.Comparator`)

* **Purpose:** Defines a **custom or external ordering** logic for objects. Used when you need an alternative to the natural order, or when you cannot modify the class.
* **Method:** `int compare(T o1, T o2)`
    * Compares the two argument objects (`o1` and `o2`).
    * Returns a negative integer, zero, or a positive integer if `o1` is less than, equal to, or greater than `o2`, respectively.
* **Implementation Location:** Implemented in a **separate class** or defined inline using a **lambda expression** (since Java 8, as it is a `@FunctionalInterface`).
* **Flexibility:** Provides for **multiple sorting sequences** (e.g., sorting the same `Person` class by age, then by name, then by height).

### When to Use Which

| Scenario | Interface to Use | Justification |
| :--- | :--- | :--- |
| **Default Sorting** | `Comparable` | When there is one clear, intrinsic, or *natural* way to order the objects (e.g., String alphabetical order, Integer numeric order). |
| **Custom Sorting** | `Comparator` | When you need multiple sorting options (e.g., sort employees by ID, name, or salary) or when you cannot modify the source class. |

*/

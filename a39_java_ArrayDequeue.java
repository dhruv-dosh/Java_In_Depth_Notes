package Java;

import java.util.ArrayDeque;

public class a39_java_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        //In array dequeue we can add and delete element from front and end
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

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

*/


/*
Iterating the ArrayDeque
iterator() - returns an iterator that can be used to iterate over the array deque
descendingIterator() - returns an iterator that can be used to iterate over the array deque in reverse order
*/

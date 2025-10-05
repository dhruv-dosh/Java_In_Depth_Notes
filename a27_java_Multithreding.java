package Java;
//Using Threads By Extending Thread class
class MultiThr1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<100){
           System.out.println("i am thread 1111111111 :");
           i++;
        }
    }
}
class MultiThr2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<100){
            System.out.println("I AM thread 2222222222 :");
            i++;
        }
    }
}

//Creating Java Thread Using Runnable interface
class Multithre3 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a thread 3");
            i++;
        }
    }
}
class Multithre4 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100) {
            System.out.println("I am a thread 44444444444");
            i++;
        }
    }
}
public class a27_java_Multithreding {
    public static void main(String[] args) {
        /*
        Multiprocessing and Multithreading both are used to acheive Multitasking
        threads are the small parts of process which increase the speed of process
        For Example :- A word processor can have one thread running in
                       foregroung as an editor and another in background autosaving the dock
        Threads -> Faster content switching.
        Threads is lightweight whereas processor is heavyweight

        threads :- waiter.
        process :- hotel. // Multiprocessing is heavier then Multithreading

        there are two ways to create thread in java
        1.By extending thread class.
        2.By implementing runnable interface.

        Without threading
        main() -> Func1() -> func2() -> END

        With Threading
        main()  --\
        func1() ----> END
        func2() --/
         */


        /*
        Concurrency and parallelism
        1.Doing multiple work but doing one task at a time.
        2.Multitasking and all the work is done at same time
         */

        //USING MULTITHREADING CONCEPT EXTENDING THREAD
        MultiThr1 t1 = new MultiThr1();
        MultiThr2 t2 = new MultiThr2();


        //USING MULTITHREADING CONCEPT BY IMPLIMENTING RUNNABLE INTERFACE
        Multithre3 bull1 = new Multithre3();
        Thread gun1 = new Thread(bull1);
        Multithre4 bull2 = new Multithre4();
        Thread gun2 = new Thread(bull2);

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getState());
        gun1.start();
        gun2.start();
        System.out.println(gun1.getState());
    }
}

/*
You are correct. To make the file a complete study resource, I should include the formal definitions within the summary sections.

Here is the revised TXT file containing all the concepts, questions, and detailed definitions.

-----

### **MULTITHREADING\_CONCEPTS\_SUMMARY\_WITH\_DEFINITIONS.txt**

```txt
========================================================================
JAVA MULTITHREADING AND CONCURRENCY CONCEPTS
========================================================================

SECTION 1: CORE CONCEPTS & DEFINITIONS

1.  THREAD:
    -   Definition: The smallest, independent unit of execution within a Process. A thread shares the Process's memory (Heap) but maintains its own separate call stack for local variables and method calls.
    -   Purpose: Enables concurrent execution to utilize multi-core processors, thereby improving application performance and responsiveness.

2.  PROCESS:
    -   Definition: An executing instance of a program. It is an independent, heavyweight entity managed by the Operating System, allocated its own isolated memory address space.

3.  PROCESS vs. THREAD:
    -   | Aspect | Process | Thread |
        | :--- | :--- | :--- |
        | **Resource Sharing** | Isolated (requires IPC for communication). | Shared (shares memory, code, and resources of the process). |
        | **Overhead** | High (Heavyweight: slower creation and context switching). | Low (Lightweight: faster creation and context switching). |

4.  THREAD CREATION:
    -   Method 1 (Recommended): Implement the **java.lang.Runnable** interface (defines the task logic).
    -   Method 2: Extend the **java.lang.Thread** class.

5.  START() vs. RUN():
    -   start(): Registers the thread with the Thread Scheduler and causes the thread's run() method to be executed in a *new* thread.
    -   run(): Executes the method body immediately on the *current* thread (no new thread is created).

6.  THREAD LIFE CYCLE (STATES):
    -   Definition: The various states a thread exists in from its creation to its termination.
    -   States: **NEW**, **RUNNABLE**, **RUNNING**, **BLOCKED/WAITING**, **TIMED_WAITING**, **TERMINATED (DEAD)**.

7.  DAEMON THREAD:
    -   Definition: A low-priority thread designed to provide background services (e.g., Garbage Collector). The JVM does not wait for Daemon threads to finish before shutting down; it terminates once all User (non-Daemon) threads have completed.

========================================================================
SECTION 2: THREAD SAFETY & SYNCHRONIZATION
========================================================================

8.  THREAD SAFETY:
    -   Definition: A class or program is thread-safe if it behaves correctly when multiple threads access and manipulate its shared mutable state concurrently, without needing external synchronization.

9.  RACE CONDITION:
    -   Definition: A flaw in concurrency where the output or result depends on the unpredictable sequence or timing of multiple threads executing non-atomic operations on shared data, often leading to data corruption.

10. SYNCHRONIZATION (`synchronized` keyword):
    -   Definition: A mechanism that enforces **mutual exclusion** by ensuring that only one thread can acquire an object's intrinsic lock (monitor) and execute a critical section of code at a time.
    -   Object Lock: Locks the specific instance (`this`). Used for non-static synchronized methods/blocks.
    -   Class Lock: Locks the class itself (`ClassName.class`). Used for static synchronized methods/blocks.

11. VOLATILE KEYWORD:
    -   Definition: A field modifier that guarantees **visibility**. It forces the JVM to read the variable’s value from main memory and write changes back immediately, preventing threads from using stale, cached values.
    -   Limitation: It **does NOT guarantee atomicity** for compound operations (`i++`).

12. ATOMIC CLASSES (`java.util.concurrent.atomic`):
    -   Definition: A set of classes that provide thread-safe operations on single variables (e.g., `AtomicInteger`, `AtomicReference`).
    -   How it works: Guarantees both **Visibility** and **Atomicity** by using **Compare-And-Set (CAS)** processor instructions, which is a non-blocking alternative to explicit locking.

13. JAVA MEMORY MODEL (JMM):
    -   Definition: A specification that defines how threads interact with memory (i.e., when and how changes made by one thread become visible to another).
    -   Core Principle: The **Happens-Before relationship**, which establishes a required memory synchronization order between operations.

========================================================================
SECTION 3: INTER-THREAD COMMUNICATION (IPC)
========================================================================

14. WAIT(), NOTIFY(), and NOTIFYALL():
    -   Definition: Methods used for conditional synchronization between threads.
    -   **wait()**: Causes the current thread to release the lock and enter the waiting state until another thread invokes `notify()` or `notifyAll()`.
    -   **notify()**: Wakes up a single thread waiting on the object's monitor.
    -   **notifyAll()**: Wakes up all threads waiting on the object's monitor.
    -   Rule: Must be called from a synchronized context.

15. DEADLOCK:
    -   Definition: A concurrency issue where two or more threads are permanently blocked, each waiting for a resource held by another thread in a circular dependency.

16. LIVELOCK:
    -   Definition: A concurrency issue where threads are not blocked, but are active and continuously changing their state in response to each other, resulting in no actual progress being made.

========================================================================
SECTION 4: CONCURRENCY FRAMEWORK (`java.util.concurrent`)
========================================================================

17. EXECUTOR FRAMEWORK:
    -   Definition: An API that decouples task submission (the "what") from thread execution (the "how"), simplifying concurrent programming and thread management.

18. THREAD POOL:
    -   Definition: A managed collection of worker threads that are reused to execute submitted tasks. This minimizes resource overhead by avoiding the constant creation and destruction of threads.

19. CALLABLE AND FUTURE:
    -   **Callable<V>**: An interface representing a task that **returns a value** (`V`) and can **throw checked exceptions**.
    -   **Future<V>**: An object that represents the result of an asynchronous computation, providing methods like `get()` (to retrieve the result, which blocks) and `isDone()` (to check status).

20. `ReentrantLock`:
    -   Definition: An explicit implementation of the `Lock` interface. Unlike the implicit `synchronized` keyword, it offers features like **non-blocking attempts to acquire a lock** (`tryLock()`), interruptible locking, and dedicated `Condition` objects.

21. SYNCHRONIZATION AIDS:
    -   **CountDownLatch**: A synchronization primitive that allows one or more threads to wait until a set of operations being performed in other threads completes (a counter reaches zero). It is a one-time use latch.
    -   **CyclicBarrier**: A synchronization primitive that allows a group of threads to wait for each other to reach a common barrier point, often used for parallel step-by-step computations. It is reusable.

22. `ThreadLocal`:
    -   Definition: A mechanism that creates variables local to a thread. Each thread that accesses a `ThreadLocal` variable gets its own independently initialized copy of the variable, efficiently achieving thread safety by avoiding shared state entirely.
```
*/

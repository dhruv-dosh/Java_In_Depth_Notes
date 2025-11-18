# Java Interview Definitions - Complete Guide

I'll provide you with clear, concise interview-ready definitions for all these topics.

## 1. Java (JDK, JVM, JRE)

**Java**: A high-level, object-oriented, platform-independent programming language that follows the principle "Write Once, Run Anywhere."

**JDK (Java Development Kit)**: A complete software development kit that contains JRE plus development tools like compiler (javac), debugger, and other tools needed to develop Java applications.

**JVM (Java Virtual Machine)**: An abstract machine that executes Java bytecode. It provides platform independence by converting bytecode into machine-specific code.

**JRE (Java Runtime Environment)**: Contains JVM and library classes required to run Java applications. It's used for execution only, not development.

---

## 2. Variables, Literals, Identifiers

**Variable**: A named memory location that stores data which can be changed during program execution.

**Literal**: A constant value assigned to a variable (e.g., 10, 'A', "Hello", true).

**Identifier**: A name given to variables, methods, classes, or packages. Must start with a letter, $ or _, and cannot be a Java keyword.

---

## 3. Java Operators

**Operators**: Special symbols that perform operations on operands.
- **Arithmetic**: +, -, *, /, %
- **Relational**: ==, !=, <, >, <=, >=
- **Logical**: &&, ||, !
- **Assignment**: =, +=, -=, *=, /=
- **Unary**: ++, --, +, -
- **Bitwise**: &, |, ^, ~, <<, >>, >>>
- **Ternary**: condition ? value1 : value2

---

## 4. Data Types (Primitive and Non-Primitive)

**Primitive Data Types**: Basic data types provided by Java (8 types):
- **Integer**: byte(1), short(2), int(4), long(8) bytes
- **Floating**: float(4), double(8) bytes
- **Character**: char(2) bytes
- **Boolean**: boolean (true/false)

**Non-Primitive Data Types**: Reference types that refer to objects (Classes, Interfaces, Arrays, Strings). They're created by programmers and stored in heap memory.

---

## 5. Arrays

**Array**: A container object that holds a fixed number of elements of the same data type. Elements are stored in contiguous memory locations and accessed using index (starting from 0).

Example: `int[] arr = new int[5];`

---

## 6. String & StringBuilder

**String**: An immutable sequence of characters stored in the String constant pool. Once created, cannot be modified.

**StringBuilder**: A mutable sequence of characters that can be modified without creating new objects. More efficient for multiple string manipulations. Not thread-safe (unlike StringBuffer).

---

## 7. Expression, Statement, Block

**Expression**: A combination of variables, operators, and method calls that evaluates to a single value.
Example: `a + b * 2`

**Statement**: A complete unit of execution that ends with a semicolon.
Example: `int x = 10;`

**Block**: A group of zero or more statements enclosed in curly braces `{}`. Creates a scope for variables.

---

## 8. Java Flow Control

**if-else**: Executes a block of code if condition is true, otherwise executes else block.

**else-if**: Tests multiple conditions sequentially.

**Ternary Operator**: Shorthand for if-else: `condition ? trueValue : falseValue`

**Switch Case**: Executes one code block from multiple options based on the value of an expression. Contains a default block that executes when no case matches.

---

## 9. Loops

**for loop**: Executes a block of code a specific number of times when iteration count is known.

**for-each loop**: Iterates over arrays or collections without using an index.

**while loop**: Executes code repeatedly while condition is true. Checks condition before execution.

**do-while loop**: Executes code at least once, then repeats while condition is true. Checks condition after execution.

---

## 10. Jump Statements

**Break**: Terminates the loop or switch statement and transfers control to the next statement.

**Break Labeled**: Breaks out of nested loops by specifying a label.

**Continue**: Skips the current iteration and moves to the next iteration of the loop.

**Continue Labeled**: Skips the current iteration of a labeled loop in nested loops.

---

## 11. OOPs Basic Concepts

### 11.1 Classes, Objects, Generics

**Class**: A blueprint or template that defines the structure and behavior of objects.

**Object**: An instance of a class that has state (attributes) and behavior (methods).

**Generics**: A feature that allows type parameters, enabling code reusability with type safety. Example: `List<String>`

### 11.2 Method

**Method**: A block of code that performs a specific task and only executes when called.

**Static Methods**: Belong to the class rather than instances. Called using class name without creating objects.

**Standard Library Methods**: Pre-defined methods provided by Java API (e.g., Math.sqrt(), System.out.println()).

**Method Signature**: The method name and parameter list (return type is not part of signature).

#### 11.2.1 Dynamic Method Dispatch

**Dynamic Method Dispatch**: Runtime polymorphism where the JVM decides which overridden method to call based on the object type, not reference type.

### 11.3 Method Overloading

**Method Overloading**: Defining multiple methods with the same name but different parameters (number, type, or order) in the same class. Resolved at compile time (compile-time polymorphism).

### 11.4 Constructor

**Constructor**: A special method with the same name as the class, used to initialize objects. Has no return type.

**Types**: Default (no-arg), Parameterized, Copy constructor.

**Explicit Constructor Invocation**: Calling one constructor from another using `this()` or calling parent constructor using `super()`.

**Private Constructor**: Used in Singleton pattern to prevent instantiation from outside.

**Constructor cannot be**: abstract, static, or final.

### 11.5 Singleton Class

**Singleton Class**: A design pattern that ensures only one instance of a class exists throughout the application.
- Private constructor
- Private static instance variable
- Public static getInstance() method

### 11.6 Static Keyword

**Static Variable**: Belongs to the class, shared among all instances. Allocated memory once at class loading.

**Static Method**: Belongs to the class, can be called without creating objects. Can only access static members.

**Static Block**: Executes once when class is loaded, used for static variable initialization.

Static is a **non-access modifier**.

### 11.7 Nested Class

**Static Nested Class**: A static class inside another class. Can be instantiated without outer class instance.

**Non-Static (Inner) Class**: A class inside another class that requires an outer class instance to be instantiated. Has access to outer class members.

### 11.8 Access Modifiers

**Private**: Accessible only within the same class.

**Default (Package-private)**: Accessible within the same package only.

**Protected**: Accessible within the same package and subclasses in other packages.

**Public**: Accessible from anywhere.

### 11.9 This Keyword

**this**: A reference variable that refers to the current object instance.
- Used in methods or constructors to refer to instance variables
- Used to call other constructors in the same class
- Differentiates between instance variables and parameters with the same name

### 11.10 Final Keyword

**final**: A non-access modifier used to define constants and prevent modification.
- **final variable**: Cannot be reassigned (constant)
- **final method**: Cannot be overridden
- **final class**: Cannot be inherited

### 11.11 Recursion

**Recursion**: A technique where a method calls itself to solve a problem by breaking it into smaller subproblems. Must have a base case to stop recursion.

---

## 12. OOPs Main Concepts

**Encapsulation**: Wrapping data (variables) and code (methods) together, and restricting direct access using access modifiers (data hiding).

**Abstraction**: Hiding implementation details and showing only essential features. Achieved through abstract classes and interfaces.

**Polymorphism**: The ability of an object to take many forms. Same method behaves differently based on the object.

**Inheritance**: A mechanism where one class acquires properties and methods of another class for code reusability.

### 12.1 Java Inheritance

**Inheritance**: Allows a class (child/subclass) to inherit properties and methods from another class (parent/superclass).

**Key Purpose**: Code reusability and method overriding.

**Method Overriding**: Redefining a parent class method in the child class with the same method signature. Enables runtime polymorphism.

### 12.2 Super Keyword

**super**: A reference variable that refers to the immediate parent class object.
- Access parent class variables
- Call parent class methods
- Call parent class constructors using `super()`

### 12.3 Types of Inheritance

- **Single Inheritance**: One class inherits from one parent class
- **Multilevel Inheritance**: A class inherits from a derived class (chain)
- **Hierarchical Inheritance**: Multiple classes inherit from one parent class

**Note**: Java doesn't support multiple inheritance (one class inheriting from multiple classes) to avoid ambiguity. Uses interfaces instead.

### 12.4 Abstract Classes, Abstract Method

**Abstract Class**: A class declared with `abstract` keyword that cannot be instantiated. Can have abstract and concrete methods.

**Abstract Method**: A method without implementation (no body), declared with `abstract` keyword. Must be implemented by subclasses.

### 12.5 Interfaces

**Interface**: A reference type that contains only abstract methods (until Java 8) and constants. Achieves 100% abstraction and multiple inheritance.

Java 8+: Can have default and static methods with implementation.

### 12.6 Polymorphism

**Compile-Time Polymorphism**: Method overloading resolved at compile time.

**Runtime Polymorphism**: Method overriding resolved at runtime through dynamic method dispatch.

**Polymorphic Variable**: A reference variable that can refer to objects of its class or subclasses.

**Generics**: Provides type safety and polymorphic behavior by allowing parameterized types.

### 12.7 Java Encapsulation

**Encapsulation (Data Hiding)**: Binding data and methods together and hiding internal implementation by making variables private and providing public getter/setter methods.

### 12.8 Anonymous Classes

**Anonymous Class**: A class without a name defined and instantiated in a single expression. Used for implementing interfaces or extending classes for one-time use.

### 12.9 Singleton Classes

(See 11.5 - Same concept)

### 12.10 Packages

**Package**: A namespace that organizes related classes and interfaces into a group. Provides access protection and prevents naming conflicts.

Example: `java.util`, `java.io`

### 12.11 Java Enum

**Enum**: A special data type that contains a fixed set of constants. Used to represent a group of named constants.

Example: `enum Day { MONDAY, TUESDAY, WEDNESDAY }`

---

## 13. Exception

**Exception**: An unwanted event that disrupts the normal flow of program execution.

### 13.1 Runtime Exception

**Runtime Exception**: Unchecked exceptions that occur during program execution (e.g., NullPointerException, ArrayIndexOutOfBoundsException). Compiler doesn't force handling. Developer must correct the code.

### 13.2 I/O Exception

**I/O Exception**: Compile-time (checked) exceptions that occur during input/output operations. Must be handled or declared using throws.

### 13.3 Exception Handling

**try-catch-finally**: 
- **try**: Contains code that might throw exception
- **catch**: Handles the exception
- **finally**: Executes regardless of exception (cleanup code)

**throw**: Used to explicitly throw an exception.

**throws**: Declares that a method might throw an exception.

**Multiple catch blocks**: Can handle different exceptions separately, or use `|` for multiple exceptions in one catch.

### 13.4 Custom Exception

**Custom Exception**: User-defined exception created by extending the Exception class to handle application-specific error conditions.

---

## 14. Annotations

**Annotation**: Metadata that provides information about the program but doesn't affect program execution. Starts with `@`.

### 14.1 Types of Annotations

**Marker (Normal) Annotation**: No parameters (e.g., `@Override`)

**Single-value Annotation**: One parameter (e.g., `@SuppressWarnings("unchecked")`)

**Full (Multiple value) Annotation**: Multiple parameters

**Repeating Annotation**: Same annotation applied multiple times

**Type Annotation**: Applied to any type use (Java 8+)

### 14.2 Annotation Categories

**Custom Annotation**: Created using `@interface` keyword.

**Predefined Annotation**: Built-in annotations (e.g., `@Override`, `@Deprecated`, `@SuppressWarnings`)

**Meta-Annotation**: Annotations applied to other annotations (e.g., `@Retention`, `@Target`)

### 14.3 Logging

**Logging**: Recording program execution information using frameworks (e.g., Log4j, SLF4J) for debugging and monitoring. Often configured using annotations.

---

## 15. Multithreading

### 15.1 Thread

**Thread**: The smallest unit of execution within a process. A lightweight subprocess that can run independently.

### 15.2 Multitasking

**Multitasking**: The ability to execute multiple tasks simultaneously. Two types:
- **Process-based**: Running multiple programs
- **Thread-based**: Running multiple threads within a program

### 15.3 Multithreading

**Multithreading**: A Java feature that allows concurrent execution of two or more threads for maximum CPU utilization and improved performance.

### 15.4 Single Core & Multiple Core

**Single Core**: One thread executes at a time; OS switches between threads (context switching) to simulate parallelism.

**Multiple Core**: Multiple threads can truly execute simultaneously on different cores.

### 15.5 Thread Creation in Java

**Two ways**:
1. **Implementing Runnable Interface**: Implement `run()` method, pass to Thread object
2. **Extending Thread Class**: Override `run()` method, call `start()` to begin execution

### 15.6 Thread Methods

- **start()**: Begins thread execution
- **run()**: Contains thread's code
- **sleep()**: Pauses thread for specified time
- **join()**: Waits for thread to complete
- **yield()**: Pauses current thread to give chance to others
- **interrupt()**: Interrupts a sleeping/waiting thread

### 15.7 User & Daemon Thread

**User Thread**: Regular threads that perform application tasks. JVM waits for user threads to complete.

**Daemon Thread**: Background threads (e.g., garbage collector) that provide services to user threads. JVM terminates when only daemon threads remain.

### 15.8 Synchronization & Synchronized Keyword

**Synchronization**: Controlling access to shared resources by multiple threads to prevent data inconsistency.

**synchronized keyword**: Ensures only one thread can access a method or block at a time by acquiring a lock.

### 15.9 Locks

**Intrinsic Lock (Monitor Lock)**: Automatically acquired when using synchronized. Every object has one.

**Explicit Lock**: Manual lock management using Lock interface (e.g., ReentrantLock) with more flexibility.

**Acquire**: Thread gets the lock to access resource.

**Release**: Thread frees the lock after execution.

### 15.10 ReentrantLock and Read-Write Lock

**ReentrantLock**: An explicit lock that allows the same thread to acquire it multiple times. Provides more features than synchronized (tryLock, timed lock).

**Read-Write Lock**: Allows multiple threads to read simultaneously but only one thread to write. Improves performance when reads are frequent.

### 15.11 Disadvantages of Synchronized

- **Performance Overhead**: Only one thread can execute, reducing parallelism
- **No Flexibility**: Cannot try to acquire lock or timeout
- **Deadlock Risk**: Improper synchronization can cause deadlock
- **No Read-Write Separation**: Readers also block each other

### 15.12 Thread Communication

**Thread Communication**: Threads communicate using wait(), notify(), and notifyAll() methods to coordinate their execution. Used in producer-consumer scenarios.

### 15.13 Thread Safety

**Thread Safety**: Ensuring that shared data is accessed by only one thread at a time to avoid data corruption. Achieved through synchronization, volatile keyword, or thread-safe collections.

---

## 16. Collections

**Collections Framework**: A unified architecture for storing and manipulating groups of objects with interfaces and classes.

### 16.1 Iterable Interface

**Iterable Interface**: Root interface that allows an object to be iterated using for-each loop. Contains `iterator()` method.

### 16.2 Collection Interface

**Collection Interface**: Extends Iterable, represents a group of objects. Root interface for List, Set, and Queue.

### 16.3 List Interface

**List**: Ordered collection that allows duplicates and indexed access.

**ArrayList**: Dynamic array, fast random access, slow insertion/deletion in middle.

**LinkedList**: Doubly-linked list, fast insertion/deletion, slow random access.

**Vector**: Synchronized ArrayList, thread-safe but slower.

**Stack**: LIFO (Last-In-First-Out) data structure, extends Vector.

### 16.4 Set Interface

**Set**: Unordered collection that doesn't allow duplicates.

**HashSet**: Uses hashing, fast operations, no order guarantee.

**LinkedHashSet**: Maintains insertion order using linked list.

**TreeSet**: Sorted order (natural or custom), uses Red-Black tree.

### 16.5 Comparable & Comparator

**Comparable**: Interface with `compareTo()` method for natural ordering. Class implements it.

**Comparator**: Interface with `compare()` method for custom ordering. Separate class implements it.

### 16.6 Queue

**Queue**: FIFO (First-In-First-Out) data structure.

**LinkedList**: Implements Queue interface.

**PriorityQueue**: Elements are ordered by priority (natural or custom ordering).

### 16.7 Deque

**Deque (Double-Ended Queue)**: Allows insertion and removal from both ends.

**ArrayDeque**: Resizable array implementation, fast operations.

**LinkedList**: Also implements Deque interface.

### 16.8 Map

**Map**: Key-value pair collection, keys are unique.

**HashMap**: Uses hashing, allows one null key, fast operations, no order.

**LinkedHashMap**: Maintains insertion order.

**TreeMap**: Sorted by keys (natural or custom ordering), no null keys.

---

## 17. Java 8 Features

### 17.1 Lambda Expression

**Lambda Expression**: A concise way to represent anonymous functions (method without name) using `->` operator. Enables functional programming in Java.

Syntax: `(parameters) -> expression` or `(parameters) -> { statements; }`

### 17.2 Functional Programming

**Functional Programming**: A programming paradigm that treats computation as evaluation of mathematical functions, avoiding state changes and mutable data. Emphasizes pure functions and declarative code.

### 17.3 Functional Interface

**Functional Interface**: An interface with exactly one abstract method (SAM - Single Abstract Method). Can be implemented using lambda expressions.

**FUNCTION**: Takes one argument, returns a result. `Function<T, R>`

**PREDICATE**: Takes one argument, returns boolean. `Predicate<T>`

**CONSUMER**: Takes one argument, returns nothing (void). `Consumer<T>`

**SUPPLIER**: Takes no argument, returns a result. `Supplier<T>`

### 17.4 Streams

**Stream**: A sequence of elements that supports sequential and parallel aggregate operations. Provides functional-style operations to process collections (filter, map, reduce). Doesn't store data, processes data from a source.

---

## Quick Interview Tips:

1. **Be concise**: Start with a one-line definition
2. **Give examples**: If asked, provide simple code examples
3. **Connect concepts**: Show how topics relate (e.g., inheritance enables polymorphism)
4. **Know the "why"**: Understand why features exist (e.g., synchronized prevents data inconsistency)
5. **Practice saying these aloud**: It helps with fluency during interviews

Good luck with your interviews! 🎯

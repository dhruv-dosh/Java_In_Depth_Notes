// INHERITANCE AND CONSTRUCTOR-IN-INHERITANCE AND SUPER KEYWORD
package Java;

class Base{
    int age;
    int salary;
    String name;
    public Base(){
        System.out.println("I AM A BASE CLASS CONSTRUCTOR");
        name = "Employee";
        age = 20;
        salary= 150000;
    }
    public Base(int a){
        System.out.println("I AM OVERLOADED CONSTRUCTOR OF BASE CLASS OF VAL "+a);
    }
}

//Extend keyword is used to inherit class
class Derived extends Base{
    String post;

    public Derived(){
        //super is for runing overloded constructor of base class
//        super(10);
        System.out.println("I AM A DERIVED CLASS CONSTRUCTOR");
        post = "Manager";
    }
    public Derived(int x,int y){
        //super is for runing overloded constructor of base class
        super(x);
        System.out.println("I AM A OVERLODED DERIVED CLASS CONSTRUCTOR with val "+ y);
        post = "Manager";
    }

}

class Derived2 extends Derived{
    public Derived2(int x,int y,int z){
        super(x,y);
        System.out.println("I AM OVERLOADED CHILD OF DERIVED CLASS CONSTRUCTOR WITH VAL "+z );
    }
}
public class a13_java_inheritance {
    public static void main(String[] args) {
//        Base e1 = new Base();
//        System.out.println(e1.name+" "+e1.age+" "+e1.salary);
//        Derived e2 = new Derived(10,32);
//        System.out.println(e2.name+" "+e2.post+" "+e2.age+" "+e2.salary);
        Derived2 e3 = new Derived2(1,2,3);

    }
}













// Parent class (Base class)
class Animal {
    String name;
    int age;
    
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class (Derived class) - inherits from Animal
class Dog extends Animal {
    String breed;
    
    // Dog inherits name, age, eat(), and sleep() from Animal
    // Dog adds its own specific method
    void bark() {
        System.out.println(name + " is barking: Woof!");
    }
}

// Another child class
class Cat extends Animal {
    // Cat also inherits from Animal
    void meow() {
        System.out.println(name + " is meowing: Meow!");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.breed = "Golden Retriever";
        
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Dog's own method
        
        Cat myCat = new Cat();
        myCat.name = "Whiskers";
        myCat.age = 2;
        
        myCat.eat();    // Inherited from Animal
        myCat.sleep();  // Inherited from Animal
        myCat.meow();   // Cat's own method
    }
}

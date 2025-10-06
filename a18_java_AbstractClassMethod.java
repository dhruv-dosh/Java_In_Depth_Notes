package Java;
/*
Abstraction is an OOP principle that focuses on exposing only the essential features of an object or system, while hiding the unnecessary implementation details.

Abstract class: is a restricted class that cannot be used to create objects
(to access it, it must be inherited from another class). Abstract method: can only be used in an
abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 */
// Defining abstract class and abstract method onside it
// Abstract Class
// It is used to achieve abstraction which is one of the pillars of Object Oriented Programming(OOP)
abstract class PhoneModel{
    public void vibrate(){
        System.out.println("VIBRATING....");
    }

    // Abstract Method
    abstract void call();
}


// class inherited from Abstract class
class Samsung extends PhoneModel{
    @Override
    public void call(){
        System.out.println("calling...");
    }
    public void start(){
        System.out.println("Starting...");
    }
}
public class a18_java_AbstractClassMethod {
    public static void main(String[] args) {
        Samsung s21 = new Samsung();
        s21.call();
        s21.vibrate();
    }
}

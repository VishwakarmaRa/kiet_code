package collect;


//default methods:Default methods were introduced to allow 
//interface evolution (adding new methods) without breaking old code.
//1. Old classes (Car, Bike) don’t need to change anything.
//2. If they don’t implement horn(), they’ll automatically use the default version.
//3. But if they want, they can override it.

//static methods:
//A static method in an interface belongs to the interface, not to the object.
//You cannot override it in the implementing class.
interface Vehicle {
    void start();

    // new method, but with default implementation
    default void horn() {
        System.out.println("Beep beep! (default horn)");
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }
    // Not overriding horn(), will use default
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starting...");
    }

    // Overriding default method
    public void horn() {
        System.out.println("Bike horn: Peeep Peeep!");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.horn();  // uses default from interface

        bike.start();
        bike.horn(); // uses overridden version
    }
}

public class array {
     public static void main(String[] args) {
		
	}
}

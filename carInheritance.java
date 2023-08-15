// class
class Vehicle {
    // Method
    void start() {
        System.out.println("Vehicle starting...");
    }
}

// inheritance
class Car extends Vehicle {
    // Method specific to Car to accelerate
    void accelerate() {
        System.out.println("Car accelerating...");
    }
}

// Main class
public class carInheritance {
    public static void main(String[] args) {
        // Create an object
        Car myCar = new Car();

        // Call inherited method from Vehicle class
        myCar.start();       // Output: Vehicle starting...

        // Call method specific to Car class
        myCar.accelerate();  // Output: Car accelerating...
    }
}

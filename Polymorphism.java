// class
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 10);              // Calls the first add method
        int sum2 = calculator.add(5, 10, 15);          // Calls the second add method
        double sum3 = calculator.add(2.5, 2.5);        // Calls the third add method

        System.out.println("Sum 1: " + sum1);         // Output: Sum 1: 15
        System.out.println("Sum 2: " + sum2);         // Output: Sum 2: 30
        System.out.println("Sum 3: " + sum3);         // Output: Sum 3: 5.0
    }
}

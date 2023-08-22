import java.util.Scanner;

// Base class Animal
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("anjing menganjing");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("kucing berkicauan");
    }
}

// Main class for demonstration
public class AnimalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose an animal
        System.out.println("pilih la :\n1. anjing\n2. kucing");
        int choice = scanner.nextInt();

        Animal animal;

        // Create an instance of the chosen animal
        if (choice == 1) {
            animal = new Dog(); // Dynamic polymorphism: Dog is treated as an Animal
        } else if (choice == 2) {
            animal = new Cat(); // Dynamic polymorphism: Cat is treated as an Animal
        } else {
            System.out.println("mana ada gila!");
            scanner.close();
            return;
        }

        // Call the makeSound method of the chosen animal
        animal.makeSound();

        scanner.close();
    }
}


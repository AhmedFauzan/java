import java.util.Scanner;

// Define a class to represent a receipt
class Receipt {
    String itemName;
    double itemPrice;
    int quantity;

    // Constructor
    Receipt(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    // Calculate the total cost for this item
    // method
    double getTotal() {
        return itemPrice * quantity;
    }

    // Print the receipt details
    void printReceipt() {
        System.out.println("\nini adalah resit kamu");
        System.out.println("-------------");
        System.out.println("Item: " + itemName);
        System.out.println("harga: RM" + itemPrice);
        System.out.println("Kuantiti: " + quantity);
        System.out.println("Total: RM" + getTotal());
    }
}

// Main class to handle user input and interaction
public class resit15august {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama item: ");
        String itemName = scanner.nextLine();

        System.out.print("Bantu kami masukkan harga sekali: RM");
        double itemPrice = scanner.nextDouble();

        System.out.print("Berapa kuantiti?: ");
        int quantity = scanner.nextInt();

        // Create a Receipt object with the provided details
        Receipt receipt = new Receipt(itemName, itemPrice, quantity);

        // Call the printReceipt() method to display the receipt
        receipt.printReceipt();

        scanner.close(); // Close the scanner
    }
}

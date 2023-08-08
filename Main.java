import java.util.Scanner;
//superclass
class Haiwan {
    String name;
//constructor
    public Haiwan(String name) {
        this.name = name;
    }
//method
    public void takdir() {
        System.out.println("begitu juga " + "muka " + name + "");
    }
}
//override
class JenisHaiwan extends Haiwan {
    public JenisHaiwan(String name) {
        super(name);
    }
    public void takdir() {
        System.out.println(" muka " + name + " tembam");
    }
}
//main class
public class Main {
//main method
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan nama haiwan: ");
            String jenisHaiwanName = scanner.nextLine();
            JenisHaiwan jenisHaiwan = new JenisHaiwan(jenisHaiwanName);

            System.out.print("Masukkan nama kamu: ");
            String ownerName = scanner.nextLine();
            Haiwan owner = new Haiwan(ownerName);

            scanner.close();

            jenisHaiwan.takdir();
            owner.takdir();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

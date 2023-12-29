package Task_2;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;

    // Default constructor with default age set to 18
    public Person() {
        this.age = 18;
    }

    // Parameterized constructor to initialize name and age using Scanner
    public Person(Scanner scanner) {
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter age: ");
        try {
            this.age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Defaulting to 18.");
            this.age = 18;
        }
    }

    // Method to display name and age of the person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a person object using parameterized constructor with Scanner
        Person person = new Person(scanner);

        // Displaying details of the person
        System.out.println("Person Details:");
        person.displayPersonDetails();

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
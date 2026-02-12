import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declare and assign variables
        String name = "Alex";
        int age = 25;
        char theCharacter = 'A';
        double interestRate = 3.75;

        // Display initial variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Character: " + theCharacter);
        System.out.println("Interest Rate: " + interestRate);

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Retrieve a value from the user
        System.out.print("Enter any value: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        // Prompt user for name
        String theName;
        System.out.print("Enter your name: ");
        theName = scanner.nextLine();
        System.out.println("Your name is: " + theName);

        // Prompt user for age
        System.out.print("Enter your age: ");
        int theAge = scanner.nextInt();
        System.out.println("Your age is: " + theAge);

        // Blink calculation
        int blinks = 200;
        int minutes = 7;
        double blinksPerMinute = (double) blinks / minutes;
        System.out.println("Blinks per minute: " + blinksPerMinute);

        // Account balance with 2 decimal places
        System.out.print("Enter your account balance: ");
        double accountBalance = scanner.nextDouble();
        System.out.printf("Account Balance: %.2f%n", accountBalance);

        scanner.close();
    }
}
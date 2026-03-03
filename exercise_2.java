import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hourlyRate = 30.65;
        String businessName = "Brianna Watt DBA Watt Gives";

        System.out.print("Enter the client's business name: ");
        String clientName = input.nextLine();

        System.out.print("Enter hours worked for Day 1: ");
        double day1 = input.nextDouble();

        System.out.print("Enter hours worked for Day 2: ");
        double day2 = input.nextDouble();

        System.out.print("Enter hours worked for Day 3: ");
        double day3 = input.nextDouble();

        double totalHours = day1 + day2 + day3;
        double totalAmount = totalHours * hourlyRate;

        System.out.println("\n" + businessName);
        System.out.println("Invoice for " + clientName);
        System.out.println("Hours: " + (int)totalHours);
        System.out.println("Rate: $" + hourlyRate);
        System.out.printf("Total: $%.0f%n", totalAmount);

        input.close();
    }
}

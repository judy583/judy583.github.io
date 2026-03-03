import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the room: ");
        double width = input.nextDouble();

        System.out.print("Enter the cost per square foot: ");
        double costPerSqFt = input.nextDouble();

        double area = length * width;
        double totalCost = area * costPerSqFt;

        System.out.println("The room is " + (int)area + " square feet.");
        System.out.printf("At $%.2f per sq.ft., It will cost $%,.2f to tile it.%n", costPerSqFt, totalCost);

        input.close();
    }
}

package unit_2_practice;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the hour in military time (1-24): ");
        int hour = Integer.parseInt(input.nextLine());
        
        if (hour >= 18 && hour <= 24) {
            System.out.println("Good evening");
        }
        else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon");
        }
        else if (hour >= 6 && hour < 12) {
            System.out.println("Good morning");
        }
        else {
            System.out.println("Good day");
        }

        input.close();
    }
}

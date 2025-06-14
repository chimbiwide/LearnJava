package Projects;

import java.util.Scanner;
public class weightConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double result;
        int choice;
        System.out.println(" 1: For lbs to kgs");
        System.out.println(" 2: For kgs to lbs");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            result = weight * 0.453592;
            if (result > 1000) {
                result = result / 1000;
                System.out.printf("Your weight is %.3f tons, you're huge", result);
            }
            else {
                System.out.printf("Result %.3f kgs", result);
            }
        }
        else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            result = weight * 2.20462;
            System.out.printf("Result %.3f lbs", result);
        }
        else {
            System.out.println("Invalid choice");
            System.exit(1);
        }
        scanner.close();
    }
}

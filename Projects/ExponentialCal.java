package Projects;

import java.util.Scanner;
public class ExponentialCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type;
        double p;
        double t;
        double r;
        int n;
        double E = Math.E;
        double amount;
        System.out.println("Welcome to the Exponential Calculator!");
        System.out.println("Enter '1' for compound interest");
        System.out.println("Enter '2' for positive continuos growth");
        System.out.print("Which operation to perform? (1,2): ");
        type = scanner.nextInt();
        if (type != 1 && type != 2) {
            System.out.println("Invalid input. Try again.");
            System.exit(0);
        }
        else if (type == 1){
            System.out.print("Enter the principle: ");
            p = scanner.nextDouble();
            System.out.print("Enter the rate (in %): ");
            r = scanner.nextDouble() / 100;
            System.out.print("Enter the # of years: ");
            t = scanner.nextDouble();
            System.out.print("Enter the # of time compounded per year: ");
            n = scanner.nextInt();
            amount = p * Math.pow((1+(r/n)), n*t);
            System.out.printf("Your result after %.1f years is %.3f\n", t, amount);
        }
        else if (type == 2){
            System.out.print("Enter the principle: ");
            p = scanner.nextDouble();
            System.out.print("Enter the rate (in %): ");
            r = scanner.nextDouble() / 100;
            System.out.print("Enter the time: ");
            t = scanner.nextDouble();
            amount = p*Math.pow(E, r*t);
            System.out.printf("Your result is %.3f.\n", amount);
        }
        scanner.close();
    }
}

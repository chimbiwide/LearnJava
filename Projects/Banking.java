package Projects;
import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);
    static String startSeparator = "**************************";
    static String endSeparator = "##########################";
    static String cardType;
    static long credit;

    public static void main(String[] args) {
        double Balance = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int option;
        //Display Menu
        while (isRunning) {
            System.out.printf("\n\n%s\nWelcome to Chum Bank\n%s", startSeparator, endSeparator);
            System.out.print("\n1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit\n");
            //Get and Process user choice
            System.out.printf("%s\nEnter your choice (1-4): ", startSeparator);
            option = scanner.nextInt();
            switch (option) {
                case 1 -> showBalance(Balance);
                case 2 -> Balance = Balance + deposit();
                case 3 -> Balance = Balance - withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice, enter number 1-4");
            }
        }
        // Exit Message
        System.out.println("\nThank you for using Chum Bank!");
        System.out.println("Have a chummy day :)");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance: $%.2f\n%s", balance, endSeparator);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();
        boolean isZero = amount <= 0;
        if (isZero) {
            System.out.printf("Deposit failed \namount cannot be negative\n%s", endSeparator);
            return 0;
        } else if (!isZero) {
            System.out.printf("You deposited $%.2f\n%s\n", amount, endSeparator);
            return amount;
        }
        return 0;
    }

    static double withdraw() {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();
        boolean isZero = amount >= 0;
        if (isZero) {
            System.out.printf("Withdraw failed \namount cannot be positive\n%s", endSeparator);
            return 0;
        } else if (!isZero) {
            System.out.printf("You withdrawed $%.2f\n%s\n", amount, endSeparator);
            return amount;
        }
        return 0;
    }

}

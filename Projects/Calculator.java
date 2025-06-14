package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        double num2 = 0;
        String operation;
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Choose from the following operators: +,-,*,/,^,root,abs: ");
        operation = scanner.next();
        if (!operation.equals("abs")){
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
        }
        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    System.exit(1);
                }
                result = num1 / num2;
            }
            case "^" -> result = Math.pow(num1, num2);
            case "root" -> result = Math.pow(num1, 1/num2);
            case "abs" -> result = Math.abs(num1);
            default -> {
                System.out.println("Invalid operation");
                System.exit(2);
            }
        }
        System.out.print(result);
        scanner.close();
    }
}

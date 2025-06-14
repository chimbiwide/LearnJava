package Topics;

import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        //ternary operator ?= return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : if False;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the military time of the day: ");
        int input = scanner.nextInt();
        String output = (input < 12) ? "A.M" : "P.M";
        System.out.printf(output);
        scanner.close();
    }
}

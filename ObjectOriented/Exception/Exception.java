package ObjectOriented.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        //Exception = An event that interrupts the normal flow of the program
        //            (Dividing by zero, file not found, mismatch input type)
        //            Surround any dangerous code with a try{} block
        //            try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero " + e);
        } catch (InputMismatchException e) {
            System.out.println("You must enter a number");
        } finally {
            System.out.println("Good bye");
        }
    }
}

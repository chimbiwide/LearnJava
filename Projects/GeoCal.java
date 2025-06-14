package Projects;

import java.util.Scanner;
public class GeoCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double leg1;
        double leg2;
        double hypotenuse;
        System.out.print("Enter leg1: ");
        leg1 = scanner.nextDouble();
        System.out.print("Enter leg2: ");
        leg2 = scanner.nextDouble();
        hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
        //System.out.println("Hypotenuse: " + hypotenuse);
        System.out.printf("Hypotenuse: %.3fcm", hypotenuse);
        scanner.close();


    }
}

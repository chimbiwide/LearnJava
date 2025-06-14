package Topics;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("q")) {
            System.out.print("Press Q to exit: ");
            input = scanner.nextLine();
        }
        System.out.print("Exit game");
        do{
            System.out.print("\nPress R to restart: ");
            input = scanner.nextLine();
        }while (!input.equalsIgnoreCase("r"));
        System.out.println("Restarting game.......");
        scanner.close();
    }
}

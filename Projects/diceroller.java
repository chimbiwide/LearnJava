package Projects;
import java.util.Scanner;
import java.util.Random;

public class diceroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numofDice;
        int total = 0;
        System.out.print("Enter the number of dice of roll: ");
        numofDice = scanner.nextInt();
        //check if # dice is larger than 0
        if (numofDice > 0) {
            for (int i = 0; i < numofDice; i++) {
                int roll = rand.nextInt(1,7);
                printDice(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("The total is: " + total);
        }
        else {
            System.out.println("The amount of dice should be greater than 0");
        }
        //display the ascii of Dice
        scanner.close();
    }
    static void printDice(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll, Try again");
        }
    }
}

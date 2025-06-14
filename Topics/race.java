package Topics;

import java.util.Scanner;
public class race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String race;
        System.out.println("Welcome to the Race locator, enter either black, white or Asian");
        System.out.print("What is your race: ");
        race = scanner.nextLine();
        if (race.isEmpty()){
            System.out.println("No race, are you sure you are a human🐈???");
            System.exit(0);
        }
        else if (race.equals("black")) {
            System.out.println("Africa.");
        }
        else if (race.equals("white")) {
            System.out.println("Europe or North America.");
        }
        else if (race.equals("Asian")){
            System.out.println("Asia");
        }
        else {
            System.out.println("You are not even a human👽, try again.");
            System.exit(0);
        }
        scanner.close();
    }
}

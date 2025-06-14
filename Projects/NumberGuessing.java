package Projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min,max,guess,attempts,randomNumber;
        char replay;
        String stat;
        do{
            System.out.println("Welcome to the number guessing!");
            System.out.print("Enter your guessing range, min: ");
            min = sc.nextInt();
            System.out.print("Enter your guessing range, max: ");
            max = sc.nextInt();
            randomNumber = rand.nextInt(min,(max+1));
            do{
                attempts = 0;
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                stat = (guess > randomNumber) ? "Larger":"Smaller";
                System.out.printf("Guess is %s than the answer\n", stat);
                attempts++;
            }while(guess != randomNumber);
            System.out.println("you took " + attempts + " attempts to guess " + randomNumber + ".");
            System.out.print("Would you like to play again? (y/n): ");
            replay = sc.next().charAt(0);
        }while(replay == 'y');
        sc.close();
    }
}

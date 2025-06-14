package Projects;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        //declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        String playerchoice;
        String CPUchoice;
        String input = "";
        do {
            //get choice from user
            System.out.print("Enter your move (rock, paper or scissors): ");
            playerchoice = scanner.nextLine().toLowerCase();
            if (!ValidChoice(playerchoice)) {
                System.out.println("Invalid Choice, try again");
                continue;
            }
            //get random choice from the CPU
            CPUchoice = choices[random.nextInt(choices.length)];
            System.out.println("CPU choice: " + CPUchoice);
            System.out.println(CheckWinner(playerchoice, CPUchoice));
            System.out.print("Do you want to play again (y/n): ");
            input = scanner.nextLine();
        }
        while(input.equals("y"));
        System.out.println("********************");
        System.out.println("Thank you for playing!");
        System.out.println("--------------------");
        scanner.close();
    }
    static boolean ValidChoice(String choice){
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){
            return true;
        }
        else{
            return false;
        }
    }
    static String CheckWinner(String human, String CPU){
        if(human.equalsIgnoreCase(CPU)){
            return "A Tie :(";
        }
        else if(human.equalsIgnoreCase("rock")&&CPU.equalsIgnoreCase("scissors")||human.equalsIgnoreCase("paper")&&CPU.equalsIgnoreCase("rock")||human.equalsIgnoreCase("scissors")&&CPU.equalsIgnoreCase("paper")){
            return "You WIN!!!";
        }
        else{
            return "You LOST!!!";
        }
    }
}

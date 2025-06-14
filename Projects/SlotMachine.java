package Projects;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SlotMachine {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet = 0;
        int payout = 0;
        String playagain;
        String[] row = new String[3];

        //display welcome message
        System.out.println("--------------------");
        System.out.println("Welcome to the Slot Machine!");
        System.out.println("Most suitable for gambling purposes!");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*******************");
        //play if our balance is greater than zero
        while (balance > 0){
            System.out.println("Current Balance: $" + balance);
            System.out.print("PLACE YOUR BET(whole numbers only): ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet > balance) {
                System.out.println("You cannot bet more than yor balance");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }
            else{
                balance -= bet;
            }
            Arrays.fill(row, " ");
            System.out.println("Spinning...");
            System.out.println("*******************");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                String symbol = spinRow();
                System.out.print(symbol);
                row[i] = symbol;
            }
            payout = getPayout(row, bet);
            System.out.println();
            System.out.println("*******************");
            if (payout > 0){
                System.out.println("You won $ " + payout + " dollars!");
                balance += payout;
            }
            else{
                System.out.println("You lost!");
            }
            System.out.print("Play again? y/n: ");
            playagain = scanner.nextLine();
            if (playagain.equalsIgnoreCase("n")){
                break;
            }
        }
        //display exit message
        System.out.println("-------------------");
        System.out.println("Thank you for playing Rudra Slot Machine!");
    }
    static String spinRow(){
        Random random = new Random();
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String symbol = symbols[random.nextInt(symbols.length)];
        return symbol;
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[0].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 4;
                case "🍉" -> bet * 6;
                case "🍋" -> bet * 8;
                case "🔔" -> bet * 14;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 7;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 7;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[0].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 7;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}

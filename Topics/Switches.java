package Topics;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        switch(name){
            case "Viraank" -> System.out.println("You wide");
            case "Mark" -> System.out.println("Filipino");
            case "Rudra" -> System.out.println("Goateeeeeeeeeeeeee");
            case "Matt" -> System.out.println("Greek");
            case "Akash" -> System.out.println("The game's trash");
            case "Ayan" -> System.out.println("Chiiiiiiiiiiiiiiiiiimbs");
            case "Victor","Devarsh" -> System.out.println("Stupid");
            default -> System.out.println("Who are you?");
        }
    }
}

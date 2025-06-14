package Projects;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        double price = 0;
        int quantity;
        char currency = '$';
        double total;
        System.out.println("Welcome to the shop, here you can buy Jaydens or Daisies.");
        System.out.println("One Jayden is $259.99 and one Daisy is 29.99");
        System.out.print("Who would you like to buy? Jayden or Daisy: ");
        name = scanner.nextLine();
        if (name.equals("Jayden")){
            price = 259.99;
        }
        else if (name.equals("Daisy")){
            price = 29.99;
        }
        else{
            System.out.println("Invalid input, restarting shop");
            System.exit(0);
        }
        System.out.print("How many " + name + " would you like to buy: ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("You bought "+ quantity + " " + name + "/s.");
        System.out.println("For a total price of " + currency + " " + price + ".");
        scanner.close();
    }
}

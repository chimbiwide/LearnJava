package Projects;

import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.print("Enter the username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4 and 12 symbols");
        }
        else if(username.contains(" ")||username.equalsIgnoreCase("Rudra")||username.contains("_")){
            System.out.println("username must not contain spaces or underscores");
            System.out.println("Username cannot be Rudra!!!");
        }
        else{
            System.out.printf("Welcome %s!\n", username);
        }
        scanner.close();
    }
}

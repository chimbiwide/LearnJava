package Topics;

import javax.swing.*;
import java.util.Scanner;
public class subStrings {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        // .substring(start,end);
        Scanner scanner = new Scanner(System.in);
        int index;
        String username;
        String domain;
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        if (email.contains("@")) {
            index = email.indexOf("@");
            username = email.substring(0, index);
            domain = email.substring(index + 1);
            System.out.printf("Your user name is %s \nyour domain is %s", username, domain);
        }
        else {
            System.out.println("Invalid Email");
            System.exit(1);
        }
        scanner.close();
    }
}

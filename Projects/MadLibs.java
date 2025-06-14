package Projects;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1, adj1, adj2, n1, n2, v1, v2, v3;
        System.out.print("Please enter a name: ");
        name1 = scanner.nextLine();
        System.out.print("Enter an adjective for a person: ");
        adj1 = scanner.nextLine();
        System.out.print("Enter another adjective for a person: ");
        adj2 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        n1 = scanner.nextLine();
        System.out.print("Enter a past participle verb: ");
        v1 = scanner.nextLine();
        System.out.print("Enter a verb in third person form: ");
        v2 = scanner.nextLine();
        System.out.print("Enter a place: ");
        n2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        v3 = scanner.nextLine();
        //output
        System.out.println("\nHere is your Story about a boy called " + name1 + "......");
        System.out.println(name1 + " is a " + adj1 + " guy");
        System.out.println("He is always " + adj2 + " when he is in math class");
        System.out.println("He is afraid of " + n1);
        System.out.println("Because he will get " + v1 + " by the " + n1);
        System.out.println("The next time he " + v2 + " to the " + n2);
        System.out.println(name1 + " needs to " + v3 + " for the " + n1);
        scanner.close();
    }
}

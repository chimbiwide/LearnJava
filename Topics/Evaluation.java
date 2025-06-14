package Topics;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight in pounds, in decimals? ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your age in years? ");
        int age = scanner.nextInt();
        System.out.println("What is your GPA?");
        double gpa = scanner.nextDouble();
        System.out.println("Are you black? (true/false)");
        boolean black = scanner.nextBoolean();
        //Evaluation
        System.out.println(" ");
        System.out.println("Evaluation complete.......");
        System.out.println("I am " + name + "!");
        System.out.println("I am " + age + " years old.");
        if (black) {
            System.out.println("Getting arrested");
        }
        if (!black) {
            System.out.println("You are fine");
        }
        System.out.println("I have a " + gpa + " gpa!");
        System.out.println("I am " + weight + " pounds!");
        if (gpa > 4){
            System.out.println("Honors student");
        }
        else if (gpa < 4 && gpa > 3){
            System.out.println("Level 1 royalty");
        }
        else if (gpa < 3 && gpa > 0){
            System.out.println("Level 2 warrior");
        }
        if (weight > 150) {
            System.out.println("So wide!");
        }
        else if(weight < 150 && weight > 0) {
            System.out.println("Get wide!");
        }
        else {
            System.out.println("I am not a human!");
        }
        scanner.close();
    }
}
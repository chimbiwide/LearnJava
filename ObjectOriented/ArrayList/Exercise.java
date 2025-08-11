package ObjectOriented.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfFood; i++) {
            System.out.printf("Enter a food # %d: ", i+1);
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}

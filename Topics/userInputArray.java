package Topics;
import java.util.Scanner;

public class userInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many foods do you like: ");
        int size = scanner.nextInt();
        //clear scanner buffer
        scanner.nextLine();
        String[] foods = new String[size];

        for (int i=0; i < foods.length; i++){
            System.out.print("What food do you like: ");
            foods[i] = scanner.nextLine();
        }
        for (String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }
}

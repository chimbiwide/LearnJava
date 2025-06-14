package Topics;
import java.util.Scanner;

public class SearchAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] age = {2,6,13,15,65,36,98};
        String[] fruits = {"Apple", "Banana", "Orange", "Pineapple"};
        boolean chosen = false;
        boolean terminate = false;
        String end = "y";
        while(!terminate) {
            do {
                System.out.print("Do you want to search for 'age' or 'fruit': ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("age")) {
                    System.out.print("Enter your age:");
                    int Int = scanner.nextInt();
                    binarySearch(age, Int);
                    chosen = true;
                } else if (choice.equalsIgnoreCase("fruit")) {
                    System.out.print("Enter your favorite fruit:");
                    String target = scanner.nextLine();
                    binarySearch(fruits, target);
                    chosen = true;
                } else {
                    System.out.println("Invalid choice");
                }
            }
            while (!chosen);
            System.out.println("------------------------");
        }
    }
    public static void binarySearch(int[] array, int target){
        boolean isFound = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                System.out.println("Found " + target + " at index " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Not found");
        }
    }
    public static void binarySearch(String[] array, String target){
        boolean isFound = false;
        for (int i = 0; i < array.length; i++){
            if (array[i].equalsIgnoreCase(target)){
                System.out.println("Found " + target + " at index " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Not found");
        }
    }

}

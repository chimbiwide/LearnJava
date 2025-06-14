package Topics;
import java.util.Arrays;

public class arrays {
    //Arrays = a collection of values of the same data type
    // *variable that can store more than one value
    public static void main(String[] args) {
        String[] fruit = {"Pineapple", "Banana", "Orange", "Apple"};

        //sort an array
        Arrays.sort(fruit);

        //fill an array with a given value
        Arrays.fill(fruit, "Rudra");
        //changes a specific element
        fruit[0] = "Blueberries";
        //get the length of an array
        int numofFruits = fruit.length;
        System.out.println(fruit[0]);
        System.out.println(numofFruits);

        for (int i = 0; i < fruit.length; i++){
            System.out.println(fruit[i]);
        }

        //enhanced for-loop
        for(String fruits : fruit){
            System.out.println(fruits);
        }
    }
}

package ObjectOriented.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args){

        //ArrayList = A resizeable array that stores objects (autoboxing).
        //            Arrays are fixed in size, but ArrayLists can change.

        //initiate a new arraylist
        ArrayList<String> fruit = new ArrayList<>();

        //add an item to the arraylist
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");

        //remove an item at a certain index
        fruit.remove(0);

        //set an item of a certain index to be something else
        fruit.set(0, "shit");

        //get the size of an arraylist
        int size = fruit.size();

        //obtain the item at a certain index
        System.out.println(fruit.get(1));

        //sort an arraylist
        Collections.sort(fruit);
        System.out.println(fruit);

        //iterate through an arraylist
        for (String fruits: fruit) {
            System.out.println(fruits);
        }
    }
}

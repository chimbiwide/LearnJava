package Topics;

public class TwoDArrays {
    public static void main(String[] args) {
        //2D Arrays = An array where each element is an array
        //            Useful for storing a matrix of data

        //this method creates a 3x3 matrix of foods
        String[] fruits = {"Apple", "Banana", "Orange"};
        String[] vegetables = {"potatoes", "carrots", "beans"};
        String[] meat = {"beef", "pork", "chicken"};
        String[][] groceries = {fruits, vegetables, meat};

        // this method works the same as above
        String[][] groceries2 = {{"Apple", "Banana", "Orange"},
                                {"potatoes", "carrots", "beans"},
                                {"beef", "pork", "chicken"}};

        //change an element in the 2D array
        // first [] is the row, second [] is the column
        groceries[2][1] = "fish";

        print2DArray(groceries);
    }
    static void print2DArray(String[][] array){
        for (String[] row : array){
            for (String item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

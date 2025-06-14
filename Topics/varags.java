package Topics;

public class varags {
    public static void main(String[] args) {
        //varags = allow a method to accept a varying number of arguments
        //         = makes methods more flexible, no need for overloaded methods
        //         = java will pack the arguments into an array
        //         = ...(ellipsis)

        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
        System.out.println(average(0));
    }
    static int add(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
    static double average(double... number){
        double sum = 0;

        if (number.length == 0){
            return 0;
        }
        for (double num : number){
            sum += num;
        }
        return sum / number.length;
    }
}

package Topics;

public class OverLoadedMethods {
    public static void main(String[] args) {
        //overloaded methods = methods that share the same name
        //                     but different parameters
        //                     signature = name + parameters
        String MacNCheese = MacNCheese("American","wide");
        System.out.println(MacNCheese + " Mac and Cheese");
    }
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static String MacNCheese(String cheese) {
        return cheese;
    }
    static String MacNCheese(String cheese, String mac) {
        return cheese + " " + mac;
    }
}

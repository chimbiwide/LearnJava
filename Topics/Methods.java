package Topics;
public class Methods {
    public static void main(String[] args) {
        int age = 2;
        boolean isAge = isAge(age);
        System.out.println(isAge);
    }

    static double sqrt(double x) {
        return Math.sqrt(x);
    }
    static String full(String first, String last) {
        return first + " " + last;
    }
    static boolean isAge(int age) {
        return age >= 18;
    }
}

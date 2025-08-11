package ObjectOriented.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {

        //Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                  to be used as objects. "Wrap them in am object"
        //                  Generally, don't wrap primitives unless you need an object.
        //                  Allow use of Collections Framework and static Utility Methods

        //autoboxing
        Integer a = 123;
        Double b = 3.12;
        Character c = 's';
        Boolean d = true;

        //unboxing
        int x = a;

        //Some utility methods

        String e = Integer.toString(123); //converting any primitive type to a String

        int f = Integer.parseInt("123"); //converting a String to a primitive type
        boolean g = Boolean.parseBoolean("ture");

        char h = "Pizza".charAt(0); //get a char at a certain index

        char letter = 'b';
        System.out.println(Character.isLetter(letter)); //checks if a char is a letter
        System.out.println(Character.isUpperCase(letter)); //checks if a char is a uppercase
    }
}

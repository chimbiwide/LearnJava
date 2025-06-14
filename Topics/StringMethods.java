package Topics;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Viraank";

        //length of a string
        int length = name.length();
        System.out.println(length);

        //char at a specific index
        char letter = name.charAt(1);
        System.out.println(letter);

        //the index of the first occurance of a specific char
        int index = name.indexOf("i");
        System.out.println(index);

        //the index of the last occurance of a specific char
        int lastindex = name.lastIndexOf("a");
        System.out.println(lastindex);

        //make the string upper case
        name = name.toUpperCase();
        System.out.println(name);

        //make the string lower case
        name = name.toLowerCase();
        System.out.println(name);

        //remove any spaces before or after the string
        String space = "    wide          ";
        space = space.trim();
        System.out.println(space);

        //replace any character with another character
        name = name.replace("a","A");
        System.out.println(name);

        //if a string is empty
        System.out.println(name.isEmpty());

        //if a string contains a certain character
        System.out.println(name.contains("V"));

        //if two strings are equal to each other
        System.out.println(name.equals("Viraank"));
        //ignore case sensitivity
        System.out.println(name.equalsIgnoreCase("viRaank"));
    }
}

package Topics;

public class Printf {
    public static void main(String[] args) {
        //printf formatting
        // %[flags][width][.precision][specifier-character]
        String name = "Jayden";
        char firstLetter = 'J';
        int age = 15;
        double height = 8.6;
        double networth = 1003264.243;
        double intellegence = -200.2567;
        boolean isEnrolled = true;

        //  %s for a string
        System.out.printf("Hello %s",name);
        //  %c for a char
        System.out.printf("\nYour name's first letter is %c", firstLetter);
        //  %d for an int
        System.out.printf("\nYour age is %d years old", age);
        // %f for a double
        System.out.printf("\nyour heigh is %f meters", height);
        // %b for boolean
        System.out.printf("\nyour enployed status is %b", isEnrolled);

        // type .digit-after-decimal to limit the decimal places
        System.out.printf("\nyour height is %.1f", height);


        //[flags]
        // + = output a plus
        // , = comma grouping separator(every 1000)
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        System.out.printf("\nyour height is %+.1f", height);
        System.out.printf("\nyour networth is %,.2f", networth);
        System.out.printf("\nyour intellegence is %(.3f", intellegence);
        System.out.printf("\nyour intellegence is % .3f", intellegence);


        //[width]
        // 0 = zero padding, after zero specify how many digits to pad to. Like 04.
        //number = right justified padding
        //negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("\nYour id is %-4d", id1);
        System.out.printf("\nYour id is %-4d", id2);
        System.out.printf("\nYour id is %-4d", id3);
        System.out.printf("\nYour id is %-4d", id4);
    }
}

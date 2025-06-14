package Topics;

import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        boolean black;
        black = random.nextBoolean();
        if (black) System.out.println("You are black.");
        else System.out.println("You are white.");
    }
}

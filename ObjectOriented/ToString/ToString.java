package ObjectOriented.ToString;

public class ToString {
    public static void main(String[] args) {
        // .toString() = Method inherited from the Object class
        //               Used to return a String representation of an object
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details

        Car car = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Rudra", "Vyas", 2009, "Black");

        System.out.println(car);
        System.out.println(car2);
    }
}

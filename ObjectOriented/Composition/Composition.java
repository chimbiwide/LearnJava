package ObjectOriented.Composition;

public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an engine is "part-of" a Car.
        //               Allows complex objects to be constructed from smaller objects

        Car car = new Car("Acura", 2012, "SHIT");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}

package ObjectOriented.ArrayOfObjects;

public class ArrayofObjects {
    public static void main(String[] args) {
        /*
        Car car1 = new Car("Tesla", "white");
        Car car2 = new Car("Toyota", "Red");
        Car car3 = new Car("Marcedes", "Gold");

         */

        //initiating objects within an array; each element is called an anonymous object
        Car[] cars = {new Car("Tesla", "white"),
                      new Car("Toyota", "Red"),
                      new Car("Marcedes", "Gold")};

        for (Car car : cars) {
            car.color = "White";
        }

        for (Car car : cars) {
            car.drive();
        }
    }
}

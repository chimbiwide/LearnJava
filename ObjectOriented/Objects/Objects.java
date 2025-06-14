package ObjectOriented.Objects;

public class Objects {
    public static void main(String[] args) {
        /*
        Object = An entity that holds data (attributes)
                and can perform actions (methods)
                It is a refernece data type
         */

        car car = new car();

        //print specific attributes of an object
        System.out.println(car.make);

        //change specific attributes of an object
        car.year = 1989;

        //access a specific method of the object
        car.start();
        car.stop();
        car.drive();
        car.brake();
    }
}
package ObjectOriented.GettersSetters;

public class GettersSetters {
    public static void main(String[] args){
        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = Methods that make a field READABLE
        //SETTERS = Methods that make a field WRITEABLE

        Car car = new Car("Acura", "Black", 2012);

        car.setColor("grey");
        car.setPrice(-10);

        System.out.println(car.getModel() + car.getColor() + car.getPrice());
    }
}

package ObjectOriented.Objects;

public class car {
    String make = "Tesla";
    String model = "T4";
    int year = 2025;
    double price = 52400.48;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You starte the engine");
    }
    void stop() {
        isRunning = false;
        System.out.println("You stopped the engine");
    }
    void drive() {
        System.out.printf("You drive the %s model %s that is made in %d and is worth %f dollars \n", make,model,year,price);
    }

    void brake() {
        System.out.printf("You brake the %s \n", make);
    }
}

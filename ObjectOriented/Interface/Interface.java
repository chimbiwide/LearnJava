package ObjectOriented.Interface;

public class Interface {
    public static void main(String[] args){

        //Interface = A blueprint for a class that specifies a set of abstract methods
        //            that implementing classes MUST define.
        //            Supports multiple inheritance-like behavior.

        rabbit rabbit = new rabbit();
        rabbit.flee();

        hawk hawk = new hawk();
        hawk.hunt();

        fish fish = new fish();
        fish.flee();
        fish.hunt();
    }
}

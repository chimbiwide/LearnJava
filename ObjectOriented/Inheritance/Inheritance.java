package ObjectOriented.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        //Inheritance = one class inherits the attributes and methods from another class
        //          child <- parent <- Grand-parent
        //          multi-level inheritance

        Dog dog = new Dog();
        Cat cat = new Cat();
        plant plant = new plant();
        if (dog.isAlive && cat.isAlive && plant.isAlive){
            System.out.println("They are alive");
        }
        dog.eat();
        cat.eat();
        plant.photosynthesis();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

    }
}

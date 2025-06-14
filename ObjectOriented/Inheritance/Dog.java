package ObjectOriented.Inheritance;

public class Dog extends Animal{
    //To inherit another class, add the "extends" keyword followed by the class
    int lives = 1;
    void speak(){
        System.out.println("The dog goes woof");
    }
}

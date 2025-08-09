package ObjectOriented.Abstraction;

public class Abstraction {
    public static void main(String[] args) {

        /*
        Abstract = used to define abstract classes and methods.
                   Abstraction is the process of hiding implementation details
                   and showing only the essential features;
                   Abstract classes CAN'T be instantiated directly
                   Can contain 'abstract' methods (which must be implemented)
                   can contain ''concrete; methods (which are inherited)
         */

        Circle circle = new Circle(2.3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(5.9,3.6);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
